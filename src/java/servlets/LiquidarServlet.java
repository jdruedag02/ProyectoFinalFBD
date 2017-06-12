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
import static java.lang.System.out;
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
            

            String Placa = request.getParameter("placa");
            String Cedula = request.getParameter("cedula");
            String Anio = request.getParameter("anio");
            String ValorImpuesto = request.getParameter("impuesto");
            String Semaforizacion = request.getParameter("semaforizacion");
            String BaseGravable = request.getParameter("avaluo");
            String Descuento = request.getParameter("descuento");
            String ValorVolunt = request.getParameter("volunt");
            String idLiquidacion = request.getParameter("idLiquidacion");
            String tarifa = request.getParameter("tarifa");
            String valorTD = request.getParameter("totalDes");
            String valorTND = request.getParameter("totalNDes");

            LiquidacionDAO ldao = new LiquidacionDAO();
            Liquidacion l = ldao.getLi();

            l.setK_añoImpuesto(BigDecimal.valueOf(Integer.valueOf(Anio)));
            l.setK_cedula(Integer.valueOf(Cedula));
            l.setK_idLiquidacion(Integer.valueOf(idLiquidacion));
            l.setK_placa(Placa);
            Date date = new Date();
            DateFormat añoliquidacion = new SimpleDateFormat("yyyy");
            l.setN_añoLiquidacion(BigDecimal.valueOf(Integer.valueOf(añoliquidacion.format(date))));
            l.setV_baseGravable(Long.valueOf(BaseGravable));

            if ("S".equals(request.getParameter("pagoTiempo"))) {
                l.setV_dstoPronto(Long.valueOf(Descuento));
            } else {
                l.setV_dstoPronto(0);
            }

            l.setV_impuesto(Long.valueOf(ValorImpuesto));

            if ("S".equals(request.getParameter("aceptPagoVoluntario"))) {
                l.setV_pagoVoluntario(Long.valueOf(ValorVolunt));
            } else {
                l.setV_pagoVoluntario(0);
            }

            l.setV_semaforizaion(Integer.valueOf(Semaforizacion));
            long vTotal = (l.getV_impuesto() + l.getV_pagoVoluntario()+l.getV_semaforizacion()) - l.getV_dstoPronto();
            l.setV_total(vTotal);

            ldao.incluirLiquidacion();
            
            response.sendRedirect("MostrarLiquidacion.jsp?placa=" + Placa + "&cedula=" + Cedula + "&anio=" + Anio + "&valor=" + ValorImpuesto
                            + "&basegravable=" + BaseGravable + "&tarifa=" + tarifa + "&semaforizacion=" + Semaforizacion + "&descuento=" + Descuento
                            + "&valortd=" + valorTD + "&valortnd=" + valorTND + "&valorVolunt=" + ValorVolunt+"&idLiquidacion="+ idLiquidacion);

        }catch(Exception e){
            out.println(e.getMessage());
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
