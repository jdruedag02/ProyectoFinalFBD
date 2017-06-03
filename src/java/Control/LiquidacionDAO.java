/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Liquidacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.CaException;
import util.ServiceLocator;

/**
 *
 * @author DANNY
 */
public class LiquidacionDAO {

    private static Liquidacion li;

    public LiquidacionDAO() {
        li = new Liquidacion();
    }

    public void incluirLiquidacion() throws CaException{
        try {
      
        String strSQL = "INSERT INTO liquidacion (k_idliquidacion, n_añoliquidacion, v_totalpago, v_pagovoluntario, v_descprontopago, v_semaforizacion, v_impuesto, "
                + "v_basegravable, k_placa, k_cedula, k_añoimpuesto) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        Connection conexion = ServiceLocator.getInstance().tomarConexion();
        PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
        prepStmt.setInt(1, li.getK_idLiquidacion()); 
        prepStmt.setBigDecimal(2, li.getN_añoLiquidacion()); 
        prepStmt.setLong(3, li.getV_total()); 
        prepStmt.setLong(4, li.getV_pagoVoluntario()); 
        prepStmt.setLong(5, li.getV_dstoPronto());
        prepStmt.setInt(6, li.getV_semaforizacion());
        prepStmt.setLong(7, li.getV_impuesto());
        prepStmt.setLong(8, li.getV_baseGravable());
        prepStmt.setString(9, li.getK_placa());
        prepStmt.setInt(10, li.getK_cedula());
        prepStmt.setBigDecimal(11, li.getK_añoImpuesto());
        
        prepStmt.executeUpdate();
        prepStmt.close();
        ServiceLocator.getInstance().commit();
      } catch (SQLException e) {
           throw new CaException( "LiquidacionDAO", "No pudo crear la liquidacion"+ e.getMessage());
      }  finally {
         ServiceLocator.getInstance().liberarConexion();
      }
    }
    
    public void buscarLiquidacion() throws CaException{
        try{
            String strSQL = "SELECT k_idliquidacion, n_añoliquidacion, v_totalpago, v_pagovoluntario, v_descprontopago, v_semaforizacion, v_impuesto, v_basegravable, k_placa, k_cedula, k_añoimpuesto FROM liquidacion WHERE k_idliquidacion = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, li.getK_idLiquidacion());
            ResultSet rs = prepStmt.executeQuery();
            while(rs.next()){
                li.setK_idLiquidacion(rs.getInt(1));
                li.setN_añoLiquidacion(rs.getBigDecimal(2));
                li.setV_total(rs.getLong(3));
                li.setV_pagoVoluntario(rs.getLong(4));
                li.setV_dstoPronto(rs.getLong(5));
                li.setV_semaforizaion(rs.getInt(6));
                li.setV_impuesto(rs.getLong(7));
                li.setV_baseGravable(rs.getLong(8));
                li.setK_placa(rs.getString(9));
                li.setK_cedula(rs.getInt(10));
                li.setK_añoImpuesto(rs.getBigDecimal(11));
            }
        }catch(SQLException e){
            throw new CaException("liquidacionDAO", "no se pudo realizar la busqueda");
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    
    public Liquidacion getLi() {
        return li;
    }

    public void setLi(Liquidacion li) {
        this.li = li;
    }

}
