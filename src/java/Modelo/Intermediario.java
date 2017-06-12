package Modelo;

import Control.CilindrajeDAO;
import Control.LiquidacionDAO;
import Control.ParametrosDAO;
import Control.RangoDAO;
import Control.VehiculoDAO;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import util.CaException;

public class Intermediario {

    private Vehiculo v;
    private Liquidacion l;
    private Cilindraje c;
    private Rango r;
    private Parametros p;
    private String ValorImpuesto;
    private String BaseGravable;
    private String Tarifa;
    private String Semaforizacion;
    private String Descuento;
    private String ValorTotalDes;
    private String ValorTotalNDes;
    private String valorVolunt;
    private String idLiquidacion;

    public void Operar(String Placa, String Cedula, String Anio) throws CaException {

        // Vehiculo al que se le calculara el impuesto
        VehiculoDAO vdao = new VehiculoDAO();
        v = vdao.getV();
        v.setK_placa(Placa);
        vdao.buscarVehiculo();

        // Cilindraje del vehiculo al que se le calculara el impuesto (obetener base gravable)
        CilindrajeDAO cdao = new CilindrajeDAO();
        c = cdao.getC();
        cdao.BuscarBaseGravable(v.getK_idCilindraje(), v.getK_idL(), v.getK_modelo());

        //Rango de tarifa al que el vehiculo aplica segun caracteristicas
        RangoDAO rdao = new RangoDAO();
        r = rdao.getR();
        System.out.println(v.getK_placa());
        System.out.println(v.getN_uso());
        if (v.getN_uso().equals("particular")) {
            rdao.buscarRangoParticular(c.getV_valorBG());
        } else if (v.getN_tipo().equals("motocicleta")) {
            rdao.buscarRangoMoto();
        } else if (v.getN_uso().equals("publico")) {
            rdao.buscarRangoPublico();
        }

        System.out.println(r.getV_tarifa());

        //parametros del año fiscal que se esta realizando el calculo del impuesto
        ParametrosDAO pdao = new ParametrosDAO();
        p = pdao.getP();
        p.setK_añoImpuesto(BigDecimal.valueOf(Integer.valueOf(Anio)));
        pdao.buscarParametros();
        System.out.println(p.getV_semaforizacion());
        
        //Armar la liquidacion completa
        LiquidacionDAO ldao = new LiquidacionDAO();
        l = ldao.getLi();
        l.setK_añoImpuesto(BigDecimal.valueOf(Integer.valueOf(Anio)));
        l.setK_cedula(Integer.valueOf(Cedula));
        Date date = new Date();
        DateFormat idliquidacion = new SimpleDateFormat("yyyyMMHHss");
        DateFormat añoliquidacion = new SimpleDateFormat("yyyy");
        l.setK_idLiquidacion(Integer.valueOf(idliquidacion.format(date)));
        l.setK_placa(Placa);
        l.setN_añoLiquidacion(BigDecimal.valueOf(Integer.valueOf(añoliquidacion.format(date))));
        l.setV_baseGravable(c.getV_valorBG());
        l.setV_semaforizaion(p.getV_semaforizacion());

        //variables con los valores necesarios para realizar el calculo del impuesto
        long baseGravable = c.getV_valorBG();
        float tarifa = r.getV_tarifa();
        int semaforizacion = p.getV_semaforizacion();
        short tDescuento = p.getV_descuento();
        short tVolunt = p.getT_voluntario();
        double ValorNumImpuesto = Math.floor(l.valorDeLiquidacion(baseGravable, tarifa));
        double descuento = Math.floor(l.valorDescu(ValorNumImpuesto, tDescuento));
        double voluntario = Math.floor(l.valorVolunt(ValorNumImpuesto, tVolunt));
        double ValorTotalDescuento = Math.floor(l.valorTotalDescuento(semaforizacion, ValorNumImpuesto));
        double ValorTotalNDescuento = Math.floor(l.ValorTotalNDescuento(semaforizacion, ValorNumImpuesto));
        
        System.out.println();

        ValorImpuesto = Long.toString((long) ValorNumImpuesto);
        BaseGravable = Long.toString(baseGravable);
        Tarifa = Float.toString(tarifa);
        Semaforizacion = Integer.toString(semaforizacion);
        Descuento = Long.toString((long) descuento);
        valorVolunt = Long.toString((long) voluntario);
        ValorTotalDes = Long.toString((long) ValorTotalDescuento);
        ValorTotalNDes = Long.toString((long) ValorTotalNDescuento);
        idLiquidacion = idliquidacion.format(date);
    }

    public String getIdLiquidacion() {
        return idLiquidacion;
    }

    public void setIdLiquidacion(String idLiquidacion) {
        this.idLiquidacion = idLiquidacion;
    }

    public String getValorVolunt() {
        return valorVolunt;
    }

    public void setValorVolunt(String valorVolunt) {
        this.valorVolunt = valorVolunt;
    }

    public Vehiculo getV() {
        return v;
    }

    public void setV(Vehiculo v) {
        this.v = v;
    }

    public Liquidacion getL() {
        return l;
    }

    public void setL(Liquidacion l) {
        this.l = l;
    }

    public Cilindraje getC() {
        return c;
    }

    public void setC(Cilindraje c) {
        this.c = c;
    }

    public Rango getR() {
        return r;
    }

    public void setR(Rango r) {
        this.r = r;
    }

    public Parametros getP() {
        return p;
    }

    public void setP(Parametros p) {
        this.p = p;
    }

    public String getValorImpuesto() {
        return ValorImpuesto;
    }

    public void setValorImpuesto(String ValorImpuesto) {
        this.ValorImpuesto = ValorImpuesto;
    }

    public String getBaseGravable() {
        return BaseGravable;
    }

    public void setBaseGravable(String BaseGravable) {
        this.BaseGravable = BaseGravable;
    }

    public String getTarifa() {
        return Tarifa;
    }

    public void setTarifa(String Tarifa) {
        this.Tarifa = Tarifa;
    }

    public String getSemaforizacion() {
        return Semaforizacion;
    }

    public void setSemaforizacion(String Semaforizacion) {
        this.Semaforizacion = Semaforizacion;
    }

    public String getDescuento() {
        return Descuento;
    }

    public void setDescuento(String Descuento) {
        this.Descuento = Descuento;
    }

    public String getValorTotalDes() {
        return ValorTotalDes;
    }

    public void setValorTotalDes(String ValorTotalDes) {
        this.ValorTotalDes = ValorTotalDes;
    }

    public String getValorTotalNDes() {
        return ValorTotalNDes;
    }

    public void setValorTotalNDes(String ValorTotalNDes) {
        this.ValorTotalNDes = ValorTotalNDes;
    }

}
