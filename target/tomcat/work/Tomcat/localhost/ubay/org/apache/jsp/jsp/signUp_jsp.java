/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-02-01 23:14:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Sign Up</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form class=\"form-signup form-signup-left\" id=\"formSignUp\" action=\"/ubay/signUp\" method=\"POST\" name=\"form\">\n");
      out.write("    <input class=\"form-styling\" style=\"display: none\" type=\"text\" name=\"type\" placeholder=\"\" value=\"signup\"/>\n");
      out.write("    <input class=\"form-styling\" style=\"display: none\" type=\"text\" name=\"verification\" placeholder=\"\" value=\"not verificated\"/>\n");
      out.write("    <label for=\"userRole\">Role</label>\n");
      out.write("    <select id=\"userRole\" class=\"form-styling\" name=\"userRole\">\n");
      out.write("        <option>seller</option>\n");
      out.write("        <option>bidder</option>\n");
      out.write("    </select>\n");
      out.write("    <label for=\"balance\">Balance</label>\n");
      out.write("    <input id=\"balance\" class=\"form-styling\" type=\"number\" name=\"balance\"\n");
      out.write("           step=\"1\" min=\"100\" max=\"50000\" value=\"100\" size=\"5\" required/>\n");
      out.write("    <label for=\"loginSignUp\">Username</label>\n");
      out.write("    <input id=\"loginSignUp\" class=\"form-styling\" type=\"text\" name=\"login\" required autofocus/>\n");
      out.write("    <label for=\"passwordSignUp\">Password</label>\n");
      out.write("    <div>\n");
      out.write("        <input id=\"passwordSignUp\" class=\"form-styling\" type=\"password\" name=\"password\" autocomplete=\"on\" required/>\n");
      out.write("        <span toggle=\"#passwordSignUp\" class=\"fa fa-fw fa-eye field-icon toggle-password\"></span>\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("        <label for=\"confirmpassword\">Confirm password</label>\n");
      out.write("        <input id=\"confirmpassword\" class=\"form-styling\" type=\"password\" name=\"confirmpassword\" required\n");
      out.write("               autocomplete=\"on\" />\n");
      out.write("        <span toggle=\"#confirmpassword\" class=\"fa fa-fw fa-eye field-icon toggle-password\"></span>\n");
      out.write("    </div>\n");
      out.write("    <input class=\"btn-signup\" type=\"submit\" onclick=\"checkPasswordMatch()\" value=\"Sign up\">\n");
      out.write("</form>\n");
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
