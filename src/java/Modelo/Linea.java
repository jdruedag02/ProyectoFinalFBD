/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Control.LineaDAO;

/**
 *
 * @author DANNY
 */
public class Linea {
    
    private LineaDAO lineaDAO;
    String k_idL;
    String n_nombreL;
    String k_idM;

    public Linea() {
        lineaDAO = new LineaDAO();
    }

    public String getK_idL() {
        return k_idL;
    }

    public void setK_idL(String k_idL) {
        this.k_idL = k_idL;
    }

    public String getN_nombreL() {
        return n_nombreL;
    }

    public void setN_nombreL(String n_nombreL) {
        this.n_nombreL = n_nombreL;
    }

    public String getK_idM() {
        return k_idM;
    }

    public void setK_idM(String k_idM) {
        this.k_idM = k_idM;
    }
    
    public Linea getLinea(){
        return lineaDAO.getL();
    }
}
