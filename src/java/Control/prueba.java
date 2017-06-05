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
    
    
    
    public static void main(String Args[]) throws CaException{
        
//        private Vehiculo v;
//        private Liquidacion l;
//        private Cilindraje c;
//        private Rango r;
//        private Parametros p;
//        private String ValorImpuesto;
//        private String BaseGravable;
//        private String Tarifa;
//        private String Semaforizacion;
//        private String Descuento;
//        private String ValorTotalDes;
//        private String ValorTotalNDes;
//        
//        String Placa = "htu587";
//        String Cedula = "1022432096";
//        String anio = "2017";
//        
//        // Vehiculo al que se le calculara el impuesto
//        VehiculoDAO vdao = new VehiculoDAO();
//        v = vdao.getV();
//        v.setK_placa(Placa);
//        vdao.buscarVehiculo();
//
//        // Cilindraje del vehiculo al que se le calculara el impuesto (obetener base gravable)
//        CilindrajeDAO cdao = new CilindrajeDAO();
//        c = cdao.getC();
//        cdao.BuscarBaseGravable(v.getK_idCilindraje(), v.getK_idL(), v.getK_modelo());
//
//        //Rango de tarifa al que el vehiculo aplica segun caracteristicas
//        RangoDAO rdao = new RangoDAO();
//        r = rdao.getR();
//        System.out.println(v.getK_placa());
//        System.out.println(v.getN_uso());
//        if (v.getN_uso().equals("particular")) {
//            rdao.buscarRangoParticular(c.getV_valorBG());
//        } else if (v.getN_tipo().equals("motocicleta")) {
//            rdao.buscarRangoMoto();
//        } else if (v.getN_uso().equals("publico")) {
//            rdao.buscarRangoPublico();
//        }
//
//        //parametros del año fiscal que se esta realizando el calculo del impuesto
//        ParametrosDAO pdao = new ParametrosDAO();
//        p = pdao.getP();
//        p.setK_añoImpuesto(BigDecimal.valueOf(Integer.valueOf(Anio)));
//        pdao.buscarParametros();
//
//        //Armar la liquidacion completa
//        LiquidacionDAO ldao = new LiquidacionDAO();
//        l = ldao.getLi();
//        l.setK_añoImpuesto(BigDecimal.valueOf(Integer.valueOf(Anio)));
//        l.setK_cedula(Integer.valueOf(Cedula));
//        java.util.Date date = new java.util.Date();
//        DateFormat idliquidacion = new SimpleDateFormat("yyyyMMHHss");
//        DateFormat añoliquidacion = new SimpleDateFormat("yyyy");
//        l.setK_idLiquidacion(Integer.valueOf(idliquidacion.format(date)));
//        l.setK_placa(Placa);
//        l.setN_añoLiquidacion(BigDecimal.valueOf(Integer.valueOf(añoliquidacion.format(date))));
//        l.setV_baseGravable(c.getV_valorBG());
//        l.setV_semaforizaion(p.getV_semaforizacion());
//
//        //variables con los valores necesarios para realizar el calculo del impuesto
//        long baseGravable = c.getV_valorBG();
//        float tarifa = r.getV_tarifa();
//        int semaforizacion = p.getV_semaforizacion();
//        short tDescuento = (short) (p.getV_descuento()/100);            
//        double ValorNumImpuesto = l.valorDeLiquidacion(baseGravable, tarifa);
//        double descuento = l.valorDescu(ValorNumImpuesto,tDescuento);
//        double ValorTotalDescuento = l.valorTotalDescuento(semaforizacion, ValorNumImpuesto);
//        double ValorTotalNDescuento = l.ValorTotalNDescuento(semaforizacion, ValorNumImpuesto);
//        //double voluntario 
//                
//         ValorImpuesto = Double.toString(ValorNumImpuesto);
//         BaseGravable = Long.toString(baseGravable);
//         Tarifa = Float.toString(tarifa);
//         Semaforizacion = Integer.toString(semaforizacion);
//         Descuento = Double.toString(descuento);
//         ValorTotalDes = Double.toString(ValorTotalDescuento);
//         ValorTotalNDes = Double.toString(ValorTotalNDescuento);   

        ParametrosDAO pdao = new ParametrosDAO();
        Parametros p = pdao.getP();
        
        p.setK_añoImpuesto(BigDecimal.valueOf(2017));
        pdao.buscarParametros();
        
        System.out.println(p.getT_voluntario());
        
        Liquidacion l = new Liquidacion();
        
        System.out.println(l.valorVolunt(1190750, p.getT_voluntario()));
        
    }  
}
