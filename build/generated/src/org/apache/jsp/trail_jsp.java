package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class trail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_option_value_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_id_collection;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_value_property_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_option_value_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_id_collection = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_select_property.release();
    _jspx_tagPool_html_option_value_key_nobody.release();
    _jspx_tagPool_logic_iterate_id_collection.release();
    _jspx_tagPool_html_submit_value_property_nobody.release();
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
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      forms.HibernateBean bean = null;
      synchronized (_jspx_page_context) {
        bean = (forms.HibernateBean) _jspx_page_context.getAttribute("bean", PageContext.PAGE_SCOPE);
        if (bean == null){
          bean = new forms.HibernateBean();
          _jspx_page_context.setAttribute("bean", bean, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(".style1 {\n");
      out.write("\tfont-size: 12px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write(".style5 {font-size: 12px; font-weight: bold; color: #3366CC; }\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#C0DFFD\">\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("  <tr bgcolor=\"#3366CC\">\n");
      out.write("    <td colspan=\"3\" rowspan=\"2\"><img src=\"mm_travel_photo.jpg\" alt=\"Header image\" width=\"382\" height=\"127\" border=\"0\" /></td>\n");
      out.write("    <td height=\"63\" colspan=\"3\" id=\"logo\" valign=\"bottom\" align=\"center\" nowrap=\"nowrap\">Get Set Go...</td>\n");
      out.write("    <td width=\"21\">&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("\n");
      out.write("  <tr bgcolor=\"#3366CC\">\n");
      out.write("    <td height=\"64\" colspan=\"3\" id=\"tagline\" valign=\"top\" align=\"right\">at your place</td>\n");
      out.write("\t<td width=\"21\">&nbsp;</td>\n");
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
      out.write("          <td width=\"165\"><a href=\"javascript:;\" class=\"navText\">CHANGE PASSWORD</a></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td width=\"165\"><a href=\"javascript:;\" class=\"navText\">VIEW PROFILE</a></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td width=\"165\"><a href=\"javascript:;\" class=\"navText\">MY TICKETS</a></td>\n");
      out.write("        </tr>\n");
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
      out.write("          <td width=\"165\"><a href=\"javascript:;\" class=\"navText\">LOGOUT</a></td>\n");
      out.write("        </tr>\n");
      out.write("      </table>\n");
      out.write(" \t<br />\n");
      out.write("  \t&nbsp;<br />\n");
      out.write("  \t&nbsp;<br />\n");
      out.write("  \t&nbsp;<br /> \t</td>\n");
      out.write("    <td width=\"50\"><img src=\"mm_spacer.gif\" alt=\"\" width=\"50\" height=\"1\" border=\"0\" /></td>\n");
      out.write("    <td colspan=\"2\" valign=\"top\"><img src=\"mm_spacer.gif\" alt=\"\" width=\"305\" height=\"1\" border=\"0\" /><br />\n");
      out.write("\t&nbsp;<br />\n");
      out.write("\t&nbsp;<br />\n");
      out.write("\n");
      out.write(" ");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(_jspx_page_context);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction("bus_info.do");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("      <table width=\"617\" height=\"132\" border=\"1\" cellpadding=\"5\" cellspacing=\"2\">\n");
          out.write("      <caption>&nbsp;\n");
          out.write("      </caption>\n");
          out.write("        <tr>\n");
          out.write("        <td width=\"96\" height=\"42\" align=\"center\" class=\"style5\">From Stop</td>\n");
          out.write("      <td width=\"121\">\n");
          out.write("      ");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_0.setPageContext(_jspx_page_context);
          _jspx_th_html_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_0.setProperty("stopone");
          int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
          if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_0.doInitBody();
            }
            do {
              out.write("\n");
              out.write("                    ");
              if (_jspx_meth_html_option_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_select_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                    ");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_id_collection.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
              _jspx_th_logic_iterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
              _jspx_th_logic_iterate_0.setId("list");
              _jspx_th_logic_iterate_0.setCollection((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bean.stopList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
              int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
              if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object list = null;
                if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_iterate_0.doInitBody();
                }
                list = (java.lang.Object) _jspx_page_context.findAttribute("list");
                do {
                  out.write("\n");
                  out.write("                       ");
                  if (_jspx_meth_html_option_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_logic_iterate_0, _jspx_page_context))
                    return;
                  out.write("\n");
                  out.write("                    ");
                  int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
                  list = (java.lang.Object) _jspx_page_context.findAttribute("list");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_iterate_id_collection.reuse(_jspx_th_logic_iterate_0);
                return;
              }
              _jspx_tagPool_logic_iterate_id_collection.reuse(_jspx_th_logic_iterate_0);
              out.write("\n");
              out.write("              ");
              int evalDoAfterBody = _jspx_th_html_select_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_0);
            return;
          }
          _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_0);
          out.write("\n");
          out.write("\n");
          out.write("            </td>\n");
          out.write("\t    <td width=\"102\" align=\"center\"><span class=\"style5\">To Stop</span></td>\n");
          out.write("     <td width=\"149\">\n");
          out.write("\n");
          out.write("  ");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_1 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_1.setPageContext(_jspx_page_context);
          _jspx_th_html_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_1.setProperty("stoptwo");
          int _jspx_eval_html_select_1 = _jspx_th_html_select_1.doStartTag();
          if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_1.doInitBody();
            }
            do {
              out.write("\n");
              out.write("                    ");
              if (_jspx_meth_html_option_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_select_1, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                    ");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_1 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_id_collection.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_iterate_1.setPageContext(_jspx_page_context);
              _jspx_th_logic_iterate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
              _jspx_th_logic_iterate_1.setId("list");
              _jspx_th_logic_iterate_1.setCollection((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bean.stopList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
              int _jspx_eval_logic_iterate_1 = _jspx_th_logic_iterate_1.doStartTag();
              if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object list = null;
                if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_iterate_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_iterate_1.doInitBody();
                }
                list = (java.lang.Object) _jspx_page_context.findAttribute("list");
                do {
                  out.write("\n");
                  out.write("                       ");
                  if (_jspx_meth_html_option_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_logic_iterate_1, _jspx_page_context))
                    return;
                  out.write("\n");
                  out.write("                    ");
                  int evalDoAfterBody = _jspx_th_logic_iterate_1.doAfterBody();
                  list = (java.lang.Object) _jspx_page_context.findAttribute("list");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_logic_iterate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_logic_iterate_id_collection.reuse(_jspx_th_logic_iterate_1);
                return;
              }
              _jspx_tagPool_logic_iterate_id_collection.reuse(_jspx_th_logic_iterate_1);
              out.write("\n");
              out.write("              ");
              int evalDoAfterBody = _jspx_th_html_select_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_1);
            return;
          }
          _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_1);
          out.write("\n");
          out.write("            </td>\n");
          out.write("\t    </tr>\n");
          out.write("      <tr>\n");
          out.write("\n");
          out.write("        <td height=\"48\" align=\"center\"><span class=\"style5\">Journey Date</span></td>\n");
          out.write("        <td>\n");
          out.write("            <script type=\"text/javascript\" src=\"Datetimepicker/datetimepicker_css.js\"></script>\n");
          out.write("            <input id=demo1 maxLength=20 size=20/> <img style=\"CURSOR:pointer\" onclick=\"javascript:NewCssCal('demo1')\" alt=\"\" src=\"images/cal.gif\"/>\n");
          out.write("        </td>\n");
          out.write("\n");
          out.write("        <td align=\"center\"><span class=\"style5\">Bus Service </span></td>\n");
          out.write("<td><span class=\"style5\"> ");
          if (_jspx_meth_html_select_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("      </tr>\n");
          out.write("\n");
          out.write("\n");
          out.write("      <tr>\n");
          out.write("          <td height=\"30\" colspan=\"2\" align=\"center\">");
          if (_jspx_meth_html_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("        <td height=\"30\" colspan=\"2\" align=\"center\">");
          if (_jspx_meth_html_submit_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("      </tr>\n");
          out.write("    </table>\n");
          out.write(" ");
          int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
        return;
      }
      _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
      out.write("\n");
      out.write("\t<br /> </td>\n");
      out.write("  </tr>\n");
      out.write("\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"165\">&nbsp;</td>\n");
      out.write("    <td width=\"50\">&nbsp;</td>\n");
      out.write("    <td width=\"203\">&nbsp;</td>\n");
      out.write("    <td width=\"305\">&nbsp;</td>\n");
      out.write("    <td width=\"4\">&nbsp;</td>\n");
      out.write("    <td width=\"4\">&nbsp;</td>\n");
      out.write("     <td width=\"21\">&nbsp;</td>\n");
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

  private boolean _jspx_meth_html_option_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_0 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value_key_nobody.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_0.setPageContext(_jspx_page_context);
    _jspx_th_html_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
    _jspx_th_html_option_0.setKey("select");
    _jspx_th_html_option_0.setValue("Select Choice...");
    int _jspx_eval_html_option_0 = _jspx_th_html_option_0.doStartTag();
    if (_jspx_th_html_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value_key_nobody.reuse(_jspx_th_html_option_0);
      return true;
    }
    _jspx_tagPool_html_option_value_key_nobody.reuse(_jspx_th_html_option_0);
    return false;
  }

  private boolean _jspx_meth_html_option_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_1 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value_key_nobody.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_1.setPageContext(_jspx_page_context);
    _jspx_th_html_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_html_option_1.setKey((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_html_option_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_html_option_1 = _jspx_th_html_option_1.doStartTag();
    if (_jspx_th_html_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value_key_nobody.reuse(_jspx_th_html_option_1);
      return true;
    }
    _jspx_tagPool_html_option_value_key_nobody.reuse(_jspx_th_html_option_1);
    return false;
  }

  private boolean _jspx_meth_html_option_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_2 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value_key_nobody.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_2.setPageContext(_jspx_page_context);
    _jspx_th_html_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
    _jspx_th_html_option_2.setKey("select");
    _jspx_th_html_option_2.setValue("Select Choice...");
    int _jspx_eval_html_option_2 = _jspx_th_html_option_2.doStartTag();
    if (_jspx_th_html_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value_key_nobody.reuse(_jspx_th_html_option_2);
      return true;
    }
    _jspx_tagPool_html_option_value_key_nobody.reuse(_jspx_th_html_option_2);
    return false;
  }

  private boolean _jspx_meth_html_option_3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_3 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value_key_nobody.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_3.setPageContext(_jspx_page_context);
    _jspx_th_html_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_html_option_3.setKey((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_html_option_3.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_html_option_3 = _jspx_th_html_option_3.doStartTag();
    if (_jspx_th_html_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value_key_nobody.reuse(_jspx_th_html_option_3);
      return true;
    }
    _jspx_tagPool_html_option_value_key_nobody.reuse(_jspx_th_html_option_3);
    return false;
  }

  private boolean _jspx_meth_html_select_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_2 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_2.setPageContext(_jspx_page_context);
    _jspx_th_html_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_2.setProperty("servicetype");
    int _jspx_eval_html_select_2 = _jspx_th_html_select_2.doStartTag();
    if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_2.doInitBody();
      }
      do {
        out.write("</span>\n");
        out.write("                    ");
        if (_jspx_meth_html_option_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_select_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_html_option_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_select_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_html_option_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_select_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("             ");
        int evalDoAfterBody = _jspx_th_html_select_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_select_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_2);
      return true;
    }
    _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_2);
    return false;
  }

  private boolean _jspx_meth_html_option_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_4 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value_key_nobody.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_4.setPageContext(_jspx_page_context);
    _jspx_th_html_option_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_2);
    _jspx_th_html_option_4.setKey("select");
    _jspx_th_html_option_4.setValue("Select Choice...");
    int _jspx_eval_html_option_4 = _jspx_th_html_option_4.doStartTag();
    if (_jspx_th_html_option_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value_key_nobody.reuse(_jspx_th_html_option_4);
      return true;
    }
    _jspx_tagPool_html_option_value_key_nobody.reuse(_jspx_th_html_option_4);
    return false;
  }

  private boolean _jspx_meth_html_option_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_5 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value_key_nobody.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_5.setPageContext(_jspx_page_context);
    _jspx_th_html_option_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_2);
    _jspx_th_html_option_5.setKey("A/C");
    _jspx_th_html_option_5.setValue("A/C");
    int _jspx_eval_html_option_5 = _jspx_th_html_option_5.doStartTag();
    if (_jspx_th_html_option_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value_key_nobody.reuse(_jspx_th_html_option_5);
      return true;
    }
    _jspx_tagPool_html_option_value_key_nobody.reuse(_jspx_th_html_option_5);
    return false;
  }

  private boolean _jspx_meth_html_option_6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_6 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value_key_nobody.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_6.setPageContext(_jspx_page_context);
    _jspx_th_html_option_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_2);
    _jspx_th_html_option_6.setKey("Semi-Luxury");
    _jspx_th_html_option_6.setValue("Semi-Luxury");
    int _jspx_eval_html_option_6 = _jspx_th_html_option_6.doStartTag();
    if (_jspx_th_html_option_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value_key_nobody.reuse(_jspx_th_html_option_6);
      return true;
    }
    _jspx_tagPool_html_option_value_key_nobody.reuse(_jspx_th_html_option_6);
    return false;
  }

  private boolean _jspx_meth_html_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_value_property_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_submit_0.setProperty("action");
    _jspx_th_html_submit_0.setValue("Search");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_value_property_nobody.reuse(_jspx_th_html_submit_0);
      return true;
    }
    _jspx_tagPool_html_submit_value_property_nobody.reuse(_jspx_th_html_submit_0);
    return false;
  }

  private boolean _jspx_meth_html_submit_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_1 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_value_property_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_1.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_submit_1.setProperty("action");
    _jspx_th_html_submit_1.setValue("Reset");
    int _jspx_eval_html_submit_1 = _jspx_th_html_submit_1.doStartTag();
    if (_jspx_th_html_submit_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_value_property_nobody.reuse(_jspx_th_html_submit_1);
      return true;
    }
    _jspx_tagPool_html_submit_value_property_nobody.reuse(_jspx_th_html_submit_1);
    return false;
  }
}
