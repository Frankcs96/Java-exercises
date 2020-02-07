<%@ page import="java.text.DecimalFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    int number1 = Integer.parseInt(request.getParameter("number1"));
    int number2 = Integer.parseInt(request.getParameter("number2"));
    int number3 = Integer.parseInt(request.getParameter("number3"));
    double average = (number1 + number2 + number3) / 3.0;

%>
<html>
<head>
    <title>Exercise04</title>
</head>
<body>
    <h1><%
        DecimalFormat df = new DecimalFormat("0.00");
        out.print("Average: " + df.format(average)); %>
    </h1>
</body>
</html>
