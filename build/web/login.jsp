<%-- 
    Document   : login
    Created on : Feb 1, 2011, 3:33:00 PM
    Author     : dl724
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>ABC, Inc. Human Resources Portal</title>
</head>
<body>
  <font size="+1">ABC, Inc. Human Resources Portal Login</font><br>
  <hr width="100%" noshade="true">
  <form action="j_security_check">
    Username: <input type="text" name="j_username"/><br/>
    Password: <input type="password" name="j_password"/><br/>
    <input type="submit" value="Login"/>
  </form>
</body>
</html>