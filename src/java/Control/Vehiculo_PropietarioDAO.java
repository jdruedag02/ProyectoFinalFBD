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
import Modelo.Vehiculo_Propietario;

/**
 *
 * @author DANNY
 */
public class Vehiculo_PropietarioDAO {

    private Vehiculo_Propietario vp;

    public Vehiculo_PropietarioDAO() {
        vp = new Vehiculo_Propietario();
    }

    /*
    Espacio destinado para operaciones sql
     */
    
    public void incluirVehiculo_propietario() throws CaException{
        try{
            String strSQL = "INSERT INTO propietario (k_placa, k_cedula, f_compra) VALUES(?,?,?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, vp.getK_placa());
            prepStmt.setInt(2, vp.getK_cedula());
            prepStmt.setDate(3, vp.getF_compra());
        }catch(SQLException e){
            throw new CaException("Vehiculo_propietarioDAO", "no se puedo conectar");            
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        }  
    }
    
    
    public Vehiculo_Propietario getVp() {
        return vp;
    }

    public void setVp(Vehiculo_Propietario vp) {
        this.vp = vp;
    }

}
