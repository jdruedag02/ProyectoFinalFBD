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
import Modelo.Parametros;

/**
 *
 * @author DANNY
 */
public class ParametrosDAO {

    private Parametros p;

    public ParametrosDAO() {
        p = new Parametros();
    }

    /*
    Espacio destinado para operaciones sql
     */
    
    public void buscarParametros() throws CaException{
        try{
            String strSQL = "SELECT k_añoimpuesto, v_semaforizacion, f_descuento, f_limite, t_descuento, t_volunt FROM parametros WHERE k_añoimpuesto = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setBigDecimal(1, p.getK_añoImpuesto());
            ResultSet rs = prepStmt.executeQuery();
            while(rs.next()){
                p.setK_añoImpuesto(rs.getBigDecimal(1));
                p.setV_semaforizacion(rs.getInt(2));
                p.setF_descto(rs.getDate(3));
                p.setF_limite(rs.getDate(4));
                p.setV_descuento(rs.getShort(5));
                p.setT_voluntario(rs.getShort(6));
            }
        }catch(SQLException e){
            throw new CaException("ParametrosDAO", "no se pudo realizar la busqueda");
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    
    public Parametros getP() {
        return p;
    }

    public void setP(Parametros p) {
        this.p = p;
    }

}
