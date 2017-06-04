/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Scanner;
import util.CaException;

/**
 *
 * @author Asus
 */
 

public class prueba {
    public static void main(String Args[]) throws CaException{
    PropietarioDAO propietario = new PropietarioDAO();
    MarcaDAO mdao = new MarcaDAO();
    LineaDAO ldao = new LineaDAO();
    CilindrajeDAO   cdao = new CilindrajeDAO();
    VehiculoDAO vdao = new VehiculoDAO();
    Vehiculo v = vdao.getV();
    Propietario p = propietario.getPr();
    int Identificacion = 56789526;
    String tipoId = "C.C.";
    String Nombre = "Julian Gonzalez";
    String Direccion = "Cll 72B sur N 89A-01";
    String Ciudad = "Bogota";
    String Departamento = "Cundinamarca";
    p.setK_cedula(Identificacion);
    p.setN_tipoDoc(tipoId);
    p.setN_nombre(Nombre);
    p.setN_ciudad(Ciudad);
    p.setN_direccion(Direccion);
    p.setN_departamento(Departamento);
    propietario.incluirPropietario();
    System.out.println("inclui propietario");
    
    String marca = "PORSCHE";
    mdao.buscarIdMarca(marca);
   int idMarca = mdao.getM().getK_idM();
   System.out.println("El id de la marca es:"+idMarca);
    String idCilindraje = "3596";
    String linea = "911 CARRERA MT";
    BigDecimal modelo = BigDecimal.valueOf(1992);
    ldao.buscarLineaCilindraje(idCilindraje, linea, idMarca, modelo);
    String idLinea = ldao.getL().getK_idL();
    
    System.out.println("El id de la linea es:"+idLinea);
//      Vehiculo_PropietarioDAO vpdao = new Vehiculo_PropietarioDAO();
//      Vehiculo_Propietario v = vpdao.getVp();
//      v.setF_compra(Date.valueOf("1997-12-23"));
//      v.setK_cedula(1);
//      v.setK_placa("htu587");
//      vpdao.incluirVehiculo_propietario();
//      System.out.println("incluido vp");

//        LiquidacionDAO ldao = new LiquidacionDAO();
//        Liquidacion l = ldao.getLi();
//        
//        ldao.BuscarBaseGravable("3596", "10000", BigDecimal.valueOf(1992));
//        System.out.println(l.getV_baseGravable());
    }
    
}
