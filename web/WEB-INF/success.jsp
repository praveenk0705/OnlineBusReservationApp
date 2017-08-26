<%--
    Document   : BookTicket
    Created on : Jan 26, 2011, 3:04:59 PM
    Author     : dl723
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://struts.apache.org/tags-html"  prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib  uri="http://java.sun.com/jstl/core" prefix="core" %>



<h3>All bus information </h3>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Bus Ticket Reservation</title>
    </head>
    <body>
        <form action="bus_fare.do">
        <table border="3" cellpadding="2" cellspacing="3">
                <logic:iterate id="list" collection="${businfolist}">
                <tr>
                    <td><html:radio property="selectedbus" value="${list.stopid}"></html:radio>
                   <td>${list.busname}</td>
                   <td>${list.servicetype}</td>
                   <td>${list.bustime}</td>
                </tr>
               </logic:iterate>

                <tr>
                    <td colspan="2">
                        <html:submit property="action" value="BookTicket"/>
                        <html:submit property="action" value="GetFare"/>
                        <html:submit property="action" value="ViewStops"/>
                        <html:submit property="action" value="ShowAvailbility"/>
                    </td>
                </tr>
                
            </table>
        </form>

    </body>
</html>
