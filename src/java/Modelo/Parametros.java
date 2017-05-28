/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author DANNY
 */
public class Parametros {
    String k_añoImpuesto;
    double v_semaforizacion;
    String f_descto;
    String f_limite;
    double v_descuento;

    public Parametros(String k_añoImpuesto, double v_semaforizacion, String f_descto, String f_limite, double v_descuento) {
        this.k_añoImpuesto = k_añoImpuesto;
        this.v_semaforizacion = v_semaforizacion;
        this.f_descto = f_descto;
        this.f_limite = f_limite;
        this.v_descuento = v_descuento;
    }
    
    public String getK_añoImpuesto() {
        return k_añoImpuesto;
    }

    public void setK_añoImpuesto(String k_añoImpuesto) {
        this.k_añoImpuesto = k_añoImpuesto;
    }

    public double getV_semaforizacion() {
        return v_semaforizacion;
    }

    public void setV_semaforizacion(double v_semaforizacion) {
        this.v_semaforizacion = v_semaforizacion;
    }

    public String getF_descto() {
        return f_descto;
    }

    public void setF_descto(String f_descto) {
        this.f_descto = f_descto;
    }

    public String getF_limite() {
        return f_limite;
    }

    public void setF_limite(String f_limite) {
        this.f_limite = f_limite;
    }

    public double getV_descuento() {
        return v_descuento;
    }

    public void setV_descuento(double v_descuento) {
        this.v_descuento = v_descuento;
    }
    
    
}
