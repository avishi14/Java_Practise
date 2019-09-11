<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
 <center><h1>Welcome ${username}</h1>
     <h2> Order food from a variety of categories...</center>
        <table width=60pix  cellpadding="10" cellspacing="2" border="1" color="black" bgcolor="#efefef" align="center">
            <tr>
                <td><a href ="ChinesePage.jsp">Chinese</td>
                <td><a href ="ItalianPage.jsp">Italian</td>
                <td><a href ="IndianPage.jsp">Indian</td>
                <td><a href ="DrinksPage.jsp">Drinks</td>
            </tr>
        </table>

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
   
    <form action="ServletLogout">
        <center><input type="submit" value="Logout"/></center>
    </form>
</body>
</html>
<style>

    body{
        font-family: Iceland;
    }
</style>