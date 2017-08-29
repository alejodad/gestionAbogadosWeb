package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Abogado;
import java.util.ArrayList;
import modelo.Especialidad;
import cad.cadAbogado;

public final class agregar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 ArrayList<Especialidad> espec = cadAbogado.mostrarEspecialidades();
            Especialidad obj = new Especialidad();
            Abogado abo = new Abogado();

        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=UTF-8\">\n");
      out.write("        <title>Agregar Usuario</title>\n");
      out.write("        <link href=\"estilos/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <form id=\"formReg\" action=\"");
      out.print( request.getContextPath() );
      out.write("/agregarPosth\" method=\"POST\">\t\n");
      out.write("            <div id=\"bienvenida\">\t\t\n");
      out.write("                <h2>REGISTRO</h2>\n");
      out.write("                <h6>Ingrese sus datos personales</h6>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"todo\">\n");
      out.write("                <div class=\"campoReg\">\n");
      out.write("                    <div class=\"campoNombreReg\">\n");
      out.write("                        <label for=\"cedula\">CEDULA</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"campoinputReg\">\n");
      out.write("                        <input type=\"text\" name=\"CEDULA\" id=\"cedula\" maxlength=\"15\" placeholder=\"Ejemplo 1537.........\" \n");
      out.write("                               pattern=\"[0-9]{7,15}\" title=\"La cedula debe contener numeros\" required autofocus value =\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"campoReg\">\n");
      out.write("                    <div class=\"campoNombreReg\">\n");
      out.write("                        <label for=\"nombre\">NOMBRE</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"campoinputReg\">\n");
      out.write("                        <input type=\"text\" required id=\"nombre\" name=\"NOMBRE\" value=\"\" placeholder=\"Ejemplo pedro\" maxlength=\"30\" \n");
      out.write("                               pattern=\"[a-zA-Z]{3,10}\" title=\"El nombre solo debe llevar letras\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"campoReg\">\n");
      out.write("                    <div class=\"campoNombreReg\">\n");
      out.write("                        <label for=\"telefono\">TEEFONO</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"campoinputReg\">\n");
      out.write("                        <input type=\"text\" required id=\"telefono\" name=\"TELEFONO\" value=\"\" maxlength=\"10\" placeholder=\"Ejemplo 1537.........\" \n");
      out.write("                               pattern=\"[0-9]{7,10}\" title=\"El telefono debe contener numeros\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"campoReg\">\n");
      out.write("                    <div class=\"campoNombreReg\">\n");
      out.write("                        <label for=\"biografia\">BIOGRAFIA</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"campoinputReg\">\n");
      out.write("                        <textarea id=\"biografia\" name=\"BIOGRAFIA\" value=\"\"  placeholder=\"Escriba la biografia \"></textarea>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"campoReg\">\n");
      out.write("                    <div class=\"campoNombreReg\">\n");
      out.write("                        <label for=\"especialidad\">EDAD</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"campoinputReg\">\n");
      out.write("                        <select name=\"espec\" id=\"especialidad\">\n");
      out.write("                            <option value=\"\">SELECCIONE </option>  \n");
      out.write("                            ");

                                    for (Especialidad uno : espec) {
      out.write("\n");
      out.write("                            <option value=\"");
      out.print( uno.getIdEspecialidad());
      out.write("\"> ");
      out.print( uno.getNombreEspecialidad());
      out.write(" </option>    \n");
      out.write("                            ");
}
      out.write("                     \n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div>\t\t\t\t \n");
      out.write("                    <input class=\"registro\" value=\"BUSCAR\" name=\"ACCION\" type=\"submit\" id=\"miBtn\">\n");
      out.write("                    <input class=\"registro\" value=\"REGISTRAR\" name=\"ACCION\" type=\"submit\" id=\"miBtn\">\n");
      out.write("                    <input class=\"registro\" value=\"MODIFICAR\" name=\"ACCION\" type=\"submit\" id=\"miBtn\">\n");
      out.write("                    <input class=\"registro\" value=\"ELIMINAR\" name=\"ACCION\" type=\"submit\" id=\"miBtn\">\n");
      out.write("                    <input class=\"registro\" value=\"LIMPIAR\" name=\"ACCION\" type=\"reset\" id=\"miBtn\" onClick=\"document.getElementById('oculto').style.visibility='hidden'\"> \n");
      out.write("                    \n");
      out.write("                <div class=\"footer\">\n");
      out.write("                    <footer>\n");
      out.write("                        <p><h6>&copy Todos los derechos reservados</h6></p>\n");
      out.write("                    </footer>\n");
      out.write("                </div>\n");
      out.write("                        \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
