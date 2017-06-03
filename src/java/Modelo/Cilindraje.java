/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Control.CilindrajeDAO;
import java.math.BigDecimal;

/**
 *
 * @author DANNY
 */
public class Cilindraje {

    String k_idL;
    String k_idCilindraje;
    BigDecimal k_modelo;
    long v_valorBG;
    

    public Cilindraje() {
        
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

    public BigDecimal getK_modelo() {
        return k_modelo;
    }

    public void setK_modelo(BigDecimal k_modelo) {
        this.k_modelo = k_modelo;
    }

    public long getV_valorBG() {
        return v_valorBG;
    }

    public void setV_valorBG(long v_valorBG) {
        this.v_valorBG = v_valorBG;
    }
    
}
