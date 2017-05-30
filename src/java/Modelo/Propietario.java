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
public class Propietario {

    String k_cedula;
    String n_tipoDoc;
    String n_nombre;
    String n_direccion;
    String n_ciudad;
    String n_departamento;

    public Propietario(String k_cedula, String n_tipoDoc, String n_nombre, String n_direccion, String n_ciudad, String n_departamento) {
        this.k_cedula = k_cedula;
        this.n_tipoDoc = n_tipoDoc;
        this.n_nombre = n_nombre;
        this.n_direccion = n_direccion;
        this.n_ciudad = n_ciudad;
        this.n_departamento = n_departamento;
    }

    public String getK_cedula() {
        return k_cedula;
    }

    public void setK_cedula(String k_cedula) {
        this.k_cedula = k_cedula;
    }

    public String getN_tipoDoc() {
        return n_tipoDoc;
    }

    public void setN_tipoDoc(String n_tipoDoc) {
        this.n_tipoDoc = n_tipoDoc;
    }

    public String getN_nombre() {
        return n_nombre;
    }

    public void setN_nombre(String n_nombre) {
        this.n_nombre = n_nombre;
    }

    public String getN_direccion() {
        return n_direccion;
    }

    public void setN_direccion(String n_direccion) {
        this.n_direccion = n_direccion;
    }

    public String getN_ciudad() {
        return n_ciudad;
    }

    public void setN_ciudad(String n_ciudad) {
        this.n_ciudad = n_ciudad;
    }

    public String getN_departamento() {
        return n_departamento;
    }

    public void setN_departamento(String n_departamento) {
        this.n_departamento = n_departamento;
    }

}
