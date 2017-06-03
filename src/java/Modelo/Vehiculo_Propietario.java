/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Control.Vehiculo_PropietarioDAO;
import java.sql.Date;

/**
 *
 * @author DANNY
 */
public class Vehiculo_Propietario {
    
    
    String k_placa;
    int k_cedula;
    Date f_compra;

    public Vehiculo_Propietario() {
        
    }

    public String getK_placa() {
        return k_placa;
    }

    public void setK_placa(String k_placa) {
        this.k_placa = k_placa;
    }

    public int getK_cedula() {
        return k_cedula;
    }

    public void setK_cedula(int k_cedula) {
        this.k_cedula = k_cedula;
    }

    public Date getF_compra() {
        return f_compra;
    }

    public void setF_compra(Date f_compra) {
        this.f_compra = f_compra;
    }
    
}
