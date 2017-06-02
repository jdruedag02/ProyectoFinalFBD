/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Control.RangoDAO;

/**
 *
 * @author DANNY
 */
public class Rango {
    
    private static RangoDAO rangoDAO;
    String k_idR;
    double v_minimo;
    double v_maximo;
    double v_tarifa;
    String k_añoParametro;

    public Rango() {
        rangoDAO = new RangoDAO();
    }

    public String getK_idR() {
        return k_idR;
    }

    public void setK_idR(String k_idR) {
        this.k_idR = k_idR;
    }

    public double getV_minimo() {
        return v_minimo;
    }

    public void setV_minimo(double v_minimo) {
        this.v_minimo = v_minimo;
    }

    public double getV_maximo() {
        return v_maximo;
    }

    public void setV_maximo(double v_maximo) {
        this.v_maximo = v_maximo;
    }

    public double getV_tarifa() {
        return v_tarifa;
    }

    public void setV_tarifa(double v_tarifa) {
        this.v_tarifa = v_tarifa;
    }

    public String getK_añoParametro() {
        return k_añoParametro;
    }

    public void setK_añoParametro(String k_añoParametro) {
        this.k_añoParametro = k_añoParametro;
    }
    
    public Rango getRango(){
        return rangoDAO.getR();
    }

}
