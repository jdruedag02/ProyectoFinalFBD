<%-- 
    Document   : Registrar
    Created on : 02-jun-2017, 15:13:46
    Author     : JULIAN
--%>

<%@page import="java.math.BigDecimal"%>
<%@page import="Control.*"%>
<%@page import="Modelo.Propietario"%>
<%@page import="Control.PropietarioDAO" %>
<%@page import="Modelo.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    PropietarioDAO propietario = new PropietarioDAO();
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
                    <td><input type="submit" value="Continuar"></td>
                </tr>
            </table>               
        </form>
        <%if (!request.getParameterMap().isEmpty()) {
          
          try{
                Propietario p = propietario.getPr();
                //Convertir el codigo postal a un valor num�rico
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
                out.println("Propietario ["+ p.getN_nombre()+ "] Incluido exitosamente");
               
//                LiquidacionDAO ld = new LiquidacionDAO();
//                Liquidacion l = ld.getLi();
//            
//                l.setN_añoLiquidacion(BigDecimal.valueOf(2017));
//                l.setK_idLiquidacion(1);
//                l.setK_cedula(1);
//                l.setV_total(1256665474);
//                l.setV_pagoVoluntario(224);
//                l.setV_baseGravable(895460023);
//                l.setV_semaforizaion(49000);
//                l.setV_dstoPronto(0);
//                l.setV_impuesto(1250000);
//                l.setK_placa("htu458");
//                l.setK_añoImpuesto(BigDecimal.valueOf(2017));
//                
//                ld.incluirLiquidacion();
//                out.println("liquidacion agregada");
            }
            catch(NumberFormatException e ){
                out.println("Error --> " + e.getMessage());
            }
            catch(Exception e1){
                out.println("Error --> " + e1 + e1.getMessage());
            }
            
        }%>
    </body>
</html>
