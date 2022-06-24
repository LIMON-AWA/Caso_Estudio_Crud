<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Empleado</title>
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
    </head>
    <body class="">

        <h1 class="">Agregar Empleado</h1>
        <div class="container">
            <form class="form-group" action="EmpleadoServletController?action=agregar" method="post" >
                <label>Tipo documento</label>
                <input class="form-control" type="text" name="tipo_documento"/>
                <label>N° Documento</label>
                <input class="form-control" type="text" name="numero_documento"/> 
                <label>Nombres</label>
                <input class="form-control"  type="text" name="nombres"/>
                <label>Apellidos</label>
                <input class="form-control" type="text" name="apellidos"/>
                <label>Departamento</label>
                <input class="form-control" type="text" name="departamento_id"/>
                <label>Direccion</label>
                <input class="form-control" type="text" name="direccion"/>
                <label>Correo Electronico</label>
                <input class="form-control" type="text" name="correo_electronico"/>
                <label>Telefono</label>
                <input class="form-control" type="text" name="telefono"/>
                <input class="btn btn-primary" type="submit" name="accion" value="Agregar"/> 
                <a class="btn btn-danger" href="EmpleadoServletController?action=regresar">Regresar a lista</a>
                <a class="btn btn-danger" href="index.jsp">Regresar a index</a>

        </div>
    </form>
</body>
</html>
