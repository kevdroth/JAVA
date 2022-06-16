<!DOCTYPE html>
<html>
<jsp:include page="/WEB-INF/paginas/comunes/header.jsp"/>
<body>

<jsp:include page="/WEB-INF/paginas/comunes/cabecero.jsp"></jsp:include>

<form action="${pageContext.request.contextPath}/ServletControlador?accion=modificar&idCliente=${cliente.idCliente}"
      method="post" class="was-validated">
    <jsp:include page="/WEB-INF/paginas/comunes/botonesNavegacionEdicion.jsp"></jsp:include>
    <section id="details">
        <div class="container">
            <div class="row">
                <div class="col">
                    <div class="card">
                        <div class="card-header">
                            <h4>Editar Cliente</h4>
                        </div>
                        <div class="card-body">
                            <div class="form-group">
                                <label>Nombre</label>
                                <input type="text" class="form-control" name="nombre" required value="${cliente.nombre}">
                            </div>
                            <div class="form-group">
                                <label>Apellido</label>
                                <input type="text" class="form-control" name="apellido" required value="${cliente.apellido}">
                            </div>
                            <div class="form-group">
                                <label>Email</label>
                                <input type="email" class="form-control" name="email" required value="${cliente.email}">
                            </div>
                            <div class="form-group">
                                <label>Telefono</label>
                                <input type="text" class="form-control" name="telefono" required value="${cliente.telefono}">
                            </div>
                            <div class="form-group">
                                <label>Saldo</label>
                                <input type="number" class="form-control" name="saldo" required value="${cliente.saldo}" step="any">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
</form>

<jsp:include page="/WEB-INF/paginas/comunes/piePagina.jsp"></jsp:include>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>

</body>
</html>
