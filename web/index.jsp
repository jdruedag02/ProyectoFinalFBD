<%-- 
    Document   : index
    Created on : 31/05/2017, 09:14:27 AM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <title>Secretaria Distrital de Hacienda</title>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap-flex.min.css" >

        <!-- estilos personalizados -->
        <link rel="stylesheet"  href="css/style.css">
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

        <!-- seccion de seleccion -->
        <section id="info-container">
            <div class="container">
                <div class="row flex-items-xs-center text-xs-center">
                    <div class="col-xs-10 col-md-9 columna columna-info">
                        <h3>Impuestos de vehículos</h3>
                        <form action="LiquidarServlet" method="post">
                            <div class="input-group row">
                                <input name="placa" id="placa" type="text" class ="form-control" placeholder="Ingresa el numero de la placa" required>
                            </div>
                            <div class="input-group row">
                                <input name="cedula" id="cedula" type="text" class="form-control" placeholder="Ingresa el numero de la cedula" required> 
                            </div>
                            <div class="input-group row">
                                <input type="text" class="form-control" placeholder="Confirme el numero de la cedula"> 
                            </div>
                            <div class="input-group row">
                                <select class="form-control">
                                    <option selected>Tipo de documento</option>
                                    <option value="cc">CC - Cedula de ciudadania</option>
                                    <option value="nit">NIT</option>
                                    <option value="nuip">NUIP</option>
                                    <option value="ce">CE - Cedula de extranjeria</option>
                                    <option value="pa">PA - Pasaporte</option>
                                    <option value="ti">TI - Tarjeta de identidad</option>
                                </select>
                            </div>
                            <div class="input-group row">
                                <select class="form-control">
                                    <option selected >Año a pagar</option>
                                    <option value="2017">2017</option>
                                    <option value="2016">2016</option>
                                    <option value="2015">2015</option>
                                </select>
                            </div>
                            <input type="submit" value="Generar liquidacion">
                            </form>
                        <!--<div class="row flex-items-xs-center">
                            <div class="col-xs-12 col-md-3 columna">
                                <div class="btn-grupo">
                                    <a class="btn btn-primary" type="submit" role="button" href="../src/java/util/Liquidacion.java">Generar liquidacion</a>
                                </div>
                            </div>-->
                            <div class="col-xs-12 col-md-3 columna">
                                <div class="btn-grupo">
                                    <button class="btn btn-primary">Consultar pagos</button>
                                </div>
                            </div>
                            <div class="col-xs-12 col-md-3 columna">
                                <div class="btn-grupo">
                                    <button class="btn btn-primary">Pagar</button>
                                </div>
                            </div>
                        </div>
                            
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
                        <p>Teléfono: (571) 733 9112 - Línea 195 <br> 
                            Fax: (571) 811 5353 Extensión: 6969 <br>
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
