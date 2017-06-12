/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import util.CaException;

/**
 *
 * @author Asus
 */
public class prueba {

    public static void main(String Args[]) throws CaException {
        String placa = "VEU240";
        String cedula = "2556";
        String anio = "2017";
        
        Intermediario in = new Intermediario();
        in.Operar(placa, cedula, anio);

        

    }
}
