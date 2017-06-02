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
import Modelo.Vehiculo;

/**
 *
 * @author DANNY
 */
public class VehiculoDAO {

    private Vehiculo v;

    public VehiculoDAO() {
        v = new Vehiculo();
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
