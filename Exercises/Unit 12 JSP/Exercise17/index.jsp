<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Configurador coche</title>
</head>
<body>
<h1>Configure su vehículo</h1>
<hr>
<form action="coche.jsp" method="post">
    <label>Eliga un color</label>
    <select name="colores" id="colores">
        <option value="blanco">blanco</option>
        <option value="blanco">negro</option>
        <option value="blanco">berenjena</option>

    </select>
    <br><br>
    <label>Eliga un material para las molduras</label>
    <select name="moldura" id="moldura">
        <option value="madera">madera</option>
        <option value="carbono">carbono</option>

    </select>
    <br>
    <br>
    <input type="submit" value="Crear vehículo">
</form>
</body>
</html>