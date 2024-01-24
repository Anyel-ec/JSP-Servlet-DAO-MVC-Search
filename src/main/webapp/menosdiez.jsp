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
  <h2>Detalles del Electrodomestico menor de diez</h2>
<c:if test="${not empty electrodomestico}">

<div class="card">
      <div class="card-body">
          <p class="card-text">Desarrollado Por Angel Patiño</p>

          <p class="card-text">El electrodoméstico ${electrodomestico.nombre} de la marca ${electrodomestico.marca} y modelo  ${electrodomestico.modelo}
        cuenta con ${electrodomestico.cantidad} por lo que se debe sacar de bodega más unidades.
        </p>
          <a href="/prueba_desarrollo-1.0-SNAPSHOT/index.jsp" class="btn btn-success">Ir a Inicio</a>

      </div>
    </div>
</div>
</c:if>

</body>
</html>
