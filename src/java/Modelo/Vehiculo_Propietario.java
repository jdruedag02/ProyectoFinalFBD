/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Control.Vehiculo_PropietarioDAO;

/**
 *
 * @author DANNY
 */
public class Vehiculo_Propietario {
    
    private static Vehiculo_PropietarioDAO vehiculo_propietarioDAO;
    String k_placa;
    String k_cedula;
    String f_compra;

    public Vehiculo_Propietario() {
        vehiculo_propietarioDAO = new Vehiculo_PropietarioDAO();
    }

    public String getK_placa() {
        return k_placa;
    }

    public void setK_placa(String k_placa) {
        this.k_placa = k_placa;
    }

    public String getK_cedula() {
        return k_cedula;
    }

    public void setK_cedula(String k_cedula) {
        this.k_cedula = k_cedula;
    }

    public String getF_compra() {
        return f_compra;
    }

    public void setF_compra(String f_compra) {
        this.f_compra = f_compra;
    }
    
    public Vehiculo_Propietario getVehiculo_Propietario(){
        return vehiculo_propietarioDAO.getVp();
    }
}
