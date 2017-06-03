/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Control.PagoDAO;
import java.sql.Date;

/**
 *
 * @author DANNY
 */
public class Pago {
    
    
    int k_refPago;
    Date f_pago;
    long v_vlrPagado;
    String n_banco;
    String n_forPago;
    int k_idLiquidacion;

    public Pago() {
        
    }

    public int getK_refPago() {
        return k_refPago;
    }

    public void setK_refPago(int k_refPago) {
        this.k_refPago = k_refPago;
    }

    public Date getF_pago() {
        return f_pago;
    }

    public void setF_pago(Date f_pago) {
        this.f_pago = f_pago;
    }

    public long getV_vlrPagado() {
        return v_vlrPagado;
    }

    public void setV_vlrPagado(long v_vlrPagado) {
        this.v_vlrPagado = v_vlrPagado;
    }

    public String getN_banco() {
        return n_banco;
    }

    public void setN_banco(String n_banco) {
        this.n_banco = n_banco;
    }

    public String getN_forPago() {
        return n_forPago;
    }

    public void setN_forPago(String n_forPago) {
        this.n_forPago = n_forPago;
    }

    public int getK_idLiquidacion() {
        return k_idLiquidacion;
    }

    public void setK_idLiquidacion(int k_idLiquidacion) {
        this.k_idLiquidacion = k_idLiquidacion;
    }
}
