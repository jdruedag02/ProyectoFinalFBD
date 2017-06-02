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
    public static Linea getL() {
        return l;
    }

    public void setL(Linea l) {
        this.l = l;
    }

}
