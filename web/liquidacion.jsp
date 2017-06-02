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

    <!-- seccion de datos iniciales -->
    <section id="section-datosini-container">
      <div class="container">
        <div class="row flex-items-xs-between flex-items-xs-middle fila-predeterminada">
          <div class="col-xs-12 col-md-3">
            <div class="input-group row">
              <input id="placa" type="text" class ="form-control" placeholder="Placa del vehiculo" readonly>
            </div>
          </div>
          <div class="col-xs-12 col-md-3">
            <div class="input-group row">
              <input id="Identificacion del contribuyente" type="text" class ="form-control" placeholder="Identificacion del contribuyente" readonly>
            </div>          
          </div>
          <div class="col-xs-12 col-md-3">
            <div class="input-group row">
              <input id="aSño" type="text" class ="form-control" placeholder="Año" readonly>
            </div>           
          </div>
        </div>
      </div>
    </section>

    <!-- secccion de datos del vehiculo -->
    <section id="section-vehiculo-container">
      <div class="container container-vehiculo">
        <div class="row">
          <div class="col-xs-12 header-fila">
            <h2>Datos del vehiculo</h2>
          </div>
        </div>
        <form>
          <div class="form-group row fila-form columna">
            <div class="col-xs-12 col-md-4">
              <select class="form-control" id="model">
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
              <select class="form-control" id="uso">
                <option selected>Uso</option>
                <option value="particular">Particular</option>
                <option value="publico">Publico</option>
              </select>
            </div>
            <div class="col-xs-12 col-md-4">
                <select class="form-control">
                  <option selected>Tipo</option>
                  <option value="automovil">Automovil</option>
                  <option value="ambulancia">Ambulancia</option>
                  <option value="camioneta doblecabina">Camioneta Doblecabina</option>
                  <option value="camioneta y campero">Camioneta y Campero</option>
                  <option value="carga">Carga</option>
                  <option value="electrico">Electrico</option>
                  <option value="motocicleta y motocarro">Motocicleta y Motocarro</option>
                  <option value="pasajero">Pasajeros</option>
                </select>
            </div>
          </div>
          <div class="form-group row fila-form columna">
            <div class="col-xs-12 col-md-4">
              <select class="form-control">
                <option selected>Clase</option>
                <option value="ambulancia">Ambulancia</option>
                <option value="automovil">Automovil</option>
                <option value="barredora">Barredora</option>
                <option value="bus">Bus</option>
                <option value="bus articulado">Bus Articulado</option>
                <option value="buseta">Buseta</option>
                <option value="camion">Camion</option>
                <option value="camioneta">Camioneta</option>
                <option value="camioneta y campero">Camioneta y Campero</option>
                <option value="campero">Campero</option>
                <option value="cuatrimoto">Cuatrimoto</option>
                <option value="doblecabina">Doble Cabina</option>
                <option value="electrico">Electrico</option>
                <option value="microbus">Microbus</option>
                <option value="motocarro">Motocarro</option>
                <option value="motocarro electrico">Motocarro Electrico</option>
                <option value="motocicleta">Motocicleta Electrica</option>
                <option value="mototriciclo">Mototriciclo</option>
                <option value="plataforma">Plataforma</option>
                <option value="tractocamion">Tractocamion</option>
                <option value="volqueta">Volqueta</option>
              </select>
            </div>
            <div class="col-xs-12 col-md-4">
              <select class="form-control">
                <option selected>Marca</option>

              </select>
            </div>
            <div class="col-xs-12 col-md-4">
              <select class="form-control">
                <option selected>Linea</option>
              </select>
            </div>
          </div>
          <div class="form-group row fila-form">
            <div class="col-xs-12 col-md-4">
              <select class="form-control">
                <option selected>Cilindraje</option>
              </select>
            </div>
            <div class="col-xs-12 col-md-4">
              <div class="col-10">
                <input class="form-control" type="date" value="2011-08-19" id="fecha-compra">
              </div>        
            </div>
            <div class="col-xs-12 col-md-2">
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
            </div>
          </div>
        </form>
      </div>
    </section>

    <!-- seccion de datos del contribuyente -->
    <section id="section-contribuyente-container">
      <div class="container container-contribuyente">
        <div class="row">
          <div class="col-xs-12 header-fila">
            <h2>Datos del contribuyente</h2>
          </div>
        </div>
        <form>
          <div class="form-input row fila-form">
            <div class="col-xs-12 col-md-3">
                <select class="form-control" id="lista-calidadCont">
                <option selected>Tipo contribuyente</option>
                <option value="propietario">Propietario</option>
                <option value="poseedor">Poseedor</option>
              </select>            
            </div>
            <div class="col-xs-12 col-md-3">
              <select class="form-control">
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
              <input type="text" class="form-control" placeholder="Identificacion">
            </div>
            <div class="col-xs-12 col-md-3">
              <input type="text" class="form-control" placeholder="Nombres y Apellidos o Razon social">
            </div>
          </div>
          <div class="form-group row fila-form">
            <div class="col-xs-12 col-md-3">
              <input type="text" class="form-control" placeholder="Telefono">
            </div>
            <div class="col-xs-12 col-md-3">
              <input type="text" class="form-control" placeholder="Dirección">
            </div>
          </div>
        </form>
      </div>
    </section>

    <!-- seccion de liquidacion -->

    <section id="section-liquidacion-container">
      <div class="container container-liquidacion">
       <div class="row">
          <div class="col-xs-12 header-fila">
            <h2>Liquidación del vehiculo</h2>
          </div>
       </div>
       <form>
         <div class="form-group row fila-form">
           <div class="col-xs-12">
             <legend>¿Desea incluir el aporte voluntario (10%)?</legend>
              <div class="form-check form-check-inline row">
                <label class="form-check-label">
                  <input class="form-check-input" type="radio" name="inlineRadioOptions">Si
                </label>
                <label class="form-check-label">
                  <input class="form-check-input" type="radio" name="inlineRadioOptions">No
                </label>
              </div>
           </div>
         </div>
         <div class="form-group row fila-form">
            <label class="col-form-label col-xs-12 col-md-6" for="avaluo">Avalúo comercial (Base Gravable)</label>
            <input class="form-control entradas col-xs-12 col-md-6" type="text" readonly id="avaluo">
         </div>
         <div class="form-group row fila-form">
            <label class="col-form-label col-xs-12 col-md-6" for="Semaforizacion">Semaforizacion</label>
            <input class="form-control entradas col-xs-12 col-md-6" type="text" readonly id="Semaforizacion">
         </div>
         <div class="form-group row fila-form">
            <label class="col-form-label col-xs-12 col-md-6" for="descuento">Descuento pronto pago</label>
            <input class="form-control entradas col-xs-12 col-md-6" type="text" readonly id="descuento">
         </div>
         <div class="form-group row fila-form">
            <label class="col-form-label col-xs-12 col-md-6" for="volunt">Pago voluntario</label>
            <input class="form-control entradas col-xs-12 col-md-6" type="text" readonly id="volunt">
         </div>
         <div class="form-group row fila-form">
            <label class="col-form-label col-xs-12 col-md-6" for="total">Total a pagar</label>
            <input class="form-control entradas col-xs-12 col-md-6" type="text" readonly id="total">
         </div>
         <div class="row flex-items-xs-center">
            <div class="col-xs-12 col-md-3 columna">
              <div class="btn-grupo">
                <button class="btn btn-primary" type="submit">Pagar</button>
                <button class="btn btn-primary" type="submit">generar liquidacion</button>
              </div>
            </div>
          </div>
       </form>
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