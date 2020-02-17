
<%
    String color = request.getParameter("colores");
    String molde = request.getParameter("moldura");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Configurador coche</title>
</head>
<body>
<h1>Aquí tiene su vehículo</h1>
<br>
<%
    out.print("<img src =" + color + molde + ".jpg" +">");
%>
</body>
</html>
