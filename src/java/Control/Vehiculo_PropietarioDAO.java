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
import Modelo.Vehiculo_Propietario;

/**
 *
 * @author DANNY
 */
public class Vehiculo_PropietarioDAO {

    private Vehiculo_Propietario vp;

    public Vehiculo_PropietarioDAO() {
        vp = new Vehiculo_Propietario();
    }

    /*
    Espacio destinado para operaciones sql
     */
    public Vehiculo_Propietario getVp() {
        return vp;
    }

    public void setVp(Vehiculo_Propietario vp) {
        this.vp = vp;
    }

}
