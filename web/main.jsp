<%-- 
    Document   : main
    Created on : Feb 25, 2014, 9:56:25 AM
    Author     : Ahmed Sadiq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bank Main Page</title>
    </head>
    <body>
        <h1>Bank Main Page ${message}</h1>
	<hr/>
	<ul>
	    <li>
	    <!--a href="ListAccounts">List Accounts</a-->
	    <a href="Controller?command=list-accounts">List Accounts</a>
	    </li>
	    <li>
	    <!--a href="ListAccounts">List Accounts</a-->
	    <a href="Controller?command=list-customers">List Customers</a>
	    </li>
	</ul>
    </body>
</html>
