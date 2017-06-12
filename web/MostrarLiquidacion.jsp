<%-- 
    Document   : prueba
    Created on : 03-jun-2017, 21:22:27
    Author     : JULIAN
--%>


<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="Modelo.Liquidacion"%>
<%@page import="Control.LiquidacionDAO"%>
<%@page import="java.math.BigDecimal"%>
<%
    String Placa = request.getParameter("placa");
    String Cedula = request.getParameter("cedula");
    String Anio = request.getParameter("anio");
    String ValorImpuesto = request.getParameter("valor");
    String Semaforizacion = request.getParameter("semaforizacion");
    String Tarifa = request.getParameter("tarifa");
    String BaseGravable = request.getParameter("basegravable");
    String Descuento = request.getParameter("descuento");
    String ValorTotalDes = request.getParameter("valortd");
    String ValorTotalNDes = request.getParameter("valortnd");
    String ValorVolunt = request.getParameter("valorVolunt");
    String idLiquidacion = request.getParameter("idLiquidacion");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

    <!-- seccion de datos iniciales -->
    <section id="section-datosini-container">
      <div class="container">
        <div class="row flex-items-xs-between flex-items-xs-middle fila-predeterminada">
          <div class="col-xs-12 col-md-3">
            <div class="input-group row">
              <input id="placa" type="text" class ="form-control" value="<%=Placa%>" readonly>
            </div>
          </div>
          <div class="col-xs-12 col-md-3">
            <div class="input-group row">
              <input id="Identificacion del contribuyente" type="text" class ="form-control" value="<%=Cedula%>" readonly>
            </div>          
          </div>
          <div class="col-xs-12 col-md-3">
            <div class="input-group row">
              <input id="año" type="text" class ="form-control" value="<%=Anio%>" readonly>
            </div>           
          </div>
        </div>
      </div>
    </section>

    <!--Seccion de liquidacion-->
    <section id="seccion-liquidacion">
      <div class="container container-liquidacion">
        <div class="row flex-items-xs-between">
          <div class="col-xs-12 col-md-6 header-fila">
            <h2>Liquidación del vehiculo</h2><br>
          </div>
          <div class="col-xs-12 col-md-6">
            <form>
              <div class="form-group row fila-form flex-items-xs-between">
                <label class="col-form-label col-xs-12 col-md-6">Numero de liquidacion</label>
                <input class="form-control entradas col-xs-12 col-md-6" readonly value="<%=idLiquidacion%>" id="idLiquidacion" name="idLiquidacion">
              </div>
            </form>
          </div>
        </div><br>
        <div class="row">
          <div class="col-xs-12 col-md-6">
          <div class="col-xs-12 header-fila">
            <h3>Antes de fecha limite con Descuento</h3><br>
          </div>
              <form action="LiquidarServlet" method="post">
               <div class="form-group row fila-form">
                  <label class="col-form-label col-xs-12 col-md-6" for="avaluo">Avalúo comercial (Base Gravable)</label>
                  <input class="form-control entradas col-xs-12 col-md-6" type="text" readonly id="avaluo" value="<%=BaseGravable%>" name="avaluo">
               </div>
               <div class="form-group row fila-form">
                  <label class="col-form-label col-xs-12 col-md-6" for="impuesto">Impuesto base</label>
                  <input class="form-control entradas col-xs-12 col-md-6" type="text" readonly id="impuesto" value="<%=ValorImpuesto%>" name="impuesto">
               </div>
               <div class="form-group row fila-form">
                  <label class="col-form-label col-xs-12 col-md-6" for="tarifa">Tarifa</label>
                  <input class="form-control entradas col-xs-12 col-md-6" type="text" readonly id="tarifa" value="<%=Tarifa%>" name="tarifa">
               </div>
               <div class="form-group row fila-form">
                  <label class="col-form-label col-xs-12 col-md-6" for="Semaforizacion">Semaforizacion</label>
                  <input class="form-control entradas col-xs-12 col-md-6" type="text" readonly id="Semaforizacion" value="<%=Semaforizacion%>" name="semaforizacion">
               </div>
               <div class="form-group row fila-form">
                  <label class="col-form-label col-xs-12 col-md-6" for="descuento">Descuento pronto pago</label>
                  <input class="form-control entradas col-xs-12 col-md-6" type="text" readonly id="descuento" value="<%=Descuento%>" name="descuento">
               </div>
               <div class="form-group row fila-form">
                  <label class="col-form-label col-xs-12 col-md-6" for="volunt">Pago voluntario</label>
                  <input class="form-control entradas col-xs-12 col-md-6" type="text" readonly id="volunt" value="<%=ValorVolunt%>" name="volunt">
               </div>
               <div class="form-group row fila-form">
                  <label class="col-form-label col-xs-12 col-md-6" for="total">Total a pagar</label>
                  <input class="form-control entradas col-xs-12 col-md-6" type="text" readonly id="totalDes" value="<%=ValorTotalDes%>" name="totalDes">
               </div>
               <div class="form-group row fila-form">
                  <input class="form-control entradas col-xs-12 col-md-6" type="hidden" id="totalNDes" value="<%=ValorTotalNDes%>" name="totalNDes">
               </div>
               <div class="form-group row fila-form">
                <input class="form-control entradas col-xs-12 col-md-6" readonly value="<%=idLiquidacion%>" id="idLiquidacion" name="idLiquidacion" type="hidden">
                <div class="input-group row">
                  <input id="placa" type="hidden" class ="form-control" value="<%=Placa%>" readonly name="placa">
                </div>
                <div class="input-group row">
                  <input id="Identificacion del contribuyente" type="hidden" class ="form-control" value="<%=Cedula%>" readonly name="cedula">
                </div>
                <div class="input-group row">
                  <input id="año" type="hidden" class ="form-control" value="<%=Anio%>" readonly name="anio">
                </div>
              </div>
               <div class="form-group row fila-form">
                 <label class="col-sm-2">Incluir Pago voluntario</label>
                  <div class="col-sm-4">
                    <div class="form-check">
                      <label class="form-check-label">
                          <input class="form-check-input" type="radio" name="aceptPagoVoluntario" value="S">
                      </label>
                    </div>
                  </div>
                  <label class="col-sm-2">¿pagaras a tiempo?</label>
                  <div class="col-sm-4">
                    <div class="form-check">
                      <label class="form-check-label">
                          <input class="form-check-input" type="radio" name="pagoTiempo" value="S"> si
                      </label>
                    </div>
                  </div>
               </div>
              <div class="form-group row fila-form flex-items-xs-center">
                <div class="col-xs-12">
                  <input class="btn btn-primary" type="submit" value="Guardar Liquidación" name="guardarLiquidacion">
                </div>
              </div>
             </form>
          </div>
          <div class="col-xs-12 col-md-6">
            <div class="col-xs-12 header-fila">
              <h3>Despues de fecha limite con Descuento</h3><br>
            </div>
            <form action="GenerarPDF" method="post">
               <div class="form-group row fila-form">
                  <label class="col-form-label col-xs-12 col-md-6" for="avaluo">Avalúo comercial (Base Gravable)</label>
                  <input class="form-control entradas col-xs-12 col-md-6" type="text" readonly id="avaluo" value="<%=BaseGravable%>" name="avaluo">
               </div>
               <div class="form-group row fila-form">
                  <label class="col-form-label col-xs-12 col-md-6" for="impuesto">Impuesto base</label>
                  <input class="form-control entradas col-xs-12 col-md-6" type="text" readonly id="impuesto" value="<%=ValorImpuesto%>" name="impuesto">
               </div>
               <div class="form-group row fila-form">
                  <label class="col-form-label col-xs-12 col-md-6" for="tarifa">Tarifa</label>
                  <input class="form-control entradas col-xs-12 col-md-6" type="text" readonly id="tarifa" value="<%=Tarifa%>" name="tarifa">
               </div>
               <div class="form-group row fila-form">
                  <label class="col-form-label col-xs-12 col-md-6" for="Semaforizacion">Semaforizacion</label>
                  <input class="form-control entradas col-xs-12 col-md-6" type="text" readonly id="Semaforizacion" value="<%=Semaforizacion%>" name="semaforizacion">
               </div>
               <div class="form-group row fila-form">
                  <label class="col-form-label col-xs-12 col-md-6" for="descuento">Descuento pronto pago</label>
                  <input class="form-control entradas col-xs-12 col-md-6" type="text" readonly id="descuento" value="0" name="descuento" >
               </div>
               <div class="form-group row fila-form">
                  <label class="col-form-label col-xs-12 col-md-6" for="volunt">Pago voluntario</label>
                  <input class="form-control entradas col-xs-12 col-md-6" type="text" readonly id="volunt" value="<%=ValorVolunt%>" name="volunt">
               </div>
               <div class="form-group row fila-form">
                  <label class="col-form-label col-xs-12 col-md-6" for="total">Total a pagar</label>
                  <input class="form-control entradas col-xs-12 col-md-6" type="text" readonly id="totalNDes" value="<%=ValorTotalNDes%>" name="totalNDes">
               </div>
               <div class="form-group row fila-form">
                  <input class="form-control entradas col-xs-12 col-md-6" type="hidden" id="totalDes" value="<%=ValorTotalDes%>" name="totalDes">
               </div>
               <div class="form-group row fila-form">
                <input class="form-control entradas col-xs-12 col-md-6" readonly value="<%=idLiquidacion%>" id="idLiquidacion" name="idLiquidacion" type="hidden">
                <div class="input-group row">
                  <input id="placa" type="hidden" class ="form-control" value="<%=Placa%>" readonly name="placa">
                </div>
                <div class="input-group row">
                  <input id="Identificacion del contribuyente" type="hidden" class ="form-control" value="<%=Cedula%>" readonly name="cedula">
                </div>
                <div class="input-group row">
                  <input id="año" type="hidden" class ="form-control" value="<%=Anio%>" readonly name="anio">
                </div>
                <div class="form-group row fila-form">
                  <label class="col-form-label col-xs-12 col-md-6" for="descuento">Descuento pronto pago</label>
                  <input class="form-control entradas col-xs-12 col-md-6" type="hidden" readonly id="descuento" value="<%=Descuento%>" name="descuentoOC">
                </div>
                <div class="form-group row fila-form flex-items-xs-center">
                  <div class="col-xs-12">
                    <input class="btn btn-primary" type="submit" value="Generar PDF" name="generarPDF">
                  </div>
                </div>
             </form>
          </div>
        </div>
      </div>
    </section>

    <!-- footer -->
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
