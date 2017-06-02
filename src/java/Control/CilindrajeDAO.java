package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modelo.Cilindraje;
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
    
    public static Cilindraje getC() {
        return c;
    }

    public void setC(Cilindraje c) {
        this.c = c;
    }
    
}
