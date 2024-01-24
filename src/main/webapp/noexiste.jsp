<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Detalles del Electrodomestico</title>
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      padding: 20px;
    }

    h2 {
      color: #007bff;
    }

    p {
      margin-bottom: 10px;
    }
  </style>
</head>
<body>
<div class="container">
  <h2>Detalles del Electrodomestico igual a Diez unidades</h2>

  <!--"No existen unidades del electrodoméstico @nombre de la marca @marca
  y modelo @modelo, por lo que se debe importar un lote del producto".-->
<c:if test="${not empty electroEncontrado}">

<div class="card">
    <div class="card-body">
      <p class="card-text">
      <p class="card-text">Desarrollado Por Angel Patiño</p>

      No existen unidades del lectrodoméstico ${electroEncontrado.nombre} de la marca ${electroEncontrado.marca} y modelo  ${electroEncontrado.modelo}
        cuenta con ${electroEncontrado.cantidad} por lo que se debe importar un lote del producto.
      </p>
      <a href="/prueba_desarrollo-1.0-SNAPSHOT/index.jsp" class="btn btn-success">Ir a Inicio</a>


    </div>
  </div>
</div>
  <c:if>

</body>
</html>