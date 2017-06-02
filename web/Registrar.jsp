<%-- 
    Document   : Registrar
    Created on : 02-jun-2017, 15:13:46
    Author     : JULIAN
--%>

<%@page import="Modelo.Propietario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Propietario propietario = new Propietario();
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
               Propietario p = propietario.getPropietario();
                //Convertir el codigo postal a un valor num�rico
                String Identificacion = request.getParameter("Identificacion");
                String Nombre = request.getParameter("nombre");
                String Direccion = request.getParameter("direccion");
                String Ciudad = request.getParameter("ciudad");
                String Departamento = request.getParameter("departamento");
                p.setK_cedula(Identificacion);
                p.setN_nombre(Nombre);
                p.setN_ciudad(Ciudad);
                p.setN_direccion(Direccion);
                p.setN_departamento(Departamento);
                propietario.incluirPropietario();
               out.println("Municipio ["+ p.getN_nombre()+ "] Incluido exitosamente");
            }
            catch(NumberFormatException e ){
                out.println("Error --> " + "El código postal es requerido y debe ser numérico");
            }
            catch(Exception e1){
                out.println("Error --> " + e1 + e1.getMessage());
            }
            
        }%>
    </body>
</html>
