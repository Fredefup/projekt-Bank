<%-- 
    Document   : customer-list
    Created on : Feb 26, 2014, 10:23:21 AM
    Author     : Ahmed Sadiq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customers List</title>
    </head>
    <body>
        <h1>List of Customers</h1>
	<hr/>
        <table border="1">
            <th> Cpr </th> <th> Name </th>
    <c:forEach var="customer" items="${customers}">
    <tr><td><a href="Controller?cpr=${customer.cpr}&command=viewaccounts">${customer.cpr}</a></td><td> ${customer.name}</td></tr>
    </c:forEach>
        </table>
    	<ul>
	<li>
	    <a href="Controller?=command=back">Back to main page</a>
	    
	</li>
	</ul>
    </body>
</html>
