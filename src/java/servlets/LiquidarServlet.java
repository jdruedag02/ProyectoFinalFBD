/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Control.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.*;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.CaException;
/**
 *
 * @author JULIAN
 */
public class LiquidarServlet extends HttpServlet {
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws util.CaException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, CaException {
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String Placa = request.getParameter("placa");
            String Cedula = request.getParameter("cedula");
            String Anio = request.getParameter("anio");
            
            Vehiculo v;
            Liquidacion l ;
            Cilindraje c;
            Rango r;
            Parametros p;
            
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
            if(v.getN_uso().equals("particular")){
                rdao.buscarRangoParticular(c.getV_valorBG());
            }else if(v.getN_tipo().equals("motocicleta")){
                rdao.buscarRangoMoto();
            }else if(v.getN_uso().equals("publico")){
                rdao.buscarRangoPublico();
            }
            
            //parametros del año fiscal que se esta realizando el calculo del impuesto
            ParametrosDAO pdao = new ParametrosDAO();
            p = pdao.getP();
            p.setK_añoImpuesto(BigDecimal.valueOf(Integer.valueOf(Anio)));
            pdao.buscarParametros();
            
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
            //short descuento = p.getV_descuento();            
            double ValorNumImpuesto = l.valorDeLiquidacion(baseGravable, tarifa);
            double descuento = l.valorDescuYPagoV(ValorNumImpuesto);
            double ValorTotalDescuento = l.valorTotalDescuento(semaforizacion, ValorNumImpuesto);
            double ValorTotalNDescuento = l.ValorTotalNDescuento(semaforizacion, ValorNumImpuesto);
            
            String ValorImpuesto = Double.toString(ValorNumImpuesto);
            String BaseGravable = Long.toString(baseGravable);
            String Tarifa = Float.toString(tarifa);
            String Semaforizacion = Integer.toString(semaforizacion);
            String Descuento = Double.toString(descuento);
            String ValorTotalDes = Double.toString(ValorTotalDescuento);
            String ValorTotalNDes = Double.toString(ValorTotalNDescuento);
            
            response.sendRedirect("prueba.jsp?placa="+Placa+"&cedula="+Cedula+"&anio="+Anio+"&valor="+ValorImpuesto+
                    "&basegravable="+BaseGravable+"&tarifa="+Tarifa+"&semaforizacion="+Semaforizacion+"&descuento="+Descuento+
                    "&valortd="+ValorTotalDes+"&valortnd="+ValorTotalNDes);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (CaException ex) {
            Logger.getLogger(LiquidarServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (CaException ex) {
            Logger.getLogger(LiquidarServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
