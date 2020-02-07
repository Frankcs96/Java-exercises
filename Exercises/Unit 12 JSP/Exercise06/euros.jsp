<%@ page import="java.text.DecimalFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

    int pesetas = Integer.parseInt(request.getParameter("pesetas"));
    double euros = pesetas / 166.386;


%>
<html>
<head>
    <title>Exercise06</title>
</head>
<body>
    <h1><%DecimalFormat df = new DecimalFormat("0.00");
        out.print(df.format(euros) + " Euros.");%>
    </h1>
</body>
</html>
