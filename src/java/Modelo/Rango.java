/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Control.RangoDAO;
import java.math.BigDecimal;

/**
 *
 * @author DANNY
 */
public class Rango {
    
    
    int k_idR;
    long v_minimo;
    long v_maximo;
    float v_tarifa;
    BigDecimal k_añoParametro;

    public Rango() {
        
    }

    public int getK_idR() {
        return k_idR;
    }

    public void setK_idR(int k_idR) {
        this.k_idR = k_idR;
    }

    public long getV_minimo() {
        return v_minimo;
    }

    public void setV_minimo(long v_minimo) {
        this.v_minimo = v_minimo;
    }

    public long getV_maximo() {
        return v_maximo;
    }

    public void setV_maximo(long v_maximo) {
        this.v_maximo = v_maximo;
    }

    public float getV_tarifa() {
        return v_tarifa;
    }

    public void setV_tarifa(float v_tarifa) {
        this.v_tarifa = v_tarifa;
    }

    public BigDecimal getK_añoParametro() {
        return k_añoParametro;
    }

    public void setK_añoParametro(BigDecimal k_añoParametro) {
        this.k_añoParametro = k_añoParametro;
    }
    
}
