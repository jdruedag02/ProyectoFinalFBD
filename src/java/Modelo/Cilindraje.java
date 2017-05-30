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
public class Cilindraje {

    String k_idL;
    String k_idCilindraje;
    String k_modelo;
    double v_valorBG;

    public Cilindraje(String k_idL, String k_idCilindraje, String k_modelo, double v_valorBG) {
        this.k_idL = k_idL;
        this.k_idCilindraje = k_idCilindraje;
        this.k_modelo = k_modelo;
        this.v_valorBG = v_valorBG;
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

    public double getV_valorBG() {
        return v_valorBG;
    }

    public void setV_valorBG(double v_valorBG) {
        this.v_valorBG = v_valorBG;
    }

}
