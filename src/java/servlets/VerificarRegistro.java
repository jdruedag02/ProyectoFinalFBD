/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Control.Vehiculo_PropietarioDAO;
import Modelo.*;
import java.io.IOException;
import java.io.PrintWriter;
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
public class VerificarRegistro extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            String placa = request.getParameter("placa");
            String cedula = request.getParameter("cedula");
            String anio = request.getParameter("anio");
            
            
            if ("Generar Liquidacion".equals(request.getParameter("liquidar"))) {
                //out.println("entre en primero");
                Vehiculo_PropietarioDAO vpdao = new Vehiculo_PropietarioDAO();
                Vehiculo_Propietario vp = vpdao.getVp();
                vp.setK_cedula(Integer.valueOf(cedula));
                vp.setK_placa(placa);
                vpdao.buscarVehiculo_Propietario();
                
                if (vp.getK_placa() != null && vp.getK_cedula() != -1) {
                    //out.println("aca estoy intentando en 1");
                    Intermediario intr = new Intermediario();
                    intr.Operar(placa, cedula, anio);
                    response.sendRedirect("prueba.jsp?placa=" + placa + "&cedula=" + cedula + "&anio=" + anio + "&valor=" + intr.getValorImpuesto()
                            + "&basegravable=" + intr.getBaseGravable() + "&tarifa=" + intr.getTarifa() + "&semaforizacion=" + intr.getSemaforizacion() + "&descuento=" + intr.getDescuento()
                            + "&valortd=" + intr.getValorTotalDes() + "&valortnd=" + intr.getValorTotalNDes());
                } else {
                    //out.println("aqui intentando en 2");
                    response.sendRedirect("Registrar.jsp?cedula=" + cedula);
                }
            }else if("Consultar Pagos".equals(request.getParameter("consultaPago"))){
                
            }else if("Registrar Pago".equals(request.getParameter("registraPago"))){
                
            }
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
            Logger.getLogger(VerificarRegistro.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(VerificarRegistro.class.getName()).log(Level.SEVERE, null, ex);
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
