<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<% Class.forName("org.apache.derby.jdbc.ClientDriver"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Italian Food Page</title>
    </head>
    <body>
    <center><h1>Order Italian Food</h1></center>
    
      <%
            //http 1.1
            response.setHeader("Cache-Control", "no-cache, no-store, must=revalidate");
            //http 1.0
            response.setHeader("Pragma", "no-cache");
            //proxies
            response.setHeader("Expires", "0");
            if (session.getAttribute("username") == null) {
                response.sendRedirect("LoginPage.jsp");
            }
        %>

    <%
        Connection connection = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/JSP_DB", "root", "root");

        Statement statement = connection.createStatement();
        ResultSet resultset = statement.executeQuery(
                "select dishname,price from fooditems where category='italian'");
    %>

    <table id ="t01" style="width:100%">
        <tr>
            <th>S.No</th>
            <th>Dish name</th>
            <th>price</th> 
        </tr>
        <% while (resultset.next()) {%>
        <tr>
            <td></td>
            <td> <%= resultset.getString(1)%></td>
            <td> <%= resultset.getString(2)%></td>
        </tr>
        <% }%>
    </table>
    <form action="ServletLogout">
        <center><input type="submit" value="Logout"/></center>
    </form>
</body>
</html>


<style>
    table, th, td {
        border: 1px solid black;
    }

    table#t01 tr:nth-child(even) {
        background-color: #eee;
    }
    table#t01 tr:nth-child(odd) {
        background-color: #fff;
    }
    table#t01 th {
        background-color: black;
        color: white;
    }

    tr td:first-child:before{
        counter-increment: Serial;      /* Increment the Serial counter */
        content: counter(Serial); /* Display the counter */
    }

    body {
        counter-reset: Serial; /* Set the Serial counter to 0 */ 
        font-family: Iceland;
        
    }

    .ui-helper-center {
        text-align: center;
    }


</style>