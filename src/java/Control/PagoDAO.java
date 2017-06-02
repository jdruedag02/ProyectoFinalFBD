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
import Control.CaException;
import Control.ServiceLocator;
import Modelo.Pago;

/**
 *
 * @author DANNY
 */
public class PagoDAO {

    private Pago p;

    public PagoDAO() {
        p = new Pago();
    }

    /*
    Espacio destinado para operaciones sql
     */
    public Pago getP() {
        return p;
    }

    public void setP(Pago p) {
        this.p = p;
    }

}
