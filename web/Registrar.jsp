<%-- 
    Document   : Registrar
    Created on : 02-jun-2017, 15:13:46
    Author     : JULIAN
--%>

<%@page import="java.sql.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="Control.*"%>
<%@page import="Modelo.Propietario"%>
<%@page import="Control.PropietarioDAO" %>
<%@page import="Modelo.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    PropietarioDAO propietario = new PropietarioDAO();
    MarcaDAO mdao = new MarcaDAO();
    LineaDAO ldao = new LineaDAO();
    CilindrajeDAO   cdao = new CilindrajeDAO();
    VehiculoDAO vdao = new VehiculoDAO();
    Vehiculo_PropietarioDAO vpdao = new Vehiculo_PropietarioDAO();
    
    
    String cedula = request.getParameter("cedula");

%>
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
    <body>

        <section id="section-contribuyente-container">
            <div class="container container-contribuyente">
                <div class="row">
                    <div class="col-xs-12 header-fila">
                        <h2>Datos del contribuyente</h2>
                    </div>
                </div>
                <form>
                    <div class="form-group row fila-form">
                        <div class="col-xs-12 col-md-3">
                            <select class="form-control" id="lista-calidadCont">
                                <option selected>Tipo contribuyente</option>
                                <option value="propietario">Propietario</option>
                                <option value="poseedor">Poseedor</option>
                            </select>            
                        </div>
                        <div class="col-xs-12 col-md-3">
                            <select class="form-control" name="tipoId" id="tipoId">
                                <option selected>Tipo documento</option>
                                <option value="cc">CC - Cedula de ciudadania</option>
                                <option value="nit">NIT</option>
                                <option value="nuip">NUIP</option>
                                <option value="ce">CE - Cedula de extranjeria</option>
                                <option value="pa">PA - Pasaporte</option>
                                <option value="ti">TI - Tarjeta de identidad</option>
                            </select>
                        </div>
                        <div class="col-xs-12 col-md-3">
                            <input type="text" class="form-control" placeholder="Identificacion" name="identificacion" id="identificacion" value="<%=cedula%>">
                        </div>
                        <div class="col-xs-12 col-md-3">
                            <input type="text" class="form-control" placeholder="Nombres y Apellidos o Razon social" name="nombre" id="nombre">
                        </div>
                    </div>
                    <div class="form-group row fila-form">
                        <div class="col-xs-12 col-md-3">
                            <input type="text" class="form-control" placeholder="Telefono">
                        </div>
                        <div class="col-xs-12 col-md-3">
                            <input type="text" class="form-control" placeholder="Dirección" name="direccion" id="direccion">
                        </div>
                        <div class="col-xs-12 col-md-3">
                            <input type="text" class="form-control" placeholder="Ciudad" name="ciudad" id="ciudad">
                        </div>
                        <div class="col-xs-12 col-md-3">
                            <input type="text" class="form-control" placeholder="Departamento" name="departamento" id="departamento">
                        </div>
                    </div>
                    <div class="form-group row titulo-form">
                        <h2>Datos del vehiculo</h2>
                    </div>
                    <div class="form-group row fila-form">
                        <div class="col-xs-12">
                            <input class="form-control" type="text" placeholder="Placa del Vehiculo" name="placa" id="placa">
                        </div>
                    </div>
                    <div class="form-group row fila-form columna">
                        <div class="col-xs-12 col-md-4">
                            <select class="form-control" id="modelo" name="modelo">
                                <option selected>Modelo</option>
                                <option value="2017">2017</option>
                                <option value="2016">2016</option>
                                <option value="2015">2015</option>
                                <option value="2014">2014</option>
                                <option value="2013">2013</option>
                                <option value="2012">2012</option>
                                <option value="2011">2011</option>
                                <option value="2010">2010</option>
                                <option value="2009">2009</option>
                                <option value="2008">2008</option>
                                <option value="2007">2007</option>
                                <option value="2006">2006</option>
                                <option value="2005">2005</option>
                                <option value="2004">2004</option>
                                <option value="2004">2004</option>
                                <option value="2003">2003</option>
                                <option value="2002">2002</option>
                                <option value="2001">2001</option>
                                <option value="2000">2000</option>
                                <option value="1999">1999</option>
                                <option value="1998">1998</option>
                                <option value="1997">1997</option>
                                <option value="1996">1996</option>
                                <option value="1995">1995</option>
                                <option value="1994">1994</option>
                                <option value="1993">1993</option>
                                <option value="1992">1992</option>
                            </select>
                        </div>
                        <div class="col-xs-12 col-md-4">
                            <select class="form-control" id="uso" name="uso">
                                <option selected>Uso</option>
                                <option value="particular">Particular</option>
                                <option value="publico">Publico</option>
                            </select>
                        </div>
                        <div class="col-xs-12 col-md-4">
                            <select class="form-control" id="tipo" name="tipo">
                                <option selected>Tipo</option>
                                <option value="automovil">Automovil</option>
                                <option value="ambulancia">Ambulancia</option>
                                <option value="camioneta doblecabina">Camioneta Doblecabina</option>
                                <option value="camioneta y campero">Camioneta y Campero</option>
                                <option value="carga">Carga</option>
                                <option value="electrico">Electrico</option>
                                <option value="motocicleta">Motocicleta y Motocarro</option>
                                <option value="pasajero">Pasajeros</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group row fila-form columna">
                        <div class="col-xs-12 col-md-4">
                            <input class="form-control" type="text" placeholder="Capacidad" name="capacidad" id="capacidad"></input>
                        </div>
                        <div class="col-xs-12 col-md-4">
                            <input type="text" class="form-control" name="marca" id="marca" placeholder="Marca">
                        </div>
                        <div class="col-xs-12 col-md-4">
                            <input type="text" class="form-control" name="linea" id="linea" placeholder="Linea">
                        </div>
                    </div>
                    <div class="form-group row fila-form">
                        <div class="col-xs-12 col-md-4">
                            <input type="text" placeholder="cilindraje" class="form-control" name="cilindraje" id="cilindraje">
                        </div>
                        <div class="col-xs-12 col-md-4">
                            <div class="col-10">
                                <input class="form-control" type="date" value="2017-06-05" id="fecha-compra" name="fecha" id="fecha">
                            </div>        
                        </div>
                        <!-- <div class="col-xs-12 col-md-2">
                          <label>¿El vehiculo es nuevo?</label>
                          <div class="form-check form-check-inline">
                            <label class="form-check-label">
                              <input class="form-check-input" type="radio" name="inlineRadioOptions" value="si">Si
                            </label>
                            <div class="form-check form-check-inline">
                              <label class="form-check-label">
                                <input class="form-check-input" type="radio" name="inlineRadioOptions" value="no">No
                              </label>
                            </div>
                          </div>
                        </div> -->
                    </div>
                    <div class="form-group row fila-form flex-items-xs-center">
                      <input class="btn btn-primary" type="submit" value="continuar">
                    </div>
                </form>
            </div>
        </section>
        <%if (!request.getParameterMap().isEmpty()) {

                try {

                    Propietario p = propietario.getPr();

                    int Identificacion = Integer.valueOf(request.getParameter("identificacion"));
                    String tipoId = request.getParameter("tipoId");
                    String Nombre = request.getParameter("nombre");
                    String Direccion = request.getParameter("direccion");
                    String Ciudad = request.getParameter("ciudad");
                    String Departamento = request.getParameter("departamento");
                    p.setK_cedula(Identificacion);
                    p.setN_tipoDoc(tipoId);
                    p.setN_nombre(Nombre);
                    p.setN_ciudad(Ciudad);
                    p.setN_direccion(Direccion);
                    p.setN_departamento(Departamento);
                    propietario.incluirPropietario();
                    out.println("inclui propietario");
                    Vehiculo v = vdao.getV();

                    String placa = request.getParameter("placa");
                    int capacidad = Integer.valueOf(request.getParameter("capacidad"));
                    String idCilindraje = request.getParameter("cilindraje");
                    String tipo = request.getParameter("tipo");
                    String modelo = request.getParameter("modelo");
                    String uso = request.getParameter("uso");

                    String linea = request.getParameter("linea");
                    String marca = request.getParameter("marca");

                    mdao.buscarIdMarca(marca);
                    int idMarca = mdao.getM().getK_idM();
                    out.println("encontre marca");
                    ldao.buscarLineaCilindraje(idCilindraje, linea, idMarca, BigDecimal.valueOf(Integer.valueOf(modelo)));
                    String idLinea = ldao.getL().getK_idL();
                    out.println("encontre linea");
                    BigDecimal nCilindraje = BigDecimal.valueOf(Integer.valueOf(idCilindraje));
                    BigDecimal idModelo = BigDecimal.valueOf(Integer.valueOf(modelo));

                    v.setK_idCilindraje(idCilindraje);
                    v.setK_idL(idLinea);
                    v.setK_idM(idMarca);
                    v.setK_modelo(idModelo);
                    v.setK_placa(placa);
                    v.setN_cilindraje(nCilindraje);
                    v.setN_modelo(modelo);
                    v.setN_tipo(tipo);
                    v.setN_uso(uso);
                    v.setQ_capacidad(capacidad);

                    vdao.incluirVehiculo();

                    Vehiculo_Propietario vp = vpdao.getVp();
                    vp.setF_compra(Date.valueOf(request.getParameter("fecha")));
                    vp.setK_cedula(Identificacion);
                    vp.setK_placa(placa);

                    vpdao.incluirVehiculo_propietario();

                    out.println("LO HICIMOS!");
                } catch (NumberFormatException e) {
                    out.println("Error --> " + e.getMessage());
                } catch (Exception e1) {
                    out.println("Error --> " + e1 + e1.getMessage());
                }

            }%>
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
