/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Control.PagoDAO;
import Modelo.Pago;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.CaException;

/**
 *
 * @author Asus
 */
public class RegistrarPago extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, CaException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String pagoT = request.getParameter("total");
            int NumeroPago = Integer.valueOf(request.getParameter("idPago"));
            String numLiq = request.getParameter("numLiq");
            String Banco = request.getParameter("banco");
            String FormaPago = request.getParameter("formaPago");
            String fecha = request.getParameter("fPago");

            PagoDAO pdao = new PagoDAO();
            Pago p = pdao.getP();

            p.setK_refPago(NumeroPago);
            p.setF_pago(java.sql.Date.valueOf(fecha));
            p.setV_vlrPagado(Long.parseLong(pagoT));
            p.setN_banco(Banco);
            p.setN_forPago(FormaPago);
            p.setK_idLiquidacion(Integer.valueOf(numLiq));

            pdao.incluirPago();
            
            response.sendRedirect("index.jsp");

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
            Logger.getLogger(RegistrarPago.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(RegistrarPago.class.getName()).log(Level.SEVERE, null, ex);
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
