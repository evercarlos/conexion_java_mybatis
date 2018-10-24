package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>WEBs</title>\r\n");
      out.write("       \r\n");
      out.write(" <link href=\"public/css/jquery-ui.min.css\" rel=\"stylesheet\">\r\n");
      out.write(" <link  href=\"public/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write(" <link href=\"public/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"public/css/style.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"public/css/jtable/jtable.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"public/css/jtable/jtable_jqueryui.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"public/css/jtable/jquery-ui.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"public/css/i-check/icheck.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"public/css/admin.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        var width_page = (screen.width > 480) ? 480 : 320;\r\n");
      out.write("        var base_url = '{{ url('/') }}';\r\n");
      out.write("\r\n");
      out.write("        var show_list_ = !(/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent));\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <div class=\"col-sm-2\"></div>\r\n");
      out.write("            <div class=\"col-sm-1\">\r\n");
      out.write("                <button class=\"btn btn-primary\" id=\"btn_load\">Cargar</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-8\">\r\n");
      out.write("                <div id=\"load_url\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("     <script src=\"public/js/jquery.min.js\"></script>\r\n");
      out.write("     <script src=\"public/js/jquery-ui.min.js\"></script><!-- hik.jtable= para el error-->\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("   \r\n");
      out.write("    <script src=\"public/js/jquery.jtable.js\"></script>  \r\n");
      out.write("    <script src=\"public/js/jquery.jtable.es.js\"></script>  \r\n");
      out.write("    <script src=\"public/js/icheck.min.js\"></script>  \r\n");
      out.write("    <script src=\"public/js/admin.js\"></script>\r\n");
      out.write("    <script src=\"public/frontend/profiles.js\"></script>\r\n");
      out.write("    <script src=\"public/frontend/profilesForm.js\"></script>\r\n");
      out.write("</html>\r\n");
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
