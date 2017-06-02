/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Liquidacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Control.CaException;
import Control.ServiceLocator;

/**
 *
 * @author DANNY
 */
public class LiquidacionDAO {

    private static Liquidacion li;

    public LiquidacionDAO() {
        li = new Liquidacion();
    }

    /*
    Espacio destinado para operaciones sql
     */
    public Liquidacion getLi() {
        return li;
    }

    public void setLi(Liquidacion li) {
        this.li = li;
    }

}
