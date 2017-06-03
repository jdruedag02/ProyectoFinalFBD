/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Control.LiquidacionDAO;
import java.io.IOException;
import java.math.BigDecimal;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DANNY
 */
public class Liquidacion {
    
    int k_idLiquidacion;
    BigDecimal n_añoliquidacion;
    long v_total;
    long v_pagoVoluntario;
    long v_dstoPronto;
    int v_semaforizacion;
    long v_impuesto;
    long v_baseGravable;
    String k_placa;
    int k_cedula;
    BigDecimal k_añoImpuesto;

    
    public int getK_idLiquidacion() {
        return k_idLiquidacion;
    }

    public void setK_idLiquidacion(int k_idLiquidacion) {
        this.k_idLiquidacion = k_idLiquidacion;
    }

    public BigDecimal getN_añoLiquidacion() {
        return n_añoliquidacion;
    }

    public void setN_añoLiquidacion(BigDecimal n_añoLiquidacion) {
        this.n_añoliquidacion = n_añoLiquidacion;
    }

    public long getV_total() {
        return v_total;
    }

    public void setV_total(long v_total) {
        this.v_total = v_total;
    }

    public long getV_pagoVoluntario() {
        return v_pagoVoluntario;
    }

    public void setV_pagoVoluntario(long v_pagovoluntario) {
        this.v_pagoVoluntario = v_pagovoluntario;
    }

    public long getV_dstoPronto() {
        return v_dstoPronto;
    }

    public void setV_dstoPronto(long v_dstoPronto) {
        this.v_dstoPronto = v_dstoPronto;
    }

    public int getV_semaforizacion() {
        return v_semaforizacion;
    }

    public void setV_semaforizaion(int v_semaforizaion) {
        this.v_semaforizacion = v_semaforizaion;
    }

    public long getV_impuesto() {
        return v_impuesto;
    }

    public void setV_impuesto(long v_impuesto) {
        this.v_impuesto = v_impuesto;
    }

    public long getV_baseGravable() {
        return v_baseGravable;
    }

    public void setV_baseGravable(long v_baseGravable) {
        this.v_baseGravable = v_baseGravable;
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

    public BigDecimal getK_añoImpuesto() {
        return k_añoImpuesto;
    }

    public void setK_añoImpuesto(BigDecimal k_añoImpuesto) {
        this.k_añoImpuesto = k_añoImpuesto;
    }

}
