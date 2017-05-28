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
public class Pago {
    String k_refPago;
    String f_pago;
    double v_vlrPagado;
    String n_banco;
    String n_forPago;
    String k_idLiquidacion;

    public Pago(String k_refPago, String f_pago, double v_vlrPagado, String n_banco, String n_forPago, String k_idLiquidacion) {
        this.k_refPago = k_refPago;
        this.f_pago = f_pago;
        this.v_vlrPagado = v_vlrPagado;
        this.n_banco = n_banco;
        this.n_forPago = n_forPago;
        this.k_idLiquidacion = k_idLiquidacion;
    }
    
    public String getK_refPago() {
        return k_refPago;
    }

    public void setK_refPago(String k_refPago) {
        this.k_refPago = k_refPago;
    }

    public String getF_pago() {
        return f_pago;
    }

    public void setF_pago(String f_pago) {
        this.f_pago = f_pago;
    }

    public double getV_vlrPagado() {
        return v_vlrPagado;
    }

    public void setV_vlrPagado(double v_vlrPagado) {
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

    public String getK_idLiquidacion() {
        return k_idLiquidacion;
    }

    public void setK_idLiquidacion(String k_idLiquidacion) {
        this.k_idLiquidacion = k_idLiquidacion;
    }
    
    
}
