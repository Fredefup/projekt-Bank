<%-- 
    Document   : viewAccount
    Created on : 27-02-2014, 15:59:32
    Author     : Frederik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>view account</title>
    </head>
    <body>
        <h1>Account details for ${account} </h1>
        <h1>${transaction} </h1>

         <table border="1">
             <th>transaction id</th><th>date</th> <th> amount</th>
        <c:forEach var="transactions" items="${transaction}">
         <tr><td>${transaction}
            </td><td>${transaction}</td><td>${transaction}</td></tr>
        
          </c:forEach>    
         </table>     
               <a href="Controller?command=back">Back to main page</a>
               <a href="Controller?command=transferpage">transfer</a>
        
    </body>
</html>
