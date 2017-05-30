/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author DANNY
 */
public class Liquidacion {

    private Liquidacion li;

    public Liquidacion(Liquidacion l) {
        li = l;
    }

    /*
    Espacio destinado para operaciones sql
     */
    public Liquidacion getLi() {
        return li;
    }

    public void setLi(Liquidacion li) {
        this.li = li;
    }

}
