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
        prepStmt.setBigDecimal(2, li.getN_añoImpuesto()); 
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
    
    public Liquidacion getLi() {
        return li;
    }

    public void setLi(Liquidacion li) {
        this.li = li;
    }

}
