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
import util.CaException;
import util.ServiceLocator;
import Modelo.Marca;

/**
 *
 * @author DANNY
 */
public class MarcaDAO {

    private Marca m;

    public MarcaDAO() {
        m = new Marca();
    }

    /*
    Espacio destinado para operaciones sql
     */
    
    public void buscarMarca() throws CaException{
        try{
            String strSQL = "SELECT k_idmarca, n_nombre FROM marca WHERE k_idmarca = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, m.getK_idM());
            ResultSet rs = prepStmt.executeQuery();
            while(rs.next()){
                m.setK_idM(rs.getInt(1));
                m.setN_nombreM(rs.getString(2));
            }
        }catch(SQLException e){
            throw new CaException("MarcaDAO", "no se pudo realizar la busqueda");
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    
    public void buscarIdMarca(String nMarca) throws CaException{
        try{
            String strSQL = "SELECT k_idmarca FROM marca WHERE n_nombre = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, nMarca);
            ResultSet rs = prepStmt.executeQuery();
            while(rs.next()){
                m.setK_idM(rs.getInt(1));
                m.setN_nombreM(nMarca);
            }
        }catch(SQLException e){
            
            throw new CaException("MarcaDAO", e.getCause().toString()); 
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        }
    }
            
    public Marca getM() {
        return m;
    }

    public void setM(Marca m) {
        this.m = m;
    }
}
