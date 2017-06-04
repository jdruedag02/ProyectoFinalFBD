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
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>prueba</title>
    </head>
    <body>
        <h1><%=Placa%></h1>
        <h1><%=Cedula%></h1>
        <h1><%=Año%></h1>
        <h1><%=ValorImpuesto%></h1>
    </body>
</html>
