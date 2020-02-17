<%
boolean hasGanado = false;
int number = (int)(Math.random() * ((3 - 1) + 1)) + 1;
int cubilete = Integer.parseInt(request.getParameter("cub"));

%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>El trile</title>
</head>
<body>
<%
    if (number == cubilete) {
      out.print("<h1>Has ganado</h1>");
    } else {
      out.print("<h1>Has perdido</h1>");
    }
    for (int i = 1; i <= 3 ; i++) {
        if (i == number) {
          out.print("<img src = \"cubilete_con_1bola.png\">");
        } else {
            out.print("<img src = \"cubilete_sin_bola.png\">");
        }
    }
%>

<a href="index.jsp">Jugar otra vez</a>
</body>
</html>
