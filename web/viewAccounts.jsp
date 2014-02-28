<%-- 
    Document   : viewCustomer
    Created on : 26-02-2014, 17:34:21
    Author     : Frederik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Details</title>
    </head>
    <body>
        <h1>Details for user ${customer}</h1>
         <table border="1">
             <th>account number</th><th>account type</th> <th> balance</th>
        <c:forEach var="account" items="${accounts}">
        <tr><td><a href="Controller?account=${account.number}&command=accountdetails">${account.number}</a>
            </td><td>${account.type}</td><td>${account.balance}</td></tr>
        
          </c:forEach>    
         </table>     
               <a href="Controller?=command=back">Back to main page</a>
           
               
        
    </body>
</html>
