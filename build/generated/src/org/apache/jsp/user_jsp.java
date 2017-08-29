package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import modelo.Abogado;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String msj; 
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=UTF-8\"/>\n");
      out.write("        <title>Usuarios</title>\n");
      out.write("        <link href=\"estilos/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"");
      out.print( request.getContextPath());
      out.write("/js/funciones.js\" type=\"text/javascript\"></script> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1></h1>\n");
      out.write("        <div id=\"todo\">\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
 msj =(String)request.getAttribute("mensaje2"); 
      out.write("\n");
      out.write("            <div id=\"msj\" ");
 if(msj==null){
      out.write(" style=\"visibility: hidden;\" ");
} 
      out.write(" >                \n");
      out.write("                ");
      out.print( msj );
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <table border=\"1\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th colspan=\"6\">Datos Abogado</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>CEDULA</td>\n");
      out.write("                            <td>NOMBRE</td>\n");
      out.write("                            <td>TELEFONO</td>\n");
      out.write("                            <td>BIOGRAFIA</td>\n");
      out.write("                            <td>ESPECIALIDAD</td>\n");
      out.write("                            <td>ACCIONES </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
 
                            try {
                                ArrayList<Abogado> abogados = (ArrayList<Abogado>) request.getAttribute("datos");
                            for (Abogado uno : abogados) {
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td> ");
      out.print( uno.getCedulaAbogado());
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( uno.getNombreAbogado());
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( uno.getNumeroTelefonoAbogado());
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( uno.getBiograiaAbogado());
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( uno.getIdEspecialidad());
      out.write(" </td>\n");
      out.write("                            <td> <a href=\"javascript:void(0)\" onclick=\"eliminar('");
      out.print(request.getContextPath() );
      out.write("/eliminar?CEDULA=");
      out.print( uno.getCedulaAbogado());
      out.write("')\" >Eliminar</a> &nbsp \n");
      out.write("                                <a href=\"");
      out.print(request.getContextPath() );
      out.write("/agregar?CEDULA=");
      out.print( uno.getCedulaAbogado());
      out.write("\">Modificar</a> </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
 }
                        
                        
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("                    ");
} catch (Exception e) {
                    }
                
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
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
