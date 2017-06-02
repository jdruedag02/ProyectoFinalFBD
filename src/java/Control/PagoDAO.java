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
import Modelo.Pago;

/**
 *
 * @author DANNY
 */
public class PagoDAO {

    private Pago p;

    public PagoDAO() {
        p = new Pago();
    }

    public void incluirPago() throws CaException {
      try {
      
        String strSQL = "INSERT INTO pago (k_refPago, f_pago, v_vlrPagado, n_banco, n_forPago, k_idLiquidacion) VALUES(?,?,?,?,?,?)";
        Connection conexion = ServiceLocator.getInstance().tomarConexion();
        PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
        prepStmt.setString(1,p.getK_refPago()); 
        prepStmt.setString(2, p.getF_pago() ); 
        prepStmt.setDouble(3, p.getV_vlrPagado()); 
        prepStmt.setString(4, p.getN_banco()); 
        prepStmt.setString(5, p.getN_forPago());
        prepStmt.setString(6, p.getK_idLiquidacion());
        prepStmt.executeUpdate();
        prepStmt.close();
        ServiceLocator.getInstance().commit();
      } catch (SQLException e) {
           throw new CaException( "PagoDAO", "No pudo crear el pago"+ e.getMessage());
      }  finally {
         ServiceLocator.getInstance().liberarConexion();
      }
      
    }
    public Pago getP() {
        return p;
    }

    public void setP(Pago p) {
        this.p = p;
    }

}
