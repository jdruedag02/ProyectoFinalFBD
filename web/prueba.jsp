<%-- 
    Document   : prueba
    Created on : 03-jun-2017, 21:22:27
    Author     : JULIAN
--%>

<%
    String Placa = request.getParameter("placa");
    String Cedula = request.getParameter("cedula");
    String Año = request.getParameter("anio");
    String ValorImpuesto = request.getParameter("valor");
    String Semaforizacion = request.getParameter("semaforizacion");
    String Tarifa = request.getParameter("tarifa");
    String BaseGravable = request.getParameter("basegravable");
    String Descuento = request.getParameter("descuento");
    String ValorTotalDes = request.getParameter("valortd");
    String ValorTotalNDes = request.getParameter("valortnd");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>prueba</title>
    </head>
    <body>
        <h1>Placa: <%=Placa%></h1>
        <h1>Identificacion: <%=Cedula%></h1>
        <h1>Año: <%=Año%></h1>
        <h1>Base Gravable: <%=BaseGravable%></h1>
        <h1>Tarifa: <%=Tarifa%></h1>
        <h1>Semaforizacion: <%=Semaforizacion%></h1>
        <h1>Descuento: <%=Descuento%></h1>
        <h1>Valor Impuesto: <%=ValorImpuesto%></h1>
        <h1>Valor Total</h1>
        <h1>Con Descuento: <%=ValorTotalDes%></h1>
        <h1>Sin Descuento: <%=ValorTotalNDes%></h1>
        <form>
            <input value="<%=Placa%>" name="" id="" type="hidden">
            <input value="<%=Cedula%>" name="" id="" type="hidden">
            <input value="<%=Año%>" name="" id="" type="hidden">
            <input value="<%=BaseGravable%>" name="" id="" type="hidden">
            <input value="<%=Tarifa%>" name="" id="" type="hidden">
            <input value="<%=Semaforizacion%>" name="" id="" type="hidden">
            <input value="<%=ValorImpuesto%>" name="" id="" type="hidden">
            <input value="<%=ValorTotalDes%>" name="" id="" type="hidden">
            <input value="<%=ValorTotalNDes%>" name="" id="" type="hidden">
            <input type="submit" value="Registrar Liquidacion">
        </form>
    </body>
</html>
