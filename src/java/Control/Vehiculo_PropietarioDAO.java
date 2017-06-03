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
    
    
    public void buscarVehiculo() throws CaException{
        try{
            String strSQL = "SELECT k_placa, k_cedula, f_compra FROM vehiculo_propietario WHERE k_placa = ? and k_cedula = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, vp.getK_placa());
            prepStmt.setInt(2,vp.getK_cedula());
            ResultSet rs = prepStmt.executeQuery();
            while(rs.next()){
                vp.setK_placa(rs.getString(1));
                vp.setK_cedula(rs.getInt(2));
                vp.setF_compra(rs.getDate(3));
            }
        }catch(SQLException e){
            throw new CaException("vehiculo_propietario", "no se pudo realizar la busqueda");
        }
    }
    
    public Vehiculo_Propietario getVp() {
        return vp;
    }

    public void setVp(Vehiculo_Propietario vp) {
        this.vp = vp;
    }

}
