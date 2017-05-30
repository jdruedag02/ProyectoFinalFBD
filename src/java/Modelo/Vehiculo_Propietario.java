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
public class Vehiculo_Propietario {

    String k_placa;
    String k_cedula;
    String f_compra;

    public Vehiculo_Propietario(String k_placa, String k_cedula, String f_compra) {
        this.k_placa = k_placa;
        this.k_cedula = k_cedula;
        this.f_compra = f_compra;
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

}
