<%-- 
    Document   : agregar
    Created on : 23-ago-2017, 11:58:07
    Author     : Ale
--%>

<%@page import="modelo.Abogado"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Especialidad"%>
<%@page import="cad.cadAbogado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>Agregar Usuario</title>
        <link href="estilos/estilo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%! ArrayList<Especialidad> espec = cadAbogado.mostrarEspecialidades();
            Especialidad obj = new Especialidad();            
        %>
        <% 
            Abogado abo = (Abogado)request.getAttribute("abogado"); 
        %>
        <form id="formReg" name ="formulario" action="<%if(abo.getCedulaAbogado().equals("")){%> <%= request.getContextPath() %>/agregarPosth<%}else{%><%= request.getContextPath()%>/modificarPosth<%}%>" method="POST">	
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
                        <input type="text" <%try{if(abo.getCedulaAbogado().equals("")){%> value=""<% }else{ %> value="<%= abo.getCedulaAbogado()%>" <%}}catch(Exception e){}%> name="CEDULA"  maxlength="15" placeholder="Ejemplo 1537........." 
                               pattern="[0-9]{7,15}" title="La cedula debe contener numeros" required autofocus >
                    </div>
                </div>
                <div class="campoReg">
                    <div class="campoNombreReg">
                        <label for="nombre">NOMBRE</label>
                    </div>
                    <div class="campoinputReg">
                        <input type="text" required  name="NOMBRE" value="<%= abo.getNombreAbogado() %>" placeholder="Ejemplo pedro" maxlength="30" 
                               pattern="[a-zA-Z]{3,10}" title="El nombre solo debe llevar letras">
                    </div>
                </div>
                <div class="campoReg">
                    <div class="campoNombreReg">
                        <label for="telefono">TEEFONO</label>
                    </div>
                    <div class="campoinputReg">
                        <input type="text" required id="telefono" name="TELEFONO" value="<%= abo.getNumeroTelefonoAbogado() %>" maxlength="10" placeholder="Ejemplo 1537........." 
                               pattern="[0-9]{7,10}" title="El telefono debe contener numeros">
                    </div>
                </div>
                <div class="campoReg">
                    <div class="campoNombreReg">
                        <label for="biografia">BIOGRAFIA</label>
                    </div>
                    <div class="campoinputReg">
                        <textarea id="biografia" name="BIOGRAFIA" value=""  placeholder="Escriba la biografia ">
                            <%= abo.getBiograiaAbogado() %>
                        </textarea>
                    </div>
                </div>
                <div class="campoReg">
                    <div class="campoNombreReg">
                        <label for="especialidad">EDAD</label>
                    </div>
                    <div class="campoinputReg">
                        <select name="espec" id="especialidad" value="<%= abo.getIdEspecialidad()%>">
                            <option value="">SELECCIONE </option>  
                            <%
                                    for (Especialidad uno : espec) {%>
                            <option value="<%= uno.getIdEspecialidad()%>" <%if(abo.getIdEspecialidad()==uno.getIdEspecialidad()){%>selected<%}%> > <%= uno.getNombreEspecialidad()%> </option>    
                            <%}%>                     
                        </select>
                    </div>
                </div>
                <div>				 
                    <input class="registro" value="BUSCAR" name="accion" type="submit" id="miBtn">
                    <input class="registro" value="REGISTRAR" name="accion" type="submit" id="miBtn" <%try{if(!abo.getCedulaAbogado().equals("")){%>disabled<%}}catch(Exception e){}%> >
                    <input class="registro" value="MODIFICAR" name="accion" type="submit" id="miBtn" <%try{if(abo.getCedulaAbogado()==null){%>disabled<%}}catch(Exception e){}%> >                      
                    <input class="registro" value="LIMPIAR" name="LIMPIAR" type="reset" id="miBtn" onClick="<% abo = new Abogado(); %>" > 
                    
                <div class="footer">
                    <footer>
                        <p><h6>&copy Todos los derechos reservados</h6></p>
                    </footer>
                </div>
                        
        </form>
    </body>
</html>
