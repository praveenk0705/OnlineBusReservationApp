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
</head>
<body bgcolor="#C0DFFD">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr bgcolor="#3366CC">
    <td width="382" colspan="3" rowspan="2"><img src="images/mm_travel_photo.jpg" alt="Header image" width="382" height="127" border="0" /></td>
    <td width="378" height="63" colspan="3" id="logo" valign="bottom" align="center" nowrap="nowrap">Get Set Go...</td>
    <td width="100%">&nbsp;</td>
  </tr>

  <tr bgcolor="#3366CC">
    <td height="64" colspan="3" id="tagline" valign="top" align="right">at your place</td>
	<td width="100%">&nbsp;</td>
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
          <td width="165"><a href="TimeTable.jsp" class="navText">TIME-TABLE</a></td>
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
    <td width="305" colspan="2" valign="top"><img src="mm_spacer.gif" alt="" width="305" height="1" border="0" /><br />
	&nbsp;<br />
	&nbsp;<br />

            <table border="0" cellspacing="0" cellpadding="0" width="305">
                <tr>
                  <td class="pageName">Register yourself to Get Set Go...</td>
                </tr>

                <tr>
                    <td>
                        <html:form  action="user_registration.do">
                <table align="center" border="3" cellspacing="3" cellpadding="3">
                     <tr>
                        <td><b>First Name :</b></td>
                        <td><html:text property="userfirstname"> </html:text></td>
                        <td></td>
                     </tr>

                     <tr>
                        <td><b>Last Name :</b></td>
                        <td><html:text property="userlastname"></html:text></td>
                        <td></td>
                     </tr>

                    <tr>
                         <td><b>Email Id :</b></td>
                         <td><html:text property="emailid"></html:text></td>
                         <td></td>
                   </tr>

                   <tr>
                     <td><b>Password :</b></td>
                     <td><html:password property="password"></html:password></td>
                     <td></td>
                  </tr>

                  <tr>
                     <td><b>ReEnter Password :</b></td>
                     <td><html:password property="repassword"></html:password></td>
                     <td></td>
                 </tr>

                 <tr>
                    <td><b>Gender :</b></td>
                    <td>Male<html:radio property="gender"  value="male"></html:radio>
                        Female<html:radio property="gender" value="female"></html:radio></td>
                    <td></td>
                </tr>
                <tr>
                    <td><b>Address:</b></td>
                    <td> <html:textarea property="address"></html:textarea></td>
                </tr>
                 <tr>
                     <td><b>Mobile No :</b></td>
                     <td><html:text property="mobileno"></html:text></td>
                     <td></td>
               </tr>

               <tr>
                    <td colspan="2">
                        <html:submit property="action" value="Submit"/>
                        <html:submit property="action" value="Reset"/>

                    </td>
              </tr>

           </table>
        </html:form>
      </td>
   </tr>
 </table>
	    <br /></td>
	<td width="100%">&nbsp;</td>
  </tr>
  <tr>
    <td width="165">&nbsp;</td>
    <td width="50">&nbsp;</td>
    <td width="167">&nbsp;</td>
    <td width="138">&nbsp;</td>
    <td width="50">&nbsp;</td>
    <td width="190">&nbsp;</td>
	<td width="100%">&nbsp;</td>
  </tr>
</table>
</body>
</html>
