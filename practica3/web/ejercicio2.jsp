<%-- 
    Document   : ejercicio2
    Created on : 17-mar-2016, 8:32:04
    Author     : Lupi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="validacion2.js" type="text/javascript"></script>
        <title>Divisores positivos</title>
    </head>
    <body>
        <form method="post" action="ejercicio2.jsp" name="formulario" onsubmit="return validar();">
            <table>
                <tr>
                    <td>Número:</td>
                    <td><input type="text" name="num"></td>
                </tr>
                <tr><td></td></tr>
                <tr><td></td></tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Calcular">
                    </td>
                </tr>
                <tr><td></td></tr>
                <tr><td></td></tr>
                <tr><td></td></tr>
                <% if (request.getParameter("num")!=null){ %>
                        <tr>
                            <td></td>
                            <td align="center">
                                <b>Divisores de <% out.println(request.getParameter("num")); %></b>
                            </td>
                        </tr>
                            <% int numero=Integer.parseInt(request.getParameter("num")); %>
                            <% 
                               for(int i=1; i<= numero; i++){
                                   if(numero % i == 0){
                             %>  
                                <tr>
                                   <td></td>
                                    <td align="center">
                                        <% out.println(i); %>
                                    </td>
                                    <% }%>
                                </tr>
                               <% }%>
                        
                    <% } %>
                 
            </table>
        </form>
    </body>
</html>
