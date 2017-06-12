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
<%
    String pagoT = request.getParameter("total");
    String numLiq = request.getParameter("numLiq");
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

    <section id="registro-pago">
      <div class="container container-vehiculo">
        <div class="row flex-items-xs-center">
          <div class="col-xs-12">
            <h1>Registro del pago</h1>
          </div>
        </div>
        <form action="RegistrarPago" method="post">
          <div class="form-group row fila-form">
            <label class="col-form-label col-xs-12 col-md-6" for="total">Total pagado</label>
            <input class="form-control entradas col-xs-12 col-md-6" type="text" readonly id="total" value="<%=pagoT%>" name="total">
          </div>
          <div class="form-group row fila-form">
            <label class="col-form-label col-xs-12 col-md-6" for="idPago">Referencia de pago</label>
            <input class="form-control entradas col-xs-12 col-md-6" type="text" id="idPago" name="idPago">
          </div>
          <div class="form-group row fila-form">
            <label class="col-form-label col-xs-12 col-md-6" for="fPago">Fecha de pago</label>
            <input class="form-control entradas col-xs-12 col-md-6" type="date" id="fPago" name="fPago">
          </div>
          <div class="form-group row fila-form">
            <label class="col-form-label col-xs-12 col-md-6" for="banco">Banco</label>
            <input class="form-control entradas col-xs-12 col-md-6" type="text" id="banco" name="banco">
          </div>
          <div class="form-group row fila-form">
            <label class="col-form-label col-xs-12 col-md-6" for="formaPago">Forma de pago</label>
            <input class="form-control entradas col-xs-12 col-md-6" type="text" id="formaPago" name="formaPago">
          </div>
          <div class="form-group row fila-form">
            <label class="col-form-label col-xs-12 col-md-6" for="total">Numero de liquidacion</label>
            <input class="form-control entradas col-xs-12 col-md-6" readonly value="<%=numLiq%>" type="text" id="numLiq" name="numLiq">
          </div>
          <div class="row flex-items-xs-center">
              <div class="col-xs-12 col-md-3 columna">
                  <div class="btn-grupo">
                      <input name="registrarPago" class="btn btn-primary" type="submit" role="button" value="Registrar Pago">
                  </div>
              </div>
        </form>
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
