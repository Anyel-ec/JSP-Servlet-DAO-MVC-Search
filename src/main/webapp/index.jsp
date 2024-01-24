<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

</head>
<body>

<br/>

<div class="container mt-5 d-flex justify-content-center align-items-center">
    <div class="text-center">
        <h4 class="mb-4">Buscar electrodomesticos by Angel Patiño</h4>
        <form action="servletController" method="get" class="mb-3">
            <input type="hidden" name="opcion" value="buscar">
            <div class="input-group">
                <input type="text" class="form-control" placeholder="Buscar por código" name="codigo">
                <button class="btn btn-success" type="submit">Buscar</button>
            </div>
        </form>
    </div>
</div>



<!--<a href="hello-servlet">Hello Servlet</a>
-->
</body>
</html>