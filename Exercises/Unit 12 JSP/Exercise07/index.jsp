<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exercise07</title>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
          crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
</head>
<body>


<div class="container w-50 p-3">
    <h2 class="display-4">Pesetas/Euros converter</h2>
    <form method="post" action="converter.jsp">
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Value</label>
            <div class="col-sm-10">
                <input type="number" class="form-control" name="currency" required>
            </div>
        </div>
        <fieldset class="form-group">
            <div class="row">
                <legend class="col-form-label col-sm-2 pt-0">Conversion</legend>
                <div class="col-sm-10">
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="radio"
                               id="gridRadios1" value="eurosToPesetas" checked>
                        <label class="form-check-label" for="gridRadios1">
                            Euros to pesetas
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="radio"
                               id="gridRadios2" value="pesetasToEuros">
                        <label class="form-check-label" for="gridRadios2">
                            Pesetas to euros
                        </label>
                    </div>
                </div>
            </div>
        </fieldset>

        <div class="form-group row">
            <div class="col-sm-10">
                <button type="submit" class="btn btn-primary">Convert</button>
            </div>
        </div>
    </form>

    <img src="./euro.jpg" alt="">
    <img src="./peseta.jpg" alt="" width="45%">
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