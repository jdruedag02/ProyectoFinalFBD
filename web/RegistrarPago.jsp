<%-- 
    Document   : RegistrarPago
    Created on : 3/06/2017, 07:50:22 PM
    Author     : DANNY
--%>

<%@page import="java.math.BigInteger"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page import="Modelo.Pago"%>
<%@page import="Control.PagoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar pago</title>
    </head>
    <body>
        <%
            PagoDAO pdao = new PagoDAO();
        %>
        <h1>Registro pago</h1>
        <form>
            <table>
                <tr>
                    <td>Numero de pago:</td>
                    <td><input type="text" name="idPago" id="idPago"></td>
                </tr>
                <tr>
                    <td>Fecha de pago:</td>
                    <td><input type="date" name="fPago" id="fechaPago"></td>
                </tr>
                <tr>
                    <td>Valor pagado:</td>
                    <td><input type="text" name="vPagado" id="valorPagado"></td>
                </tr>
                <tr>
                    <td>Banco:</td>
                    <td><input type="text" name="banco" id="banco"></td>
                </tr>
                <tr>
                    <td>Forma de pago:</td>
                    <td><input type="text" name="ciudad" id="formaPago"></td>
                </tr>
                <tr>
                    <td>Numero liquidacion:</td>
                    <td><input type="text" name="departamento" id="numeroLiquidacion"></td>
                </tr>
                <tr>
                    <td rowspaw="2">
                        <input type="submit" value="RegistrarPago">
                        <%if (!request.getParameterMap().isEmpty()) {

                                try {

                                    Pago p = pdao.getP();

                                    int NumeroPago = Integer.valueOf(request.getParameter("idPago"));
                                    long ValorPagado = Long.parseLong(request.getParameter("tipoId"));
                                    String Banco = request.getParameter("banco");
                                    String FormaPago = request.getParameter("formaPago");
                                    int NumLiquidacion = Integer.valueOf(request.getParameter("numeroLiquidacion"));
                                    
                                    p.setK_refPago(NumeroPago);
                                    p.setF_pago(Date.valueOf(request.getParameter("fechaPago")));
                                    p.setV_vlrPagado(ValorPagado);
                                    p.setN_banco(Banco);
                                    p.setN_forPago(FormaPago);
                                    p.setK_idLiquidacion(NumLiquidacion);
                                    
                                    pdao.incluirPago();
                                    out.println("El pago a sido incluido con exito");
                                    
                                    out.println("LO HICIMOS!");
                                } catch (NumberFormatException e) {
                                    out.println("Error --> " + e.getMessage());
                                } catch (Exception e1) {
                                    out.println("Error --> " + e1 + e1.getMessage());
                                }

                            }%>
                        </body>
                        </html>
