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
.style6 {font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 14px; color: #3366CC; }
-->
</style>
</head>
<body bgcolor="#C0DFFD">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr bgcolor="#3366CC">
    <td colspan="3" rowspan="2"><img src="images/mm_travel_photo.jpg" alt="Header image" width="382" height="127" border="0" /></td>
    <td height="63" colspan="3" id="logo" valign="bottom" align="center" nowrap="nowrap">Get Set Go...</td>
    <td width="71">&nbsp;</td>
  </tr>

  <tr bgcolor="#3366CC">
    <td height="64" colspan="3" id="tagline" valign="top" align="right">at your place</td>
	<td width="71">&nbsp;</td>
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
          <td width="165"><a href="UserLogin.jsp" class="navText">E-TICKET</a></td>
        </tr>
        <tr>
          <td width="165"><a href="javascript:;" class="navText">TIME-TABLE</a></td>
        </tr>
        <tr>
          <td width="165"><a href="javascript:;" class="navText">CANCELLATION</a></td>
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
          <td width="165"><a href="javascript:;" class="navText">ABOUT US</a></td>
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

	 <html:form action="Book_ticket.do" method="get">
            <table width="391" height="117" border="3">

<tr>
                  <td width="125" height="31" align="center"><h4><span class="style6">Username</span></h4></td>
            <td width="246" align="center"><html:text property="username"></html:text></td>

              </tr>
                <tr>
                  <td height="31" align="center"><h4><span class="style6">Password </span></h4></td>
                  <td align="center"><html:password property="password"> </html:password></td>

              </tr>

                <tr>
                  <td height="41" align="center" colspan="2" align="center"><html:submit property="action" value="Login"/>
                      <p> <a href="UserRegistration.jsp"  class="navText">Register Here!!</a> </p></td>

               </tr>
                  
        </table>
      </html:form>
     <br /></td>
    <td width="56">&nbsp;</td>



  </tr>
  <tr>
    <td width="165">&nbsp;</td>
    <td width="50">&nbsp;</td>
    <td width="192">&nbsp;</td>
    <td width="194">&nbsp;</td>
    <td width="56">&nbsp;</td>
    <td width="4">&nbsp;</td>
	<td width="71">&nbsp;</td>
  </tr>
</table>
</body>
</html>
