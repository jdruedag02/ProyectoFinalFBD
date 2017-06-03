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
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Usuario</title>
    </head>
    <body>
        <h1>Registro Usuario</h1>
        <form>
            <table>
                <tr>
                    <td>Numero de identificacion:</td>
                    <td><input type="text" name="identificacion" id="identificacion"></td>
                </tr>
                <tr>
                    <td>Tipo de identificacion:</td>
                    <td><input type="text" name="tipoId" id="tipoId"></td>
                </tr>
                <tr>
                    <td>Nombre:</td>
                    <td><input type="text" name="nombre" id="nombre"></td>
                </tr>
                <tr>
                    <td>Direccion:</td>
                    <td><input type="text" name="direccion" id="direccion"></td>
                </tr>
                <tr>
                    <td>Ciudad:</td>
                    <td><input type="text" name="ciudad" id="ciudad"></td>
                </tr>
                <tr>
                    <td>Departamento:</td>
                    <td><input type="text" name="departamento" id="departamento"></td>
                </tr>
                <tr>
                    <td rowspaw="2"><h1>Registro vehiculo</h1></td>
                </tr>
                <tr>
                    <td>Fecha de compra del Vehiculo:</td>
                    <td><input type="date" name="fecha" id="fecha"></td>
                </tr>
                <tr>
                    <td>Placa:</td>
                    <td><input type="text" name="placa" id="placa"></td>
                </tr>
                <tr>
                    <td>Marca:</td>
                    <td><input type="text" name="marca" id="marca"></td>    
                </tr>
                <tr>
                    <td>Linea:</td>
                    <td><input type="text" name="linea" id="linea"</td>
                </tr>
                <tr>
                    <td>Cilindraje:</td>
                    <td><input type="text" name="cilindraje" id="cilindraje"></td>
                </tr>
                <tr>
                    <td>
                        <select name="uso" id="uso">
                            <option selected>Uso</option>
                            <option value="particular">Particular</option>
                            <option value="publico">Publico</option>
                        </select>
                    </td>    
                </tr>
                <tr>
                    <td>Capacidad:</td>
                    <td><input type="number" name="capacidad" id="capacidad"></td>
                </tr>
                <tr>
                    <td>
                        <select name="tipo" id="tipo">
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
                    </td>
                </tr>
                <tr>
                    <td>
                        <select name="modelo" id="modelo">
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
                    </td>
                </tr>
                <tr>
                    <td><input type="submit" value="Continuar"></td>
                </tr>
            </table>               
        </form>
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
        <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
    </body>
</html>
