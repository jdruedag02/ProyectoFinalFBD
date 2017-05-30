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
import Modelo.Propietario;

/**
 *
 * @author DANNY
 */
public class PropietarioDAO {

    private Propietario pr;

    public PropietarioDAO(Propietario pr) {
        this.pr = pr;
    }

    /*
    Espacio destinado para operaciones sql
     */
    public Propietario getPr() {
        return pr;
    }

    public void setPr(Propietario pr) {
        this.pr = pr;
    }

}
