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

public class CargaDAO {
    
    public void insertarMarcas() throws CaException{
        try{
            String strSQL = "COPY marca from 'C:\\csv\\marcas.csv' DELIMITERS ';' CSV";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            ResultSet rs = prepStmt.executeQuery();
           
        }catch(SQLException e){
            throw new CaException("CargaDAO", "no se pudo realzar la conexion");
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    
    public void insertarLineas() throws CaException{
        try{
            String strSQL = "COPY linea from 'C:\\csv\\lineas.csv' DELIMITERS ';' CSV";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            ResultSet rs = prepStmt.executeQuery();
           
        }catch(SQLException e){
            throw new CaException("CargaDAO", "no se pudo realzar la conexion");
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    
    
    public void insertarCilindrajes() throws CaException{
        try{
            String strSQL = "COPY cilindraje from 'C:\\csv\\cilindraje.csv' DELIMITERS ';' CSV";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            ResultSet rs = prepStmt.executeQuery();
           
        }catch(SQLException e){
            throw new CaException("CargaDAOs", "no se pudo realzar la conexion");
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        }
    }
}
