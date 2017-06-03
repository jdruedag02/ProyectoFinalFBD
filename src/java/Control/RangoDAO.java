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
    
    public void buscarRango() throws CaException{
        try{
            String strSQL = "SELECT k_idrango, v_minimo, v_maximo, t_tarifa, k_añoimpuesto FROM rango WHERE k_idrango = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, r.getK_idR());
            ResultSet rs = prepStmt.executeQuery();
            while(rs.next()){
                r.setK_idR(rs.getInt(1));
                r.setV_minimo(rs.getLong(2));
                r.setV_maximo(rs.getLong(3));
                r.setV_tarifa(rs.getFloat(4));
                r.setK_añoParametro(rs.getBigDecimal(5));
            }
        }catch(SQLException e){
            throw new CaException("rangoDAO", "no se pudo realizar la busqueda");
        }
    }
    public Rango getR() {
        return r;
    }

    public void setR(Rango r) {
        this.r = r;
    }

}
