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
    public Parametros getP() {
        return p;
    }

    public void setP(Parametros p) {
        this.p = p;
    }

}
