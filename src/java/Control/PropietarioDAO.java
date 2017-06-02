/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modelo.Linea;
import util.CaException;
import util.ServiceLocator;
import Modelo.Propietario;

/**
 *
 * @author DANNY
 */
public class PropietarioDAO {

    private static Propietario pr;

    public PropietarioDAO(){
        pr = new Propietario();
    }
    
    public void incluirPropietario() throws CaException {
      try {
      
        String strSQL = "INSERT INTO propietario (k_cedula, n_nombre, n_direccion, n_ciudad, n_departamento) VALUES(?,?,?,?,?)";
        Connection conexion = ServiceLocator.getInstance().tomarConexion();
        PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
        prepStmt.setString(1,pr.getK_cedula()); 
        prepStmt.setString(2, pr.getN_nombre() ); 
        prepStmt.setString(3, pr.getN_direccion()); 
        prepStmt.setString(4, pr.getN_departamento()); 
        prepStmt.executeUpdate();
        prepStmt.close();
        ServiceLocator.getInstance().commit();
      } catch (SQLException e) {
           throw new CaException( "PropietarioDAO", "No pudo crear el municipio"+ e.getMessage());
      }  finally {
         ServiceLocator.getInstance().liberarConexion();
      }
      
    }
    public static Propietario getPr() {
        return pr;
    }

    public void setPr(Propietario pr) {
        this.pr = pr;
    }

    
}
