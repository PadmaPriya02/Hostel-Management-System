package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>TBAK</title>\n");
      out.write("    \n");
      out.write("        <style>\n");
      out.write("           table, td, th {\n");
      out.write("               border: 1px solid black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("th {\n");
      out.write("    background-color: black;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("#header {\n");
      out.write("    background-color:black;\n");
      out.write("    color:white;\n");
      out.write("    text-align:center;\n");
      out.write("   \n");
      out.write("height:200px;\n");
      out.write("width: 100%;\n");
      out.write("}\n");
      out.write("body{\t\n");
      out.write("    font-family: Arial, Helvetica, sans-serif;\n");
      out.write("    font-size: 18px;\n");
      out.write("    line-height: 25px;\n");
      out.write("    color: #ffffff;\n");
      out.write("    background: #0a6a5b url(images/bg.jpg);\n");
      out.write("}\n");
      out.write("#footer {\n");
      out.write("    background-color:black;\n");
      out.write("    color:white;\n");
      out.write("    clear:both;\n");
      out.write("    text-align:center;\n");
      out.write("   \t \t \n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"header\">\n");
      out.write("   \n");
      out.write("   <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/image/logo1.png\" width=\"450px\" height=\"120px\"/>\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    \n");
      out.write("    <a style=\"color: #0a6a5b; font-size: x-large;\" href=\"login.jsp\">Login</a><br><br>\n");
      out.write("     \n");
      out.write("     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    \n");
      out.write("     <a style=\"color: #0a6a5b; font-size: x-large\" href=\"register.jsp\">Register</a><br>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("   <div style=\"color: #0a6a5b\"><br><br>\n");
      out.write("       <table cellpadding=\"5\" width=\"70%\" bgcolor=\"white\" style=\"font-size: x-large; border-color: black; border-radius: 4px;\" align=\"center\" cellspacing=\"5\">\n");
      out.write("           <tr style=\"font-weight: bold;\">\n");
      out.write("            <th>Day </th>\n");
      out.write("            <th>Time</th>\n");
      out.write("            <th>Menu</th>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>7:30-9:00(AM)</td>\n");
      out.write("            <td>Idly with onion chutney/coconut chutney</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Monday</td>\n");
      out.write("            <td>12:40-1:40(PM)</td>\n");
      out.write("            <td>Vegetable biriyani</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>6:30-7:00(PM)</td>\n");
      out.write("            <td>Bajji</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>8:00-9:30</td>\n");
      out.write("            <td>Onion Uthappam</td>\n");
      out.write("        </tr>\n");
      out.write("         <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>7:30-9:00(AM)</td>\n");
      out.write("            <td>Pongal with coconut chutney</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Tuesday</td>\n");
      out.write("            <td>12:40-1:40(PM)</td>\n");
      out.write("            <td>Chicken Biriyani with egg</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>6:30-7:00(PM)</td>\n");
      out.write("            <td>Samosa</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>8:00-9:30</td>\n");
      out.write("            <td>Puri</td>\n");
      out.write("        </tr>\n");
      out.write("         <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>7:30-9:00(AM)</td>\n");
      out.write("            <td>Poha</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Wednesday</td>\n");
      out.write("            <td>12:40-1:40(PM)</td>\n");
      out.write("            <td>Sambar rice</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>6:30-7:00(PM)</td>\n");
      out.write("            <td>Pani Puri</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>8:00-9:30</td>\n");
      out.write("            <td>Chappati</td>\n");
      out.write("        </tr>\n");
      out.write("         <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>7:30-9:00(AM)</td>\n");
      out.write("            <td>Semiya Upma</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Thursday</td>\n");
      out.write("            <td>12:40-1:40(PM)</td>\n");
      out.write("            <td>Fried rice</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>6:30-7:00(PM)</td>\n");
      out.write("            <td>Sprouts sundal</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>8:00-9:30</td>\n");
      out.write("            <td>Dosa</td>\n");
      out.write("        </tr>\n");
      out.write("         <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>7:30-9:00(AM)</td>\n");
      out.write("            <td>Maggie</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Monday</td>\n");
      out.write("            <td>12:40-1:40(PM)</td>\n");
      out.write("            <td>Full meals</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>6:30-7:00(PM)</td>\n");
      out.write("            <td>Bhel Puri</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>8:00-9:30</td>\n");
      out.write("            <td>Curd rice</td>\n");
      out.write("        </tr>\n");
      out.write("         <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>7:30-9:00(AM)</td>\n");
      out.write("            <td>Idyappam</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Friday</td>\n");
      out.write("            <td>12:40-1:40(PM)</td>\n");
      out.write("            <td>Mutton rice</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>6:30-7:00(PM)</td>\n");
      out.write("            <td>Kesari</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>8:00-9:30</td>\n");
      out.write("            <td>Sevai</td>\n");
      out.write("        </tr>\n");
      out.write("         <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>7:30-9:00(AM)</td>\n");
      out.write("            <td>Lemon rice</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Saturday</td>\n");
      out.write("            <td>12:40-1:40(PM)</td>\n");
      out.write("            <td>Egg biriyani/Mini meals</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>6:30-7:00(PM)</td>\n");
      out.write("            <td>Pakoda</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>8:00-9:30</td>\n");
      out.write("            <td>Idly with sambar</td>\n");
      out.write("        </tr>\n");
      out.write("         <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>7:30-9:00(AM)</td>\n");
      out.write("            <td>Idly with onion chutney/coconut chutney</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Sunday</td>\n");
      out.write("            <td>12:40-1:40(PM)</td>\n");
      out.write("            <td>Fish rice/variety rice</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>6:30-7:00(PM)</td>\n");
      out.write("            <td>Kesari</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>8:00-9:30</td>\n");
      out.write("            <td>Tamarind rice</td>\n");
      out.write("        </tr>\n");
      out.write("       </table>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"footer\">\n");
      out.write("Copyright ©tbakwomenshostel.com\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
