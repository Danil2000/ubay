/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-02-18 22:16:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class start_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"description\" content=\"Ubay\">\n");
      out.write("    <meta name=\"keywords\" content=\"HTML, CSS, JS, Java, ucode, unitfactory, cbl, cblworld\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Ubay</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/global.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/reset.css\">\n");
      out.write("    <script src=\"../js/start.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header class=\"header\">\n");
      out.write("        <div class=\"header-top\">\n");
      out.write("            <div class=\"header-logo\">\n");
      out.write("            <span>UBAY</span>\n");
      out.write("            </span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"header-menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a style=\"color: #ffffff\" href=\"#\">About Us</a></li>\n");
      out.write("                    <li><a style=\"color: #ffffff\" href=\"#\">FAQ</a></li>\n");
      out.write("                    <li><a style=\"color: #ffffff\" href=\"#\">Contacts Us</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"header-login-first\" class=\"header-login\">\n");
      out.write("                <a style=\"color: #ffffff\" class=\"abutton\" href=\"/ubay/signIn\">Sign in</a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"header-login-second\" class=\"header-login\" style=\"display: none\">\n");
      out.write("                <a id=\"authorizedLogin\" class=\"abutton\" href=\"\"></a>\n");
      out.write("                <a style=\"color: #ffffff\" class=\"abutton\" href=\"/logout\">Sign out</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <div class=\"form-start-style\">\n");
      out.write("    <h1>Welcome</h1>\n");
      out.write("    <p>Please choose sign in or sign up</p>\n");
      out.write("    <a href=\"/ubay/signIn\"> Sign In</a>\n");
      out.write("    <a href=\"/ubay/signUp\"> Sign Up</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"footer-back\"></div>\n");
      out.write("        <div class=\"footflexbox page\">\n");
      out.write("            <div class=\"copyright footbox\">\n");
      out.write("                <p>Copyright &copy; 2021 | Ubay Ucode | All Rights Reserved</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"terms footbox\">\n");
      out.write("                <p>Terms of Service | Privacy Policy</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
