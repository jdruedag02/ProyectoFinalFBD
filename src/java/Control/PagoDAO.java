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
      
        String strSQL = "INSERT INTO pago (k_refpago, f_pago, v_valorpago, n_banco, n_formapago, k_idLiquidacion) VALUES(?,?,?,?,?,?)";
        Connection conexion = ServiceLocator.getInstance().tomarConexion();
        PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
        prepStmt.setInt(1,p.getK_refPago()); 
        prepStmt.setDate(2, p.getF_pago() ); 
        prepStmt.setLong(3, p.getV_vlrPagado()); 
        prepStmt.setString(4, p.getN_banco()); 
        prepStmt.setString(5, p.getN_forPago());
        prepStmt.setInt(6, p.getK_idLiquidacion());
        prepStmt.executeUpdate();
        prepStmt.close();
        ServiceLocator.getInstance().commit();
      } catch (SQLException e) {
           throw new CaException( "PagoDAO", "No pudo crear el pago"+ e.getMessage());
      }  finally {
         ServiceLocator.getInstance().liberarConexion();
      }
    }
    
    public void buscarPago() throws CaException{
        try{
            String strSQL = "SELECT k_refpago, f_pago, v_valorpago, n_banco, n_formapago, k_idLiquidacion FROM pago where k_refpago = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, p.getK_refPago());
            ResultSet rs = prepStmt.executeQuery();
            while(rs.next()){
                p.setK_refPago(rs.getInt(1));
                p.setF_pago(rs.getDate(2));
                p.setV_vlrPagado(rs.getLong(3));
                p.setN_banco(rs.getString(4));
                p.setN_forPago(rs.getString(5));
                p.setK_idLiquidacion(rs.getInt(6));
            }
        }catch(SQLException e){
            throw new CaException("PagoDAO", "no se pudo realizar la busqueda");
        }finally{
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
