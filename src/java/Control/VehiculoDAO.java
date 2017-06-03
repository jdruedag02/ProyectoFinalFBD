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
import Modelo.Vehiculo;

/**
 *
 * @author DANNY
 */
public class VehiculoDAO {

    private Vehiculo v;

    public VehiculoDAO() {
        v = new Vehiculo();
    }

    /*
    Espacio destinado para operaciones sql
     */
    
    public void incluirVehiculo() throws CaException{
        try{
            String strSQL = "INSERT INTO vehiculo (k_idplaca, n_uso, v_cilindraje, n_tipo, k_marca, k_cilindraje, k_linea, k_modelo) VALUES(?,?,?,?,?,?,?,?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, v.getK_placa());
            prepStmt.setString(2, v.getN_uso());
            prepStmt.setBigDecimal(3,v.getN_cilindraje());
            prepStmt.setString(4, v.getN_tipo());
            prepStmt.setInt(5, v.getK_idM());
            prepStmt.setString(6, v.getK_idCilindraje());
            prepStmt.setString(7,v.getK_idL());
            prepStmt.setBigDecimal(8, v.getK_modelo());
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();
            
        }catch (SQLException e){
            throw new CaException("VehiculoDAO", "no se pudo incluir vehiculo");
        } finally{
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    
    
    public void buscarVehiculo() throws CaException{
        try{
            String strSQL = "SELECT k_idplaca, n_uso, v_cilindraje, n_tipo, k_marca, k_cilindraje, k_linea, k_modelo FROM vehiculo WHERE k_idplaca = ? ";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, v.getK_placa());
            ResultSet rs = prepStmt.executeQuery();
            while(rs.next()){
                v.setK_placa(rs.getString(1));
                v.setN_uso(rs.getString(2));
                v.setN_cilindraje(rs.getBigDecimal(3));
                v.setN_tipo(rs.getString(4));
                v.setK_idM(rs.getInt(5));
                v.setK_idCilindraje(rs.getString(6));
                v.setK_idL(rs.getString(7));
                v.setK_modelo(rs.getBigDecimal(8));
                
            }
        }catch(SQLException e){
            throw new CaException("vehiculoDAO", "no se pudo realizar la busqueda");
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    
    public Vehiculo getV() {
        return v;
    }

    public void setV(Vehiculo v) {
        this.v = v;
    }

}
