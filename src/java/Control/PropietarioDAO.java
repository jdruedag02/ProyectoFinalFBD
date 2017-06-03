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
      
        String strSQL = "INSERT INTO propietario (k_idcedula, n_tipodoc, n_nombre, n_direccion, n_ciudad, n_departamento) VALUES(?,?,?,?,?,?)";
        Connection conexion = ServiceLocator.getInstance().tomarConexion();
        PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
        prepStmt.setInt(1, pr.getK_cedula());
        prepStmt.setString(2, pr.getN_tipoDoc());
        prepStmt.setString(3, pr.getN_nombre() ); 
        prepStmt.setString(4, pr.getN_direccion());
        prepStmt.setString(5, pr.getN_ciudad());
        prepStmt.setString(6, pr.getN_departamento()); 
        prepStmt.executeUpdate();
        prepStmt.close();
        ServiceLocator.getInstance().commit();
      } catch (SQLException e) {
           throw new CaException( "PropietarioDAO", "No pudo crear el propietario "+ e.getMessage()+"--");
      }  finally {
         ServiceLocator.getInstance().liberarConexion();
      } 
    }
    
    public void buscarPropietario() throws CaException{
        try{
            String strSQL = "SELECT k_idcedula, n_tipodoc, n_nombre, n_direccion, n_ciudad, n_departamento FROM propietario WHERE k_idcedula = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, pr.getK_cedula());
            ResultSet rs = prepStmt.executeQuery();
            while(rs.next()){
                pr.setK_cedula(rs.getInt(1));
                pr.setN_tipoDoc(rs.getString(2));
                pr.setN_nombre(rs.getString(3));
                pr.setN_direccion(rs.getString(4));
                pr.setN_ciudad(rs.getString(5));
                pr.setN_departamento(rs.getString(6));
                
            }
        }catch(SQLException e){
            throw new CaException("propietarioDAO", "no se pudo realizar la busqueda");
        }
    }
    
    public static Propietario getPr() {
        return pr;
    }

    public void setPr(Propietario pr) {
        this.pr = pr;
    }

    
}
