<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Login Form</title>
    <link rel="stylesheet" href="master.css">
  </head>
<body>

    <div class="login-box">
      <img src="img/logo.PNG" class="avatar" alt="Avatar Image">
      <h1>Register here</h1>
      <form action="Login">
        <!-- USERNAME INPUT -->
        <label for="username">Username</label>
        <input type="text" placeholder="Enter Username" name = "uname">
        <!-- PASSWORD INPUT -->
        <label for="password">Password</label>
        <input type="password" placeholder="Enter Password" name="pass">
        <input type="submit" value="Login">
        <a href="#">Create an account</a>
      </form>
    </div>
  </body>
</html>