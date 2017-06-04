<%-- 
    Document   : RegistrarPago
    Created on : 3/06/2017, 07:50:22 PM
    Author     : DANNY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar pago</title>
    </head>
    <body>
        <h1>Registro pago</h1>
        <form>
            <table>
                <tr>
                    <td>Numero de pago:</td>
                    <td><input type="text" name="idPago" id="idPago"></td>
                </tr>
                <tr>
                    <td>Fecha de pago:</td>
                    <td><input type="text" name="fPago" id="fechaPago"></td>
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
    </body>
</html>
