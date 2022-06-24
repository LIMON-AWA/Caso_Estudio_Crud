<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Departamento</title>
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
    </head>
    <body class="">

        <h1 class="">Agregar Departamento</h1>
        <div class="container">
            <form class="form-group" action="DepartamentoServletController?action=agregar" method="post" >
                <label>Codigo departamento</label>
                <input class="form-control" type="text" name="departamento_codigo"/>
                <label>Nombre Departamento</label>
                <input class="form-control" type="text" name="nombre_departamento"/> 
                <input class="btn btn-primary" type="submit" name="accion" value="Agregar"/> 
                <a class="btn btn-danger" href="EmpleadoServletController?action=regresar">Regresar a lista</a>
                <a class="btn btn-danger" href="index.jsp">Regresar a index</a>

        </div>
    </form>
</body>
</html>
