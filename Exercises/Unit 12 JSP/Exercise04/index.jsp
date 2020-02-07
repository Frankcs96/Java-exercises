
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Exercise04</title>
  </head>
  <body>
  <h1>Average calculator</h1>
  <form action="average.jsp" method="post">
    <label>Number 1: </label>
    <input type="number" required name="number1">
    <label>Number 2: </label>
    <input type="number" required name="number2">
    <label>Number 3: </label>
    <input type="number" required name="number3">
    <input type="submit" value="Send">
  </form>
  </body>
</html>