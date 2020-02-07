<%@ page import="java.text.DecimalFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    double value = Double.parseDouble(request.getParameter("currency"));

%>
<html>
<head>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
          crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
    <title>Exercise07</title>
</head>
<body>
<div class="container">
<h1 id="result">
    <% if (request.getParameter("radio").equals("eurosToPesetas")) {
        double pesetas = value * 166.386;
        out.print((int) pesetas + " Pesetas.");

    } else {
        double euros = value / 166.386;
        DecimalFormat df = new DecimalFormat("0.00");
        out.print(df.format(euros) + " Euros.");
    }%>
</h1>
    <img id="gif" src="gifdinero.gif" alt="">
    <br>
    <br>
    <a href="index.jsp" class="btn btn-primary">Go back to the converter</a>
    <br>
    <br>
</div>





<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
        integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"></script>
</body>
</html>
