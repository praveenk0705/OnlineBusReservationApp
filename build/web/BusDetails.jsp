<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
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
.style6 {
	color: #3366CC;
	font-weight: bold;
	font-size: 12px;
}
.style9 {font-size: 12px}
.style17 {color: #3366CC; font-weight: bold; font-size: 10px; }
.style19 {color: #FF9933; font-weight: bold; font-size: 12px; }
.style20 {color: #CCFF99; font-weight: bold; font-size: 12px; }
-->
</style>
</head>
<body bgcolor="#C0DFFD">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr bgcolor="#3366CC">
    <td colspan="3" rowspan="2"><img src="mm_travel_photo.jpg" alt="Header image" width="382" height="127" border="0" /></td>
    <td height="63" colspan="3" id="logo" valign="bottom" align="center" nowrap="nowrap">Get Set Go...</td>
    <td width="21">&nbsp;</td>
  </tr>

  <tr bgcolor="#3366CC">
    <td height="64" colspan="3" id="tagline" valign="top" align="right">at your place</td>
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
	<table border="0" cellspacing="0" cellpadding="0" width="182" id="navigation">
        <tr>
          <td width="182">&nbsp;<br />
		 &nbsp;<br /></td>
        </tr>
        <tr>
          <td width="182"><a href="javascript:;" class="navText">HOME</a></td>
        </tr>
        <tr>
          <td width="182"><a href="javascript:;" class="navText">CHANGE PASSWORD</a></td>
        </tr>
        <tr>
          <td width="182"><a href="javascript:;" class="navText">VIEW PROFILE</a></td>
        </tr>
        <tr>
          <td width="182"><a href="javascript:;" class="navText">MY TICKETS</a></td>
        </tr>
        <tr>
          <td width="182"><a href="javascript:;" class="navText">FEEDBACK</a></td>
        </tr>
        <tr>
          <td width="182"><a href="javascript:;" class="navText">FAQ</a></td>
        </tr>
        <tr>
          <td width="182"><a href="javascript:;" class="navText">CONTACT US</a></td>
        </tr>
        <tr>
          <td width="182"><a href="javascript:;" class="navText">LOGOUT</a></td>
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

  <html:form action="bus_details.do">
        <table width="575" border="3" cellpadding="2" cellspacing="3">

<tr bgcolor="#FF9933">
                    <td height="29" align="center" bgcolor="#3366CC"><span class="style19"> Select Bus</span></td>
                    <td align="center" bgcolor="#3366CC" class="style20">Bus Name</td>
                    <td align="center" bgcolor="#CDF0FC"><span class="style6">Service Type</span></td>
                    <td align="center" bgcolor="#CDF0FC" class="style6">Departure Time</td>
          </tr>

        <logic:iterate id="list" collection="${businfolist}">
			<tr>
              <td width="114"><html:radio property="selectedbus" value="${list.stopid}">
                <span class="style9"></html:radio></span></td>
              <td width="152" align="center"><span class="style17">${list.busname}</span></td>
              <td width="144" align="center"><span class="style17">${list.servicetype}</span></td>
              <td width="120" align="center"><span class="style17">${list.bustime}</span></td>
            </tr>
               </logic:iterate>

                <tr>
                    <td align="center"><html:submit property="action" value="BookTicket"/></td>
                  <td align="center"><html:submit property="action" value="GetFare"/></td>
                  <td align="center"><html:submit property="action" value="ViewStops"/></td>
                  <td align="center"><html:submit property="action" value="ShowAvailbility"/></td>
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
