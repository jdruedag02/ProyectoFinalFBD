/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Control.VehiculoDAO;

/**
 *
 * @author DANNY
 */
public class Vehiculo {
    
    
    String k_placa;
    int q_capacidad;
    String n_cilindraje;
    String n_tipo;
    String n_modelo;
    String n_uso;
    String k_idM;
    String k_idL;
    String k_idCilindraje;
    String k_modelo;

    public Vehiculo() {
        
    }

    public String getK_placa() {
        return k_placa;
    }

    public void setK_placa(String k_placa) {
        this.k_placa = k_placa;
    }

    public int getQ_capacidad() {
        return q_capacidad;
    }

    public void setQ_capacidad(int q_capacidad) {
        this.q_capacidad = q_capacidad;
    }

    public String getN_cilindraje() {
        return n_cilindraje;
    }

    public void setN_cilindraje(String n_cilindraje) {
        this.n_cilindraje = n_cilindraje;
    }

    public String getN_tipo() {
        return n_tipo;
    }

    public void setN_tipo(String n_tipo) {
        this.n_tipo = n_tipo;
    }

    public String getN_modelo() {
        return n_modelo;
    }

    public void setN_modelo(String n_modelo) {
        this.n_modelo = n_modelo;
    }

    public String getN_uso() {
        return n_uso;
    }

    public void setN_uso(String n_uso) {
        this.n_uso = n_uso;
    }

    public String getK_idM() {
        return k_idM;
    }

    public void setK_idM(String k_idM) {
        this.k_idM = k_idM;
    }

    public String getK_idL() {
        return k_idL;
    }

    public void setK_idL(String k_idL) {
        this.k_idL = k_idL;
    }

    public String getK_idCilindraje() {
        return k_idCilindraje;
    }

    public void setK_idCilindraje(String k_idCilindraje) {
        this.k_idCilindraje = k_idCilindraje;
    }

    public String getK_modelo() {
        return k_modelo;
    }

    public void setK_modelo(String k_modelo) {
        this.k_modelo = k_modelo;
    }
    

}
