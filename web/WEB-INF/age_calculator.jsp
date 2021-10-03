<%-- 
    Document   : age_calculator
    Created on : 1-Oct-2021, 7:06:56 PM
    Author     : Jonny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age_cal">
            <label>Enter your age:</label>
            <br>
            <input type="number" name="age" value="${age2}">
            <br>
            <button type="submit">Age next birthday</button>
            <br>
            <a href="arithmetic_cal">Arithmetic Calculator</a>
        </form>
        <p>${error}</p>
        <p>${newage}</p>
    </body>
</html>