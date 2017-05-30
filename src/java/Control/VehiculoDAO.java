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
import Modelo.Vehiculo;

/**
 *
 * @author DANNY
 */
public class VehiculoDAO {

    private Vehiculo v;

    public VehiculoDAO(Vehiculo v) {
        this.v = v;
    }

    /*
    Espacio destinado para operaciones sql
     */
    public Vehiculo getV() {
        return v;
    }

    public void setV(Vehiculo v) {
        this.v = v;
    }

}
