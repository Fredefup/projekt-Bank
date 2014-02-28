<%-- 
    Document   : accoub
    Created on : Feb 25, 2014, 9:57:54 AM
    Author     : Ahmed Sadiq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account List</title>
    </head>
    <body>
        <h1>Account List</h1>
	<hr/>
	${message} for ${customer} ${accounts.size()}
    <c:forEach var="account" items="${accounts}">
	<br/>${account.number} ${account.type}
    </c:forEach>
    	<ul>
	<li>
	    <!--a href="Back">Back to mainpage</-->
	    <a href="Controller?=command=back">Back to main page</a>
            <a href="Controller?=command=transferpage">transfer</a>
	</li>
	</ul>
    </body>
</html>
