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
//        PropietarioDAO propietario = new PropietarioDAO();
//        MarcaDAO mdao = new MarcaDAO();
//        LineaDAO ldao = new LineaDAO();
//        CilindrajeDAO cdao = new CilindrajeDAO();
//        VehiculoDAO vdao = new VehiculoDAO();
//        Vehiculo v = vdao.getV();
//        Propietario p = propietario.getPr();
//        int Identificacion = 56789526;
//        String tipoId = "C.C.";
//        String Nombre = "Julian Gonzalez";
//        String Direccion = "Cll 72B sur N 89A-01";
//        String Ciudad = "Bogota";
//        String Departamento = "Cundinamarca";
//        p.setK_cedula(Identificacion);
//        p.setN_tipoDoc(tipoId);
//        p.setN_nombre(Nombre);
//        p.setN_ciudad(Ciudad);
//        p.setN_direccion(Direccion);
//        p.setN_departamento(Departamento);
//        propietario.incluirPropietario();
//        System.out.println("inclui propietario");
//
//        String marca = "PORSCHE";
//        mdao.buscarIdMarca(marca);
//        int idMarca = mdao.getM().getK_idM();
//        System.out.println("El id de la marca es:" + idMarca);
//        String idCilindraje = "3596";
//        String linea = "911 CARRERA MT";
//        BigDecimal modelo = BigDecimal.valueOf(1992);
//        ldao.buscarLineaCilindraje(idCilindraje, linea, idMarca, modelo);
//        String idLinea = ldao.getL().getK_idL();
//
//        System.out.println("El id de la linea es:" + idLinea);
//        Vehiculo_PropietarioDAO vpdao = new Vehiculo_PropietarioDAO();
//        Vehiculo_Propietario v = vpdao.getVp();
//        v.setF_compra(Date.valueOf("1997-12-23"));
//        v.setK_cedula(1);
//        v.setK_placa("htu587");
//        vpdao.incluirVehiculo_propietario();
//        System.out.println("incluido vp");
//
//        LiquidacionDAO ldao = new LiquidacionDAO();
//        Liquidacion l = ldao.getLi();
//
//        ldao.BuscarBaseGravable("3596", "10000", BigDecimal.valueOf(1992));
//        System.out.println(l.getV_baseGravable());
//        PropietarioDAO pdao = new PropietarioDAO();
//        Propietario p = pdao.getPr();
//        p.setK_cedula(2);
//        pdao.buscarPropietario();
//        System.out.println(p.getK_cedula());
//        System.out.println(p.getN_nombre());
//            String Placa = "htu587";
//            String Cedula = "1022432096";
//            String Anio = "2017";    
//                
//            Vehiculo v;
//            Liquidacion l ;
//            Cilindraje c;
//            Rango r;
//            Parametros p;
//            
//            // Vehiculo al que se le calculara el impuesto
//            VehiculoDAO vdao = new VehiculoDAO();
//            v = vdao.getV();
//            v.setK_placa(Placa);
//            vdao.buscarVehiculo();
//            
//            // Cilindraje del vehiculo al que se le calculara el impuesto (obetener base gravable)
//            CilindrajeDAO cdao = new CilindrajeDAO();
//            c = cdao.getC();
//            cdao.BuscarBaseGravable(v.getK_idCilindraje(), v.getK_idL(), v.getK_modelo());
//            
//            //Rango de tarifa al que el vehiculo aplica segun caracteristicas
//            RangoDAO rdao = new RangoDAO();
//            r = rdao.getR();
//            System.out.println(v.getN_uso());
//            System.out.println(v.getN_tipo());
//            if(v.getN_uso().equals("particular")){
//                rdao.buscarRangoParticular(c.getV_valorBG());
//                System.out.println("particular" + r.getV_tarifa());
//            }else if(v.getN_tipo().equals("motocicleta")){
//                rdao.buscarRangoMoto();
//                System.out.println("moto" + r.getV_tarifa());
//            }else if(v.getN_uso().equals("publico")){
//                rdao.buscarRangoPublico();
//                System.out.println("publico" + r.getV_tarifa());
//            }
//            
//            //parametros del año fiscal que se esta realizando el calculo del impuesto
//            ParametrosDAO pdao = new ParametrosDAO();
//            p = pdao.getP();
//            p.setK_añoImpuesto(BigDecimal.valueOf(Integer.valueOf(Anio)));
//            pdao.buscarParametros();
//            
//            //Armar la liquidacion completa
//            LiquidacionDAO ldao = new LiquidacionDAO();
//            l = ldao.getLi();
//            l.setK_añoImpuesto(BigDecimal.valueOf(Integer.valueOf(Anio)));
//            l.setK_cedula(Integer.valueOf(Cedula));
//            java.util.Date date = new java.util.Date();
//            DateFormat idliquidacion = new SimpleDateFormat("yyyyMMHHss");
//            DateFormat añoliquidacion = new SimpleDateFormat("yyyy");
//            l.setK_idLiquidacion(Integer.valueOf(idliquidacion.format(date)));
//            l.setK_placa(Placa);
//            l.setN_añoLiquidacion(BigDecimal.valueOf(Integer.valueOf(añoliquidacion.format(date))));
//            l.setV_baseGravable(c.getV_valorBG());
//            l.setV_semaforizaion(p.getV_semaforizacion());
//            
//            //variables con los valores necesarios para realizar el calculo del impuesto
//            long baseGravable = c.getV_valorBG();
//            float tarifa = r.getV_tarifa();
//            int semaforizacion = p.getV_semaforizacion();
//            short descuento = p.getV_descuento();
//            
//            System.out.println(baseGravable);
//            System.out.println(tarifa);
//            System.out.println(semaforizacion);
//            System.out.println(descuento);

                Vehiculo_PropietarioDAO vpdao = new Vehiculo_PropietarioDAO();
                Vehiculo_Propietario vp = vpdao.getVp();
                vp.setK_cedula(Integer.valueOf(1022432096));
                vp.setK_placa("htu587");
                vpdao.buscarVehiculo_Propietario();
                
                if (vp.getK_placa() != null && vp.getK_cedula() != -1) {
                    Intermediario intr = new Intermediario();
                    intr.Operar("htu587", "1022432096", "2017");
                    System.out.println(intr.getValorTotalDes());
                    System.out.println(intr.getValorTotalNDes());
                } else {
                    System.out.println("hola");
                }
            
    }
    
}
