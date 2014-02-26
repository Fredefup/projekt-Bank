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
        <h1>Customers List</h1>
	<hr/>
    <c:forEach var="customer" items="${customers}">
	<br/>${customer.cpr} ${customer.name}
    </c:forEach>
    	<ul>
	<li>
	    <!--a href="Back">Back to mainpage</-->
	    <a href="Controller?=command=back">Back to mainpage</a>
	</li>
	</ul>
    </body>
</html>
