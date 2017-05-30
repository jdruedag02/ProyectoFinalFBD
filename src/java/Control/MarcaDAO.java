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
import Control.CaException;
import Control.ServiceLocator;
import Modelo.Marca;

/**
 *
 * @author DANNY
 */
public class MarcaDAO {

    private Marca m;

    public MarcaDAO(Marca marca) {
        m = marca;
    }

    /*
    Espacio destinado para operaciones sql
     */
    public Marca getM() {
        return m;
    }

    public void setM(Marca m) {
        this.m = m;
    }
}
