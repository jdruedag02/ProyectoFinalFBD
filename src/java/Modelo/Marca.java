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
public class Marca {

    String k_idM;
    String n_nombreM;

    public Marca(String k_idM, String n_nombreM) {
        this.k_idM = k_idM;
        this.n_nombreM = n_nombreM;
    }

    public String getK_idM() {
        return k_idM;
    }

    public void setK_idM(String k_idM) {
        this.k_idM = k_idM;
    }

    public String getN_nombreM() {
        return n_nombreM;
    }

    public void setN_nombreM(String n_nombreM) {
        this.n_nombreM = n_nombreM;
    }

}
