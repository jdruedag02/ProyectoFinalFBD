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

/**
 *
 * @author DANNY
 */
public class LineaDAO {

    private Linea l;

    public LineaDAO(Linea linea) {
        l = linea;
    }

    /*
    Espacio destinado para operaciones sql
     */
    public Linea getL() {
        return l;
    }

    public void setL(Linea l) {
        this.l = l;
    }

}
