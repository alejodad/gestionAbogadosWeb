<%-- 
    Document   : index
    Created on : 12-ago-2017, 12:33:17
    Author     : Ale
--%>

<%@page import="modelo.Abogado"%>
<%@page import="cad.cadAbogado"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Especialidad"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="estilos/estilo.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestion Abogados</title>
    </head>
    <body>
        <%! ArrayList<Especialidad> espec = cadAbogado.mostrarEspecialidades();
            Especialidad obj = new Especialidad();
            Abogado abo = new Abogado();

        %>
        <h1>Hello World!</h1>         
        <form method="POST">
            <table border="1">
                <thead>
                    <tr>
                        <th colspan="2">DATOS</th>                    
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>CEDULA</td>
                        <td> <input type="text" name="CEDULA" value="" /></td>
                    </tr>
                    <tr>
                        <td>NOMBRE</td>
                        <td><input type="text" name="NOMBRE" value="" /></td>
                    </tr>
                    <tr>
                        <td>TELEFONO</td>
                        <td> <input type="text" name="TELEFONO" value="" /></td>
                    </tr>
                    <tr>
                        <td>BIOGRAFIA</td>
                        <td> <input type="text" name="BIOGRAFIA" value="" /></td>
                    </tr>
                    <tr>
                        <td>ESPECIALIDAD</td>
                        <td>
                            <select name="espec">
                                <option value="">SELECCIONE: 1</option>  
                                <%
                                    for (Especialidad uno : espec) {%>
                                <option value="<%= uno.getIdEspecialidad()%>"> <%= uno.getNombreEspecialidad()%> </option>    
                                <%}%>                     
                            </select> 
                        </td>
                    </tr>

                    <tr>
                        <td colspan="2" align="center"> <input value="REGISTRAR" name="ACCION" type="submit"> <input value="LIMPIAR" name="ACCION" type="reset"> </td>
                            
                </tr>
                </tbody>
            </table>
        </form>

        <form id="formReg" method="POST">	
            <div id="bienvenida">		
                <h2>REGISTRO</h2>
                <h6>Ingrese sus datos personales</h6>
            </div>
            <div id="todo">
                <div class="campoReg">
                    <div class="campoNombreReg">
                        <label for="cedula">CEDULA</label>
                    </div>
                    <div class="campoinputReg">
                        <input type="text" name="CEDULA" id="cedula" maxlength="15" placeholder="Ejemplo 1537........." 
                               pattern="[0-9]{7,15}" title="La cedula debe contener numeros" required autofocus value ="">
                    </div>
                </div>
                <div class="campoReg">
                    <div class="campoNombreReg">
                        <label for="nombre">NOMBRE</label>
                    </div>
                    <div class="campoinputReg">
                        <input type="text" required id="nombre" name="NOMBRE" value="" placeholder="Ejemplo pedro" maxlength="30" 
                               pattern="[a-zA-Z]{3,10}" title="El nombre solo debe llevar letras">
                    </div>
                </div>
                <div class="campoReg">
                    <div class="campoNombreReg">
                        <label for="telefono">TEEFONO</label>
                    </div>
                    <div class="campoinputReg">
                        <input type="text" required id="telefono" name="TELEFONO" value="" maxlength="10" placeholder="Ejemplo 1537........." 
                               pattern="[0-9]{7,10}" title="El telefono debe contener numeros">
                    </div>
                </div>
                <div class="campoReg">
                    <div class="campoNombreReg">
                        <label for="biografia">BIOGRAFIA</label>
                    </div>
                    <div class="campoinputReg">
                        <textarea id="biografia" name="BIOGRAFIA" value=""  placeholder="Escriba la biografia "></textarea>
                    </div>
                </div>
                <div class="campoReg">
                    <div class="campoNombreReg">
                        <label for="especialidad">EDAD</label>
                    </div>
                    <div class="campoinputReg">
                        <select name="espec" id="especialidad">
                            <option value="">SELECCIONE </option>  
                            <%
                                    for (Especialidad uno : espec) {%>
                            <option value="<%= uno.getIdEspecialidad()%>"> <%= uno.getNombreEspecialidad()%> </option>    
                            <%}%>                     
                        </select>
                    </div>
                </div>
                <div>				 
                    <input class="registro" value="BUSCAR" name="ACCION" type="submit" id="miBtn">
                    <input class="registro" value="REGISTRAR" name="ACCION" type="submit" id="miBtn">
                    <input class="registro" value="MODIFICAR" name="ACCION" type="submit" id="miBtn">
                    <input class="registro" value="ELIMINAR" name="ACCION" type="submit" id="miBtn">
                    <input class="registro" value="LIMPIAR" name="ACCION" type="reset" id="miBtn" onClick="document.getElementById('oculto').style.visibility='hidden'"> 
                    <%
                                try {
                                    if (request.getParameter("ACCION").toString().equals("REGISTRAR")) {
                                        abo.setCedulaAbogado(request.getParameter("CEDULA"));
                                        abo.setNombreAbogado(request.getParameter("NOMBRE"));
                                        abo.setNumeroTelefonoAbogado(request.getParameter("TELEFONO"));
                                        abo.setBiograiaAbogado(request.getParameter("BIOGRAFIA"));
                                        abo.setIdEspecialidad(request.getParameter("espec"));
                                        cadAbogado.insertarAbogado(abo);
                                    }else if(request.getParameter("ACCION").toString().equals("BUSCAR")){
                                        abo.setCedulaAbogado(request.getParameter("CEDULA"));
                                        cadAbogado.buscarUnAbogado(abo);
                                        request.setAttribute("NOMBRE", abo.getNombreAbogado());
                                            
                                        
                                    }
                            %>
                <tr>
                    <div id="oculto" style="visibility:visible"> 
<%= cadAbogado.mensaje%> 
</div>     
                    
                </tr>

                <%} catch (Exception e) {
                    }
                %>
                </div>
                <div class="footer">
                    <footer>
                        <p><h6>&copy Todos los derechos reservados</h6></p>
                    </footer>
                </div>
                        
        </form>        
    </body>
</html>
