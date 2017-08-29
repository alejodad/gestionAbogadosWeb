<%-- 
    Document   : user
    Created on : 23-ago-2017, 11:15:26
    Author     : Ale
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Abogado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8"/>
        <title>Usuarios</title>
        <link href="estilos/estilo.css" rel="stylesheet" type="text/css"/>
        <script src="<%= request.getContextPath()%>/js/funciones.js" type="text/javascript"></script> 
    </head>
    <body>
        <h1></h1>
        <div class="contenedorTabla">
            <%! String msj; %>
            <% msj =(String)request.getAttribute("mensaje2"); %>
            <div id="msj" <% if(msj==null){%> style="visibility: hidden;" <%} %> >                
                <%= msj %>
            </div>
            <table border="1">
                    <thead>
                        <tr>
                            <th colspan="6">Datos Abogado</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>CEDULA</td>
                            <td>NOMBRE</td>
                            <td>TELEFONO</td>
                            <td>BIOGRAFIA</td>
                            <td>ESPECIALIDAD</td>
                            <td>ACCIONES </td>
                        </tr>
                        <% 
                            try {
                                ArrayList<Abogado> abogados = (ArrayList<Abogado>) request.getAttribute("datos");
                            for (Abogado uno : abogados) {%>
                        <tr>
                            <td> <%= uno.getCedulaAbogado()%> </td>
                            <td> <%= uno.getNombreAbogado()%> </td>
                            <td> <%= uno.getNumeroTelefonoAbogado()%> </td>
                            <td> <%= uno.getBiograiaAbogado()%> </td>
                            <td> <%= uno.getIdEspecialidad()%> </td>
                            <td> <a href="javascript:void(0)" onclick="eliminar('<%=request.getContextPath() %>/eliminar?CEDULA=<%= uno.getCedulaAbogado()%>')" >Eliminar</a> &nbsp 
                                <a href="<%=request.getContextPath() %>/agregar?CEDULA=<%= uno.getCedulaAbogado()%>">Modificar</a> </td>
                        </tr>
                        <% }
                        
                        %>
                    </tbody>
                </table>
                    <%} catch (Exception e) {
                    }
                %>
        </div>
        
    </body>
</html>
