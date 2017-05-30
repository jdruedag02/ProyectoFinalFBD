package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modelo.Cilindraje;
import Control.CaException;
import Control.ServiceLocator;


/**
 *
 * @author DANNY
 */
public class CilindrajeDAO {
    private Cilindraje c;

    public CilindrajeDAO(Cilindraje cilindraje) {
        c = cilindraje;
    }

    /*
    Espacio destinado para operaciones sql
    */
    
    public Cilindraje getC() {
        return c;
    }

    public void setC(Cilindraje c) {
        this.c = c;
    }
    
}
