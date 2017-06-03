<%-- 
    Document   : consulta
    Created on : 3/06/2017, 10:11:44 AM
    Author     : DANNY
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Pago"%>
<%@page import="Control.PagoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% PagoDAO pagoDAO = new PagoDAO();
            ArrayList<Pago> listapago = new ArrayList<Pago>();
            listapago = pagoDAO.listarPago();
        %>
        <h1>Pagos realizados</h1>

        <table border="2">
            <thead>
            <th>No</th><th>idPago</th> <th>fecha pago</th> <th>valor pagado</th> <th>banco </th><th> forma de pago</th> <th>idLiquidacion</th>
        </thead>
        <tbody>
            <%for (int i = 0; i <= listapago.size(); i++) {%>
            <tr>
                <td><%=(i + 1)%> </td>
                <td><%=listapago.get(i).getK_refPago()%></td>
                <td><%=listapago.get(i).getF_pago()%></td>
                <td><%=listapago.get(i).getV_vlrPagado()%></td>
                <td><%=listapago.get(i).getN_banco()%></td>
                <td><%=listapago.get(i).getN_forPago()%></td>
                <td><%=listapago.get(i).getK_idLiquidacion()%></td>
            </tr>
            <%}%>

        </tbody>
    </table>
</body>
</html>
