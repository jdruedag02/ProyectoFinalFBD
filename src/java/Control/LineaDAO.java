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

/**
 *
 * @author DANNY
 */
public class LineaDAO {

    private static Linea l;

    public LineaDAO() {
        l = new Linea();
    }

    /*
    Espacio destinado para operaciones sql
     */
    
    public void buscarLinea() throws CaException{
        try{
            String strSQL = "SELECT k_idlinea, n_nombre, k_marca FROM linea WHERE k_idlinea = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, l.getK_idL());
            ResultSet rs = prepStmt.executeQuery();
            while(rs.next()){
                l.setK_idL(rs.getString(1));
                l.setN_nombreL(rs.getString(2));
                l.setK_idM(rs.getInt(3));
            }
        }catch(SQLException e){
            throw new CaException("LineaDAO", "No se pudo hacer busqueda");
        }
    }
    
    public static Linea getL() {
        return l;
    }

    public void setL(Linea l) {
        this.l = l;
    }

}
