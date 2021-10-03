<%-- 
    Document   : arithmetic_calculator
    Created on : 2-Oct-2021, 8:54:37 PM
    Author     : Jonny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic_cal">
            <label>First:</label>
            <input type="number" name="first_num" value="${num1}">
            <br>
            <label>Second:</label>
            <input type="number" name="second_num" value="${num2}">
            <br>
            <button type="submit" name="calc" value="plus">+</button>
            <button type="submit" name="calc" value="minus">-</button>
            <button type="submit" name="calc" value="multiply">*</button>
            <button type="submit" name="calc" value="mod">%</button>
            <br>
            <a href="age_cal">Age Calculator</a>
        </form>
            <p>Result: ${error}${result}</p>
    </body>
</html>
