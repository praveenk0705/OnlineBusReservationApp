package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<!-- DW6 -->\n");
      out.write("<head>\n");
      out.write("<!-- Copyright 2005 Macromedia, Inc. All rights reserved. -->\n");
      out.write("<title>Home Page</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"mm_travel2.css\" type=\"text/css\" />\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\">\n");
      out.write("//--------------- LOCALIZEABLE GLOBALS ---------------\n");
      out.write("var d=new Date();\n");
      out.write("var monthname=new Array(\"January\",\"February\",\"March\",\"April\",\"May\",\"June\",\"July\",\"August\",\"September\",\"October\",\"November\",\"December\");\n");
      out.write("//Ensure correct for language. English is \"January 1, 2004\"\n");
      out.write("var TODAY = monthname[d.getMonth()] + \" \" + d.getDate() + \", \" + d.getFullYear();\n");
      out.write("//---------------   END LOCALIZEABLE   ---------------\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#C0DFFD\">\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("  <tr bgcolor=\"#3366CC\">\n");
      out.write("    <td width=\"382\" colspan=\"3\" rowspan=\"2\"><img src=\"images/mm_travel_photo.jpg\" alt=\"Header image\" width=\"382\" height=\"127\" border=\"0\" /></td>\n");
      out.write("    <td width=\"378\" height=\"63\" colspan=\"3\" id=\"logo\" valign=\"bottom\" align=\"center\" nowrap=\"nowrap\">Get Set Go...</td>\n");
      out.write("    <td width=\"100%\">&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("\n");
      out.write("  <tr bgcolor=\"#3366CC\">\n");
      out.write("    <td height=\"64\" colspan=\"3\" id=\"tagline\" valign=\"top\" align=\"right\">at your place</td>\n");
      out.write("\t<td width=\"100%\">&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("\n");
      out.write("  <tr>\n");
      out.write("    <td colspan=\"7\" bgcolor=\"#003366\"><img src=\"mm_spacer.gif\" alt=\"\" width=\"1\" height=\"1\" border=\"0\" /></td>\n");
      out.write("  </tr>\n");
      out.write("\n");
      out.write("  <tr bgcolor=\"#CCFF99\">\n");
      out.write("  \t<td colspan=\"7\" id=\"dateformat\" height=\"25\">&nbsp;&nbsp;<script language=\"JavaScript\" type=\"text/javascript\">\n");
      out.write("      document.write(TODAY);\t</script>\t</td>\n");
      out.write("  </tr>\n");
      out.write(" <tr>\n");
      out.write("    <td colspan=\"7\" bgcolor=\"#003366\"><img src=\"mm_spacer.gif\" alt=\"\" width=\"1\" height=\"1\" border=\"0\" /></td>\n");
      out.write("  </tr>\n");
      out.write("\n");
      out.write(" <tr>\n");
      out.write("    <td width=\"165\" valign=\"top\" bgcolor=\"#E6F3FF\">\n");
      out.write("\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"165\" id=\"navigation\">\n");
      out.write("        <tr>\n");
      out.write("          <td width=\"165\">&nbsp;<br />\n");
      out.write("\t\t &nbsp;<br /></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td width=\"165\"><a href=\"javascript:;\" class=\"navText\">HOME</a></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td width=\"165\"><a href=\"UserLogin.jsp\" class=\"navText\">E-TICKET</a></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td width=\"165\"><a href=\"TimeTable.jsp\" class=\"navText\">TIME-TABLE</a></td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("          <td width=\"165\"><a href=\"javascript:;\" class=\"navText\">FEEDBACK</a></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td width=\"165\"><a href=\"javascript:;\" class=\"navText\">FAQ</a></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td width=\"165\"><a href=\"javascript:;\" class=\"navText\">CONTACT US</a></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td width=\"165\"><a href=\"javascript:;\" class=\"navText\">ABOUT US</a></td>\n");
      out.write("        </tr>\n");
      out.write("      </table>\n");
      out.write(" \t <br />\n");
      out.write("  \t&nbsp;<br />\n");
      out.write("  \t&nbsp;<br />\n");
      out.write("  \t&nbsp;<br /> \t</td>\n");
      out.write("    <td width=\"50\"><img src=\"mm_spacer.gif\" alt=\"\" width=\"50\" height=\"1\" border=\"0\" /></td>\n");
      out.write("    <td width=\"305\" colspan=\"2\" valign=\"top\"><img src=\"mm_spacer.gif\" alt=\"\" width=\"305\" height=\"1\" border=\"0\" /><br />\n");
      out.write("\t&nbsp;<br />\n");
      out.write("\t&nbsp;<br />\n");
      out.write("\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"305\">\n");
      out.write("        <tr>\n");
      out.write("          <td class=\"pageName\">Get Set Go...</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t<tr>\n");
      out.write("          <td class=\"bodyText\"><p>Get set go... is not only an online travel agency, it is also an enabler of bus travel industry in India.</p>\n");
      out.write("              <p> It is a 100% real time bus tickets booking service. We understand that relative position of a seat in a bus is extremely critical for your comfort, and Get set Go.. enables you to select the best possible seat option available during the time of your bus ticket booking. </p></td>\n");
      out.write("        </tr>\n");
      out.write("      </table>\n");
      out.write("\t   <br />\t  </td>\n");
      out.write("    <td width=\"50\"><img src=\"mm_spacer.gif\" alt=\"\" width=\"50\" height=\"1\" border=\"0\" /></td>\n");
      out.write("        <td width=\"190\" valign=\"top\"><br />\n");
      out.write("\t\t&nbsp;<br />\n");
      out.write("\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"190\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t<td colspan=\"3\" class=\"subHeader\" align=\"center\">OUR SERVICES</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t<td width=\"40\"><img src=\"mm_spacer.gif\" alt=\"\" width=\"40\" height=\"1\" border=\"0\" /></td>\n");
      out.write("\t\t\t<td width=\"110\" id=\"sidebar\" class=\"smallText\"><br />\n");
      out.write("\t\t\t<p><img src=\"images/images2.jpg\" alt=\"Image 1\" width=\"180\" height=\"110\" vspace=\"6\" border=\"0\" /><br />\n");
      out.write("\t\t\t  Our Buses<br />\n");
      out.write("\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t<p><img src=\"images/images4.jpg\" alt=\"Image 2\" width=\"180\" height=\"110\" vspace=\"6\" border=\"0\" /><br />\n");
      out.write("\t\t\t  Buses Seats<br />\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t\t <br />\n");
      out.write("\t\t\t&nbsp;<br />\n");
      out.write("\t\t\t&nbsp;<br />\t\t\t</td>\n");
      out.write("\t\t\t<td width=\"40\">&nbsp;</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\t</td>\n");
      out.write("\t<td width=\"100%\">&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"165\">&nbsp;</td>\n");
      out.write("    <td width=\"50\">&nbsp;</td>\n");
      out.write("    <td width=\"167\">&nbsp;</td>\n");
      out.write("    <td width=\"138\">&nbsp;</td>\n");
      out.write("    <td width=\"50\">&nbsp;</td>\n");
      out.write("    <td width=\"190\">&nbsp;</td>\n");
      out.write("    <td width=\"100%\">&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
