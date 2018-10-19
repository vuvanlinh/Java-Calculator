<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form method="get" action="/calculator">
    <div class="Calculator"></div>
    <input type="number" name="fistoperant"><br><br>
    <select name="operator">
        <option value="add">Addition</option>
        <option value="minus">Minus</option>
        <option value="multi">Multiplication</option>
        <option value="division">Division</option>
    </select><br><br>
    <input type="number" name="secondoperant"><br><br>
    <button name="operator">Operator</button>
    <br><br>
</form>
</body>
</html>
