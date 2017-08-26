package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class HomePage_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("<style type=\"text/css\"> \r\n");
      out.write("<!-- \r\n");
      out.write("body  {\r\n");
      out.write("\tfont: 100% Verdana, Arial, Helvetica, sans-serif;\r\n");
      out.write("\tbackground: #666666;\r\n");
      out.write("\tmargin: 0; /* it's good practice to zero the margin and padding of the body element to account for differing browser defaults */\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\ttext-align: center; /* this centers the container in IE 5* browsers. The text is then set to the left aligned default in the #container selector */\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("\tbackground-color: #FFFFFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Tips for Elastic layouts \r\n");
      out.write("1. Since the elastic layouts overall sizing is based on the user's default fonts size, they are more unpredictable. Used correctly, they are also more accessible for those that need larger fonts size since the line length remains proportionate.\r\n");
      out.write("2. Sizing of divs in this layout are based on the 100% font size in the body element. If you decrease the text size overall by using a font-size: 80% on the body element or the #container, remember that the entire layout will downsize proportionately. You may want to increase the widths of the various divs to compensate for this.\r\n");
      out.write("3. If font sizing is changed in differing amounts on each div instead of on the overall design (ie: #sidebar1 is given a 70% font size and #mainContent is given an 85% font size), this will proportionately change each of the divs overall size. You may want to adjust based on your final font sizing.\r\n");
      out.write("*/\r\n");
      out.write(".twoColElsLtHdr #container { \r\n");
      out.write("\twidth: 46em;  /* this width will create a container that will fit in an 800px browser window if text is left at browser default font sizes */\r\n");
      out.write("\tbackground: #FFFFFF;\r\n");
      out.write("\tmargin: 0 auto; /* the auto margins (in conjunction with a width) center the page */\r\n");
      out.write("\tborder: 1px solid #000000;\r\n");
      out.write("\ttext-align: left; /* this overrides the text-align: center on the body element. */\r\n");
      out.write("} \r\n");
      out.write(".twoColElsLtHdr #header { \r\n");
      out.write("\tbackground: #DDDDDD; \r\n");
      out.write("\tpadding: 0 10px;  /* this padding matches the left alignment of the elements in the divs that appear beneath it. If an image is used in the #header instead of text, you may want to remove the padding. */\r\n");
      out.write("} \r\n");
      out.write(".twoColElsLtHdr #header h1 {\r\n");
      out.write("\tmargin: 0; /* zeroing the margin of the last element in the #header div will avoid margin collapse - an unexplainable space between divs. If the div has a border around it, this is not necessary as that also avoids the margin collapse */\r\n");
      out.write("\tpadding: 10px 0; /* using padding instead of margin will allow you to keep the element away from the edges of the div */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Tips for sidebar1:\r\n");
      out.write("1. Be aware that if you set a font-size value on this div, the overall width of the div will be adjusted accordingly.\r\n");
      out.write("2. Since we are working in ems, it's best not to use padding on the sidebar itself. It will be added to the width for standards compliant browsers creating an unknown actual width. \r\n");
      out.write("3. Space between the side of the div and the elements within it can be created by placing a left and right margin on those elements as seen in the \".twoColElsLtHdr #sidebar1 p\" rule.\r\n");
      out.write("*/\r\n");
      out.write(".twoColElsLtHdr #sidebar1 {\r\n");
      out.write("\tfloat: left; \r\n");
      out.write("\twidth: 12em; /* since this element is floated, a width must be given */\r\n");
      out.write("\tbackground: #EBEBEB; /* the background color will be displayed for the length of the content in the column, but no further */\r\n");
      out.write("\tpadding: 15px 0; /* top and bottom padding create visual space within this div */\r\n");
      out.write("}\r\n");
      out.write(".twoColElsLtHdr #sidebar1 h3, .twoColElsLtHdr #sidebar1 p {\r\n");
      out.write("\tmargin-left: 10px; /* the left and right margin should be given to every element that will be placed in the side columns */\r\n");
      out.write("\tmargin-right: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Tips for mainContent:\r\n");
      out.write("1. If you give this #mainContent div a font-size value different than the #sidebar1 div, the margins of the #mainContent div will be based on its font-size and the width of the #sidebar1 div will be based on its font-size. You may wish to adjust the values of these divs.\r\n");
      out.write("2. The space between the mainContent and sidebar1 is created with the left margin on the mainContent div.  No matter how much content the sidebar1 div contains, the column space will remain. You can remove this left margin if you want the #mainContent div's text to fill the #sidebar1 space when the content in #sidebar1 ends.\r\n");
      out.write("3. To avoid float drop, you may need to test to determine the approximate maximum image/element size since this layout is based on the user's font sizing combined with the values you set. However, if the user has their browser font size set lower than normal, less space will be available in the #mainContent div than you may see on testing.\r\n");
      out.write("4. In the Internet Explorer Conditional Comment below, the zoom property is used to give the mainContent \"hasLayout.\" This avoids several IE-specific bugs that may occur.\r\n");
      out.write("*/\r\n");
      out.write(".twoColElsLtHdr #mainContent {\r\n");
      out.write("\tmargin: 0 1.5em 0 13em; /* the right margin can be given in ems or pixels. It creates the space down the right side of the page. */\r\n");
      out.write("} \r\n");
      out.write(".twoColElsLtHdr #footer { \r\n");
      out.write("\tpadding: 0 10px; /* this padding matches the left alignment of the elements in the divs that appear above it. */\r\n");
      out.write("\tbackground:#DDDDDD;\r\n");
      out.write("} \r\n");
      out.write(".twoColElsLtHdr #footer p {\r\n");
      out.write("\tmargin: 0; /* zeroing the margins of the first element in the footer will avoid the possibility of margin collapse - a space between divs */\r\n");
      out.write("\tpadding: 10px 0; /* padding on this element will create space, just as the the margin would have, without the margin collapse issue */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Miscellaneous classes for reuse */\r\n");
      out.write(".fltrt { /* this class can be used to float an element right in your page. The floated element must precede the element it should be next to on the page. */\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("\tmargin-left: 8px;\r\n");
      out.write("}\r\n");
      out.write(".fltlft { /* this class can be used to float an element left in your page */\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tmargin-right: 8px;\r\n");
      out.write("}\r\n");
      out.write(".clearfloat { /* this class should be placed on a div or break element and should be the final element before the close of a container that should fully contain a float */\r\n");
      out.write("\tclear:both;\r\n");
      out.write("    height:0;\r\n");
      out.write("    font-size: 1px;\r\n");
      out.write("    line-height: 0px;\r\n");
      out.write("}\r\n");
      out.write(".style2 {color: #006633; font-size: 36px; font-family: \"Brush Script MT\";}\r\n");
      out.write("--> \r\n");
      out.write("</style><!--[if IE]>\r\n");
      out.write("<style type=\"text/css\"> \r\n");
      out.write("/* place css fixes for all versions of IE in this conditional comment */\r\n");
      out.write(".twoColElsLtHdr #sidebar1 { padding-top: 30px; }\r\n");
      out.write(".twoColElsLtHdr #mainContent { zoom: 1; padding-top: 15px; }\r\n");
      out.write("/* the above proprietary zoom property gives IE the hasLayout it needs to avoid several bugs */\r\n");
      out.write("</style>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<script src=\"SpryAssets/SpryTabbedPanels.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("function MM_swapImgRestore() { //v3.0\r\n");
      out.write("  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;\r\n");
      out.write("}\r\n");
      out.write("function MM_preloadImages() { //v3.0\r\n");
      out.write("  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();\r\n");
      out.write("    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)\r\n");
      out.write("    if (a[i].indexOf(\"#\")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function MM_findObj(n, d) { //v4.01\r\n");
      out.write("  var p,i,x;  if(!d) d=document; if((p=n.indexOf(\"?\"))>0&&parent.frames.length) {\r\n");
      out.write("    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}\r\n");
      out.write("  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];\r\n");
      out.write("  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);\r\n");
      out.write("  if(!x && d.getElementById) x=d.getElementById(n); return x;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function MM_swapImage() { //v3.0\r\n");
      out.write("  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)\r\n");
      out.write("   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}\r\n");
      out.write("}\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("<link href=\"SpryAssets/SpryTabbedPanels.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"twoColElsLtHdr\" onload=\"MM_preloadImages('../../projectpicture/images1.jpg','../../projectpicture/images2.jpg')\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("  <div id=\"header\">\r\n");
      out.write("    <h1><img src=\"Logo.JPG\" alt=\"\" width=\"725\" height=\"165\" align=\"middle\" /></h1>\r\n");
      out.write("    <!-- end #header -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <div id=\"sidebar1\">\r\n");
      out.write("    <h3><a href=\"#\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Bus','','../../projectpicture/images1.jpg',1)\"></a><a href=\"#\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Bus2','','../../projectpicture/images2.jpg',1)\"></a></h3>\r\n");
      out.write("  <!-- end #sidebar1 --></div>\r\n");
      out.write("  <div id=\"mainContent\">\r\n");
      out.write("    <form name=\"form\" id=\"form\">\r\n");
      out.write("      <div id=\"TabbedPanels1\" class=\"TabbedPanels\">\r\n");
      out.write("        <ul class=\"TabbedPanelsTabGroup\">\r\n");
      out.write("          <li class=\"TabbedPanelsTab\" tabindex=\"0\">Tab 1</li>\r\n");
      out.write("          <li class=\"TabbedPanelsTab\" tabindex=\"0\">Tab 2</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"TabbedPanelsContentGroup\">\r\n");
      out.write("          <div class=\"TabbedPanelsContent\">Content 1</div>\r\n");
      out.write("          <div class=\"TabbedPanelsContent\">Content 2</div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </form>\r\n");
      out.write("    </div>\r\n");
      out.write("   <div id=\"footer\">\r\n");
      out.write("\t  <!-- end #footer -->\r\n");
      out.write("  </div>\r\n");
      out.write("<!-- end #container --></div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("var TabbedPanels1 = new Spry.Widget.TabbedPanels(\"TabbedPanels1\");\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
