<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="http://struts.apache.org/tags-html"  prefix="html"%>
<%@taglib  uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib  uri="http://java.sun.com/jstl/core" prefix="core" %>
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
.style6 {font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 14px; color: #3366CC; }
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
          <td width="165"><a href="Cancellation.jsp" class="navText">CANCELLATION</a></td>
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

<form action="BusDetails.do">
       <table height="106" border="3" cellpadding="2" cellspacing="3">
            <tr>
                <td width="89" height="42" align="center"><span class="style10">Bus NO</span></td>
                <td width="138">${businfo.busid}</td>
                <td width="83" align="center"><span class="style10">Bus Name</span></td>
                <td width="135">${businfo.busname}</td>
           </tr>
                <tr>
                    <td height="49" align="center"><span class="style10"> Service </span></td>
                    <td>${businfo.servicetype}</td>
                    <td><span class="style10">Bus Route</span></td>
                    <td>${businfo.busrouteid}</td>
                </tr>
       </table>

        <table border="3" cellpadding="2" cellspacing="3">

            
                <tr>
                    <td colspan="4" align="center"><span class="style10">Bus Fare</span></td>

               </tr>
               <tr>
               		<td width="161" align="center"><span class="style17">Adult Bus Fare</span></td>
                    <td width="301">${busfare}</td>
               </tr>

               <tr>
               		<td align="center"><span class="style17">Child Bus Fare</span></td>
                    <td width="301">${childbusfare}</td>
              </tr>

               <tr>
               		<td align="center"><span class="style17">Service Tax</span></td>
                    <td width="301">Rs 50</td>
              </tr>

               <tr>
               		<td align="center"><span class="style17">Total Bus Fare</span></td>
                    <td width="301">${amount}</td>
              </tr>

                <tr>
                    <td colspan="2">
                        <input type="button"  value="OK"/>
                    </td>
                </tr>

       </table>
      </form>
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
