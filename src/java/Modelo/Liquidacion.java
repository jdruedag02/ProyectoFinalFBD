/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Control.LiquidacionDAO;

/**
 *
 * @author DANNY
 */
public class Liquidacion {
    
    private LiquidacionDAO liquidacionDAO;
    String k_idLiquidacion;
    String n_añoImpuesto;
    double v_total;
    double v_pagoVoluntario;
    double v_dstoPronto;
    double v_semaforizacion;
    double v_impuesto;
    double v_baseGravable;
    String k_placa;
    String k_cedula;
    String k_añoImpuesto;

    public Liquidacion() {
       liquidacionDAO = new LiquidacionDAO();
    }

    public String getK_idLiquidacion() {
        return k_idLiquidacion;
    }

    public void setK_idLiquidacion(String k_idLiquidacion) {
        this.k_idLiquidacion = k_idLiquidacion;
    }

    public String getN_añoImpuesto() {
        return n_añoImpuesto;
    }

    public void setN_añoImpuesto(String n_añoImpuesto) {
        this.n_añoImpuesto = n_añoImpuesto;
    }

    public double getV_total() {
        return v_total;
    }

    public void setV_total(double v_total) {
        this.v_total = v_total;
    }

    public double getV_pagoVoluntario() {
        return v_pagoVoluntario;
    }

    public void setV_pagoVoluntario(double v_pagovoluntario) {
        this.v_pagoVoluntario = v_pagovoluntario;
    }

    public double getV_dstoPronto() {
        return v_dstoPronto;
    }

    public void setV_dstoPronto(double v_dstoPronto) {
        this.v_dstoPronto = v_dstoPronto;
    }

    public double getV_semaforizacion() {
        return v_semaforizacion;
    }

    public void setV_semaforizaion(double v_semaforizaion) {
        this.v_semaforizacion = v_semaforizaion;
    }

    public double getV_impuesto() {
        return v_impuesto;
    }

    public void setV_impuesto(double v_impuesto) {
        this.v_impuesto = v_impuesto;
    }

    public double getV_baseGravable() {
        return v_baseGravable;
    }

    public void setV_baseGravable(double v_baseGravable) {
        this.v_baseGravable = v_baseGravable;
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

    public String getK_añoImpuesto() {
        return k_añoImpuesto;
    }

    public void setK_añoImpuesto(String k_añoImpuesto) {
        this.k_añoImpuesto = k_añoImpuesto;
    }
    
    public Liquidacion getLiquidacion(){
        return liquidacionDAO.getLi();
    }

}
