<%@ page import="java.text.DecimalFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

    double euros = Double.parseDouble(request.getParameter("euros"));
    double pesetas = euros * 166.386;


%>
<html>
<head>
    <title>Exercise05</title>
</head>
<body>
    <h1><% out.print((int)pesetas + " Pesetas.");%>
    </h1>
</body>
</html>
