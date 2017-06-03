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
import Modelo.Rango;

/**
 *
 * @author DANNY
 */
public class RangoDAO {

    private Rango r;

    public RangoDAO() {
        r = new Rango();
    }

    /*
    Espacio destinado para operaciones sql
     */
    
    public void buscarRangoParticular(long baseGravable) throws CaException{
        try{
            String strSQL = "SELECT k_idrango, v_minimo, v_maximo, t_tarifa, k_añoimpuesto, n_tiporan FROM rango WHERE ? > v_minimo and ? < v_maximo";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setLong(1, baseGravable);
            prepStmt.setLong(2, baseGravable);
            ResultSet rs = prepStmt.executeQuery();
            while(rs.next()){
                r.setK_idR(rs.getInt(1));
                r.setV_minimo(rs.getLong(2));
                r.setV_maximo(rs.getLong(3));
                r.setV_tarifa(rs.getFloat(4));
                r.setK_añoParametro(rs.getBigDecimal(5));
                r.setN_tiporan(rs.getString(6));
            }
        }catch(SQLException e){
            throw new CaException("rangoDAO", "no se pudo realizar la busqueda particular");
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    
    public void buscarRangoMoto() throws CaException{
        try{
            String strSQL = "SELECT k_idrango, v_minimo, v_maximo, t_tarifa, k_añoimpuesto, n_tiporan FROM rango WHERE n_tiporan = 'motocicleta'";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            ResultSet rs = prepStmt.executeQuery();
            while(rs.next()){
                r.setK_idR(rs.getInt(1));
                r.setV_minimo(rs.getLong(2));
                r.setV_maximo(rs.getLong(3));
                r.setV_tarifa(rs.getFloat(4));
                r.setK_añoParametro(rs.getBigDecimal(5));
                r.setN_tiporan(rs.getString(6));
            }
        }catch(SQLException e){
            throw new CaException("RangoDAO", "no se pudo realizas busqueda moto");
        }finally{
            ServiceLocator.getInstance().close();
        }
    }
    
    
    public void buscarRangoPublico() throws CaException{
        try{
            String strSQL = "SELECT k_idrango, v_minimo, v_maximo, t_tarifa, k_añoimpuesto, n_tiporan FROM rango WHERE n_tiporan = 'publico'";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            ResultSet rs = prepStmt.executeQuery();
            while(rs.next()){
                r.setK_idR(rs.getInt(1));
                r.setV_minimo(rs.getLong(2));
                r.setV_maximo(rs.getLong(3));
                r.setV_tarifa(rs.getFloat(4));
                r.setK_añoParametro(rs.getBigDecimal(5));
                r.setN_tiporan(rs.getString(6));
            }
        }catch(SQLException e){
            throw new CaException("RangoDAO", "no se pudo realizar busqueda publico");
        }finally{
            ServiceLocator.getInstance().close();;
        }
    }
    
    public Rango getR() {
        return r;
    }

    public void setR(Rango r) {
        this.r = r;
    }

}
