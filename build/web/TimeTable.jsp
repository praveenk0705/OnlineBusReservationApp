<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="http://struts.apache.org/tags-html"  prefix="html"%>
<%@taglib  uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<!-- DW6 -->
<head>
<!-- Copyright 2005 Macromedia, Inc. All rights reserved. -->
<title>Home Page</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="mm_travel2.css" type="text/css" />
<script language="JavaScript" type="text/javascript">
//--------------- LOCALIZEABLE GLOBALS ---------------
var d=new Date();
var monthname=new Array("January","February","March","April","May","June","July","August","September","October","November","December");
//Ensure correct for language. English is "January 1, 2004"
var TODAY = monthname[d.getMonth()] + " " + d.getDate() + ", " + d.getFullYear();
//---------------   END LOCALIZEABLE   ---------------
</script>
<style type="text/css">
<!--
.style9 {
	color: #3366CC;
	font-family: Verdana, Arial, Helvetica, sans-serif;
	font-size: 14px;
}
-->
</style>
</head>
<body bgcolor="#C0DFFD"><!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://struts.apache.org/tags-html"  prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib  uri="http://java.sun.com/jstl/core" prefix="core" %>

<jsp:useBean id="bean" class="forms.HibernateBean"/>


<!-- DW6 -->
<head>
<!-- Copyright 2005 Macromedia, Inc. All rights reserved. -->
<title>Home Page</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="mm_travel2.css" type="text/css" />
<script language="JavaScript" type="text/javascript">
//--------------- LOCALIZEABLE GLOBALS ---------------
var d=new Date();
var monthname=new Array("January","February","March","April","May","June","July","August","September","October","November","December");
//Ensure correct for language. English is "January 1, 2004"
var TODAY = monthname[d.getMonth()] + " " + d.getDate() + ", " + d.getFullYear();
//---------------   END LOCALIZEABLE   ---------------
</script>
<style type="text/css">
<!--
.style1 {
	font-size: 12px;
	font-weight: bold;
}
.style5 {font-size: 12px; font-weight: bold; color: #3366CC; }
-->
</style>
</head>
<body bgcolor="#C0DFFD">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr bgcolor="#3366CC">
    <td colspan="3" rowspan="2"><img src="images/mm_travel_photo.jpg" alt="Header image" width="382" height="127" border="0" /></td>
    <td height="63" colspan="3" id="logo" valign="bottom" align="center" nowrap="nowrap">Get Set Go...</td>
    <td width="21">&nbsp;</td>
  </tr>

  <tr bgcolor="#3366CC">
    <td height="64" colspan="3" align="right" valign="top" bgcolor="#3366CC" id="tagline">at your place</td>
	<td width="21">&nbsp;</td>
  </tr>

  <tr>
    <td colspan="7" bgcolor="#003366"><img src="mm_spacer.gif" alt="" width="1" height="1" border="0" /></td>
  </tr>

  <tr bgcolor="#CCFF99">
  	<td colspan="7" id="dateformat" height="25">&nbsp;&nbsp;<script language="JavaScript" type="text/javascript">
      document.write(TODAY);	</script>	</td>
  </tr>
 <tr>
    <td colspan="7" bgcolor="#003366"><img src="mm_spacer.gif" alt="" width="1" height="1" border="0" /></td>
  </tr>

 <tr>
    <td width="165" valign="top" bgcolor="#E6F3FF">
	<table border="0" cellspacing="0" cellpadding="0" width="165" id="navigation">
        <tr>
          <td width="165">&nbsp;<br />
		 &nbsp;<br /></td>
        </tr>
        <tr>
          <td width="165"><a href="javascript:;" class="navText">HOME</a></td>
        </tr>
        <tr>
          <td width="165"><a href="javascript:;" class="navText">CHANGE PASSWORD</a></td>
        </tr>
        <tr>
          <td width="165"><a href="javascript:;" class="navText">VIEW PROFILE</a></td>
        </tr>
        <tr>
          <td width="165"><a href="javascript:;" class="navText">MY TICKETS</a></td>
        </tr>
        <tr>
          <td width="165"><a href="javascript:;" class="navText">FEEDBACK</a></td>
        </tr>
        <tr>
          <td width="165"><a href="javascript:;" class="navText">FAQ</a></td>
        </tr>
        <tr>
          <td width="165"><a href="javascript:;" class="navText">CONTACT US</a></td>
        </tr>
        <tr>
          <td width="165"><a href="javascript:;" class="navText">LOGOUT</a></td>
        </tr>
      </table>
 	<br />
  	&nbsp;<br />
  	&nbsp;<br />
  	&nbsp;<br /> 	</td>
    <td width="50"><img src="mm_spacer.gif" alt="" width="50" height="1" border="0" /></td>
    <td colspan="2" valign="top"><img src="mm_spacer.gif" alt="" width="305" height="1" border="0" /><br />
	&nbsp;<br />
	&nbsp;<br />

  <html:form action="bus_search.do">
      <table width="527" height="76" border="1" cellpadding="5" cellspacing="2">
      <caption>&nbsp;
      </caption>
        <tr>
        <td width="105" height="32" align="center" class="style9 style5"><strong>From Stop</strong></td>
      <td width="163">
    <html:select property="stopone">
                    <html:option key="select" value="Select Choice..."></html:option>
                    <logic:iterate id="list" collection="${bean.stopList}">
                       <html:option key="${list}" value="${list}"></html:option>
                    </logic:iterate>
              </html:select>

            </td>
	    <td width="108" align="center"><h4><span class="style9">To Stop</span></h4></td>
     <td width="181">

   <html:select  property="stoptwo">
                    <html:option key="select" value="Select Choice..."></html:option>
                    <logic:iterate id="list" collection="${bean.stopList}">
                       <html:option key="${list}" value="${list}"></html:option>
                    </logic:iterate>
              </html:select>
            </td>
	    </tr>
      <tr>
          <td height="30" colspan="2" align="center"><html:submit property="action" value="Search"/></td>
        <td height="30" colspan="2" align="center"><html:submit property="action" value="Reset"/></td>
      </tr>
    </table>
 </html:form>
	<br /> </td>
  </tr>

  <tr>
    <td width="165">&nbsp;</td>
    <td width="50">&nbsp;</td>
    <td width="203">&nbsp;</td>
    <td width="305">&nbsp;</td>
    <td width="4">&nbsp;</td>
    <td width="4">&nbsp;</td>
     <td width="21">&nbsp;</td>
  </tr>
</table>
</body>
</html>
</body>
</html>
