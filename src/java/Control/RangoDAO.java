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
    public Rango getR() {
        return r;
    }

    public void setR(Rango r) {
        this.r = r;
    }

}
