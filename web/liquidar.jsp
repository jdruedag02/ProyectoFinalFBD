<%-- 
    Document   : liquidar
    Created on : 3/06/2017, 01:02:35 PM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liquidar</title>
    </head>
    <body>
        <form action="LiquidarServlet" method="post">
            <table>
                <tr>
                    <td>Cedula:</td>
                    <td><input type="text" name="cedula" id="cedula"></td>
                </tr>
                <tr>
                    <td>Placa:</td>
                    <td><input type="text" name="placa" id="placa"></td>
                </tr>
                <tr>
                    <select  name="anio" id="anio">
                                    <option selected >Año a pagar</option>
                                    <option value="2017">2017</option>
                                    <option value="2016">2016</option>
                                    <option value="2015">2015</option>
                                </select>
                </tr>
                <tr>
                    <td><input type="submit" value="Liquidar"></td>
                </tr>                
            </table>
        </form>
    </body>
</html>
