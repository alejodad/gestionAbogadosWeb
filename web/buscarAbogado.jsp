<%-- 
    Document   : buscarAbogado
    Created on : 14-ago-2017, 11:47:00
    Author     : Ale
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.*"%>
<%@page import="cad.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="estilos/estilo.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! ArrayList<Abogado> abogados = cadAbogado.listarAbogados();
            String palabra = "";
            String busqueda = "";
        %>
        <h1>Busqueda de usuario</h1>

        <form id="formReg">	
            <div id="bienvenida">		
                <h2>REGISTRO</h2>
                <h6>Haga una busqueda seleccionando un parametro </h6>
            </div>
            <div id="todo">
            <fieldset>
                <legend>Elige un parametro de busqueda </legend>
                <label>
                    <input type="radio" id="radio" name="numero" value="cedulaAbogado"> Cedula
                </label>
                <label>
                    <input type="radio" id="radio" name="numero" value="nombreAbogado"> Nombre
                </label>
                <label>
                    <input type="radio" id="radio" name="numero" value="numeroTelefonoAbogado"> Telefono
                </label>        
                <label>
                    <input type="radio" id="radio" name="numero" value="idEspecialidad"> Especialidad
                </label>
            </fieldset>
            <div class="campoReg">
                    <div class="campoNombreReg">
                        <label for="dato">Dato</label>
                    </div>
                    <div class="campoinputReg">
                        <input type="text" value="" id="dato" name="dato">
                        <input class="registro" value="buscar" name="ACCION" type="submit" id="miBtn">
                    </div>
                </div><%
                                try {
                                    if (request.getParameter("ACCION").toString().equals("buscar")) {
                                        palabra = request.getParameter("numero");
                                        busqueda = request.getParameter("dato");
                                        ArrayList<Abogado> abogados2 =  cadAbogado.buscarAbogados(palabra,busqueda);
                                    
                            %>
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
                        <% for (Abogado uno : abogados2) {%>
                        <tr>
                            <td> <%= uno.getCedulaAbogado()%> </td>
                            <td> <%= uno.getNombreAbogado()%> </td>
                            <td> <%= uno.getNumeroTelefonoAbogado()%> </td>
                            <td> <%= uno.getBiograiaAbogado()%> </td>
                            <td> <%= uno.getIdEspecialidad()%> </td>
                            <td> <a href="" >Eliminar</a> &nbsp
                                 <a href="" >Modificar</a> </td>
                        </tr>
                        <% }
                        
                        %>
                    </tbody>
                </table>
                    <%}} catch (Exception e) {
                    }
                %>
                <div class="footer">
                    <footer>
                        <p><h6>&copy Todos los derechos reservados</h6></p>
                    </footer>
                </div>	
        </form>
    </body>
</html>
