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
import java.math.BigDecimal;
import java.util.ArrayList;

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
      
        String strSQL = "INSERT INTO pago (k_refpago, f_pago, v_valorpago, n_banco, n_formapago, k_liquidacion) VALUES(?,?,?,?,?,?)";
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
            String strSQL = "SELECT k_refpago, f_pago, v_valorpago, n_banco, n_formapago, k_liquidacion FROM pago where k_refpago = ?";
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
    
    public ResultSet buscarPagoCedula(int cedula) throws CaException{
        try{
            String strSQL = "SELECT k_refpago, f_pago, v_valorpago, n_banco, n_formapago, k_liquidacion FROM pago, liquidacion WHERE k_liquidacion = k_idliquidacion and k_cedula = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, cedula);
            ResultSet rs = prepStmt.executeQuery();
            return rs;
        }catch(SQLException e){
            throw new CaException("PagoDAO", "no se pudo realizar la busqueda");
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    
    public ResultSet buscarPagoPlaca(String placa) throws CaException{
        try{
            String strSQL = "SELECT k_refpago, f_pago, v_valorpago, n_banco, n_formapago, k_liquidacion FROM pago, liquidacion WHERE k_liquidacion = k_idliquidacion and k_placa = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, placa);
            ResultSet rs = prepStmt.executeQuery();
            return rs;
        }catch(SQLException e){
            throw new CaException("PagoDAO", "no se pudo realizar la busqueda");
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    
    public ResultSet buscarPagoAnio(String anio) throws CaException{
        try{
            String strSQL = "SELECT k_refpago, f_pago, v_valorpago, n_banco, n_formapago, k_liquidacion FROM pago, liquidacion WHERE k_liquidacion = k_idliquidacion and k_añoimpuesto = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setBigDecimal(1, BigDecimal.valueOf(Integer.valueOf(anio)));
            ResultSet rs = prepStmt.executeQuery();
            return rs;
        }catch(SQLException e){
            throw new CaException("PagoDAO", "no se pudo realizar la busqueda");
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    
    public ResultSet buscarPagoPlacaCedula(String placa, int cedula) throws CaException{
        try{
            String strSQL = "SELECT k_refpago, f_pago, v_valorpago, n_banco, n_formapago, k_liquidacion FROM pago, liquidacion WHERE k_liquidacion = k_idliquidacion and k_cedula = ? and k_placa = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, cedula);
            prepStmt.setString(2, placa);
            ResultSet rs = prepStmt.executeQuery();
            return rs;
        }catch(SQLException e){
            throw new CaException("PagoDAO", "no se pudo realizar la busqueda");
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    
    public ArrayList<Pago> listarPago() throws CaException {
        ArrayList<Pago> pagos = new ArrayList<Pago>();

        try{
            String strSQL = "SELECT * FROM pago";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            //prepStmt.setInt(1, p.getK_refPago());
            ResultSet rs = prepStmt.executeQuery();
            while(rs.next()){
                p.setK_refPago(rs.getInt(1));
                p.setF_pago(rs.getDate(2));
                p.setV_vlrPagado(rs.getLong(3));
                p.setN_banco(rs.getString(4));
                p.setN_forPago(rs.getString(5));
                p.setK_idLiquidacion(rs.getInt(6));
                
                pagos.add(p);
            }
        }catch(SQLException e){
            throw new CaException("PagoDAO", "no se pudo realizar la busqueda");
        }  
         return pagos;
    }
    public Pago getP() {
        return p;
    }

    public void setP(Pago p) {
        this.p = p;
    }

}
