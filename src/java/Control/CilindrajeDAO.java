package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modelo.Cilindraje;
import java.math.BigDecimal;
import util.CaException;
import util.ServiceLocator;


/**
 *
 * @author DANNY
 */
public class CilindrajeDAO {
    private static Cilindraje c;

    public CilindrajeDAO() {
        c = new Cilindraje();
    }

    /*
    Espacio destinado para operaciones sql
    */
    
    public void buscarCilindraje() throws CaException{
        try{
            String strSQL = "SELECT k_idcilindraje, k_linea, k_modelo, v_basegravable FROM cilindraje WHERE k_idcilindraje = ? and k_linea = ? and k_modelo = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, c.getK_idCilindraje());
            prepStmt.setString(2, c.getK_idL());
            prepStmt.setBigDecimal(3, c.getK_modelo());
            ResultSet rs = prepStmt.executeQuery();
            while(rs.next()){
                c.setK_idCilindraje(rs.getString(1));
                c.setK_idL(rs.getString(2));
                c.setK_modelo(rs.getBigDecimal(3));
                c.setV_valorBG(rs.getLong(4));
            }
        }catch(SQLException e){
            throw new CaException("CilidrajeDAO", "no se pudo realzar la conexion");
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        }
    }
        public void BuscarBaseGravable(String idCilindraje, String idLinea, BigDecimal modelo) throws CaException {
        try {
            String strSQL = "SELECT (v_basegravable*1000) FROM cilindraje WHERE k_idcilindraje = ? and k_linea = ? and k_modelo = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, idCilindraje);
            prepStmt.setString(2, idLinea);
            prepStmt.setBigDecimal(3, modelo);
            ResultSet rs = prepStmt.executeQuery();
            while(rs.next()){
                c.setV_valorBG(rs.getLong(1));
            }
        } catch (SQLException e) {
            throw new CaException("LiquidacionDAO", "no se pudo hallar la base gravable");
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    
    public Cilindraje getC() {
        return c;
    }

    public void setC(Cilindraje c) {
        this.c = c;
    }
    
}
