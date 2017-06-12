<%-- 
    Document   : ConsultaPagos
    Created on : 5/06/2017, 09:36:48 AM
    Author     : Asus
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="Modelo.Pago"%>
<%@page import="Control.PagoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String placa = request.getParameter("placa");
    String cedula = request.getParameter("cedula");
    String anio = request.getParameter("anio");
    PagoDAO pdao = new PagoDAO();
%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" type="text/css" href="css/bootstrap-flex.min.css">
        <!--estilos personalizados -->
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body>

        <!-- header -->
        <header id="header-container">
            <div class="container">
                <div class="row flex-items-xs-between flex-items-xs-middle text-xs-center ">
                    <div class="col-xs-4 col-md-3 col-lg-2 columna">
                        <img class="img-fluid " src="img/imgAlcaldia.png">
                    </div>
                    <div class="col-xs-8 col-md 7 col-lg-8 columna">
                        <h1>Secretaría Distrital de Hacienda</h1>
                    </div>
                    <div class="col-xs-2 columna hidden-sm-down">
                        <img class="img-fluid" src="img/imgEscudo.png">
                    </div>
                </div>
            </div>
        </header>

        <section id="consulta-container">
            <div class="container container-liquidacion">
                <div class="row flex-items-xs-center">
                    <div class="col-xs-12">
                        <h1>Consultar Pagos</h1>
                    </div>
                </div>
                <form>
                    <div class="form-group row fila-form">
                        <div class="col-xs-12">
                            <input class="form-control" type="text" placeholder="Ingresa el numero de placa" name="placa" id="placa" value="<%=placa%>">
                        </div>
                    </div>
                    <div class="form-group row fila-form">
                        <div class="col-xs-12">
                            <input class="form-control" type="text" placeholder="Ingresa el numero de la cedula" name="cedula" id="cedulas" value="<%=cedula%>">
                        </div>
                    </div>
                    <div class="form-group row fila-form">
                        <div class="col-xs-12">
                            <input class="form-control" type="text" placeholder="Ingresa el año a buscar" name="anio" id="anio" value="<%=anio%>">
                        </div>
                    </div>
                    <div class="form-group row fila-form flex-items-xs-between" style="margin: 2em 0;">
                        <input class="btn btn-primary" type="submit" value="Consultar por placa" name="btnPlaca" id="btnPlaca">
                        <input class="btn btn-primary" type="submit" value="Consultar por cedula" name="btnCedula" id="btnCedula">
                        <input class="btn btn-primary" type="submit" value="Consultar por año" name="btnAnio" id="btnAnio">
                        <input class="btn btn-primary" type="submit" value="Consultar por cedula y placa" name="btnCedYPlac" id="btnCedYPlac">
                    </div>
                </form>
                <%
                    if (!request.getParameterMap().isEmpty()) {
                        if ("Consultar por placa".equals(request.getParameter("btnPlaca"))) {
                            ResultSet rs = pdao.buscarPagoPlaca(placa);
                            out.println("<table class=\"table\">");
                            out.println("<thead>");
                            out.println("<tr>");
                            out.println("<th>Ref. Pago</th>");
                            out.println("<th>Fecha Pago</th>");
                            out.println("<th>Valor Pago</th>");
                            out.println("<th>Banco</th>");
                            out.println("<th>Forma de pago</th>");
                            out.println("<th>Numero de liquidacion</th>");
                            out.println("</tr>");
                            out.println("</thead>");
                            out.println("<tbody>");

                            while (rs.next()) {
                                out.println("<tr>");
                                out.println("<td>" + rs.getString(1) + "</td>");
                                out.println("<td>" + rs.getString(2) + "</td>");
                                out.println("<td>" + rs.getString(3) + "</td>");
                                out.println("<td>" + rs.getString(4) + "</td>");
                                out.println("<td>" + rs.getString(5) + "</td>");
                                out.println("<td>" + rs.getString(6) + "</td>");
                                out.println("</tr>");
                            }
                            out.println("</tbody>");
                            out.println("</table>");

                        } else if ("Consultar por cedula".equals(request.getParameter("btnCedula"))) {
                            ResultSet rs = pdao.buscarPagoCedula(Integer.valueOf(cedula));
                            out.println("<table class=\"table\">");
                            out.println("<thead>");
                            out.println("<tr>");
                            out.println("<th>Ref. Pago</th>");
                            out.println("<th>Fecha Pago</th>");
                            out.println("<th>Valor Pago</th>");
                            out.println("<th>Banco</th>");
                            out.println("<th>Forma de pago</th>");
                            out.println("<th>Numero de liquidacion</th>");
                            out.println("</tr>");
                            out.println("</thead>");
                            out.println("<tbody>");

                            while (rs.next()) {
                                out.println("<tr>");
                                out.println("<td>" + rs.getString(1) + "</td>");
                                out.println("<td>" + rs.getString(2) + "</td>");
                                out.println("<td>" + rs.getString(3) + "</td>");
                                out.println("<td>" + rs.getString(4) + "</td>");
                                out.println("<td>" + rs.getString(5) + "</td>");
                                out.println("<td>" + rs.getString(6) + "</td>");
                                out.println("</tr>");
                            }
                            out.println("</tbody>");
                            out.println("</table>");

                        } else if ("Consultar por año".equals(request.getParameter("btnAnio"))) {
                            ResultSet rs = pdao.buscarPagoAnio(anio);
                            out.println("<table class=\"table\">");
                            out.println("<thead>");
                            out.println("<tr>");
                            out.println("<th>Ref. Pago</th>");
                            out.println("<th>Fecha Pago</th>");
                            out.println("<th>Valor Pago</th>");
                            out.println("<th>Banco</th>");
                            out.println("<th>Forma de pago</th>");
                            out.println("<th>Numero de liquidacion</th>");
                            out.println("</tr>");
                            out.println("</thead>");
                            out.println("<tbody>");

                            while (rs.next()) {
                                out.println("<tr>");
                                out.println("<td>" + rs.getString(1) + "</td>");
                                out.println("<td>" + rs.getString(2) + "</td>");
                                out.println("<td>" + rs.getString(3) + "</td>");
                                out.println("<td>" + rs.getString(4) + "</td>");
                                out.println("<td>" + rs.getString(5) + "</td>");
                                out.println("<td>" + rs.getString(6) + "</td>");
                                out.println("</tr>");
                            }
                            out.println("</tbody>");
                            out.println("</table>");

                        } else if ("Consultar por cedula y placa".equals(request.getParameter("btnCedYPlac"))) {
                            ResultSet rs = pdao.buscarPagoPlacaCedula(placa, Integer.valueOf(cedula));
                            out.println("<table class=\"table\">");
                            out.println("<thead>");
                            out.println("<tr>");
                            out.println("<th>Ref. Pago</th>");
                            out.println("<th>Fecha Pago</th>");
                            out.println("<th>Valor Pago</th>");
                            out.println("<th>Banco</th>");
                            out.println("<th>Forma de pago</th>");
                            out.println("<th>Numero de liquidacion</th>");
                            out.println("</tr>");
                            out.println("</thead>");
                            out.println("<tbody>");

                            while (rs.next()) {
                                out.println("<tr>");
                                out.println("<td>" + rs.getString(1) + "</td>");
                                out.println("<td>" + rs.getString(2) + "</td>");
                                out.println("<td>" + rs.getString(3) + "</td>");
                                out.println("<td>" + rs.getString(4) + "</td>");
                                out.println("<td>" + rs.getString(5) + "</td>");
                                out.println("<td>" + rs.getString(6) + "</td>");
                                out.println("</tr>");
                            }
                            out.println("</tbody>");
                            out.println("</table>");

                        }
                    }

                %>

            </div>
        </section>

        <footer id="footer-container">
            <div class="container">
                <div class="row flex-items-xs-center flex-items-xs-middle text-xs-center text-md-justify">
                    <div class="col-xs-12 col-md-4 columna seccion-footer">
                        <h4>Contactenos</h4>
                        <p>Teléfono: (571) 338 5000 - Línea 195 <br> 
                            Fax: (571) 338 5800 Extensión: 5200 <br>
                            Correo electrónico: contactenos@shd.gov.co</p>
                    </div>
                    <div class="col-xs-12 col-md-4 columna seccion-footer">
                        <img src="img/firma_logo.png" class="img-fluid">
                    </div>
                    <div class="col-xs-12 col-md-4 columna seccion-footer">
                        <h4>Encuentrenos</h4>
                        <p>Sede Administrativa: Carrera 30 N° 25-90 - Código Postal 111311 <br> 
                            Dirección Distrital de Impuestos de Bogotá: Avenida Calle 17 N° 65B-95 - Código Postal 111611.<br>
                            Bogotá - Distrito Capital, Colombia. </p>
                    </div>
                </div>
            </div>
        </footer>

        <!-- jQuery first, then Tether, then Bootstrap JS. -->
        <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
        <script src="js/bootstrap.min.js" ></script>  
    </body>
</html>
