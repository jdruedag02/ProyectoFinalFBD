/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Control.ParametrosDAO;
import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author DANNY
 */
public class Parametros {
    
    
    BigDecimal k_añoImpuesto;
    int v_semaforizacion;
    Date f_descto;
    Date f_limite;
    short v_descuento;

    public Parametros() {
        
    }

    public BigDecimal getK_añoImpuesto() {
        return k_añoImpuesto;
    }

    public void setK_añoImpuesto(BigDecimal k_añoImpuesto) {
        this.k_añoImpuesto = k_añoImpuesto;
    }

    public int getV_semaforizacion() {
        return v_semaforizacion;
    }

    public void setV_semaforizacion(int v_semaforizacion) {
        this.v_semaforizacion = v_semaforizacion;
    }

    public Date getF_descto() {
        return f_descto;
    }

    public void setF_descto(Date f_descto) {
        this.f_descto = f_descto;
    }

    public Date getF_limite() {
        return f_limite;
    }

    public void setF_limite(Date f_limite) {
        this.f_limite = f_limite;
    }

    public short getV_descuento() {
        return v_descuento;
    }

    public void setV_descuento(short v_descuento) {
        this.v_descuento = v_descuento;
    }
    

}
