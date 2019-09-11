<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Login</title>
    </head><body>
    <center><h2>User Login</h2></center>

    <form action="ServletLogin">


        <div class="container">
            <center><label><b>Username</b></label></center>
            <center><input type="text" 
                           placeholder="Enter Username"
                           name="usernameLogin" 
                           required></center><br/>

            <center><label><b>Password</b></label></center>
            <center> <input type="password" 
                            placeholder="Enter Password" 
                            name="passwordLogin" required ></center><br/>

            <center><button type="submit">Login</button><br/>
            
                <a href="SignupPage.jsp">Not Member? Signup here</a></center>
        </div>
    </form>
</body>
</html>
<style>

    body{
        font-family: Iceland;
    }
</style>