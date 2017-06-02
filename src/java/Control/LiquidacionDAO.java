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
import Control.CaException;
import Control.ServiceLocator;

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
      
        String strSQL = "INSERT INTO liquidacion (k_idLiquidacion, n_añoImpuesto, v_total, v_pagoVoluntario, v_dstoPronto, v_semaforizacion, v_impuesto, "
                + "v_baseGravable, k_placa, k_cedula, k_añoImpuesto) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        Connection conexion = ServiceLocator.getInstance().tomarConexion();
        PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
        prepStmt.setString(1, li.getK_idLiquidacion()); 
        prepStmt.setString(2, li.getN_añoImpuesto()); 
        prepStmt.setDouble(3, li.getV_total()); 
        prepStmt.setDouble(4, li.getV_pagoVoluntario()); 
        prepStmt.setDouble(5, li.getV_dstoPronto());
        prepStmt.setDouble(6, li.getV_semaforizacion());
        prepStmt.setDouble(7, li.getV_impuesto());
        prepStmt.setDouble(8, li.getV_baseGravable());
        prepStmt.setString(9, li.getK_placa());
        prepStmt.setString(10, li.getK_cedula());
        prepStmt.setString(11, li.getK_añoImpuesto());
        
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
