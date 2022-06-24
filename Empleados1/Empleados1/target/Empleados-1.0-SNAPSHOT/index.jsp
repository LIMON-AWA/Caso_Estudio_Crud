<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Caso de Estudio</title>
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
    </head>
    <body>
        <div class="container">
            <div class="row text-center">
                <h1>CRUD MAVEN</h1>
            </div>
            <div class="row">
                <div class="col">
                    <div class="card">
                        <div class="card-header">
                            <h2>Empleados</h2>
                            <ul class="list-group">
                                <li class="list-group-item"><a href="EmpleadoServletController?action=regresar">Consultar Empleados</a></li>
                                <li class="list-group-item"><a href="EmpleadoServletController?action=ag">Agregar Empleados</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card">
                        <div class="card-header">
                            <h2>Departamentos</h2>
                            <ul class="list-group">
                                <li class="list-group-item"><a href="DepartamentoServletController?accion=listar">Consultar Departamentos</a></li>
                                <li class="list-group-item"><a href="DepartamentoServletController?accion=add">Agregar Departamentos</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>      
    </body>
</html>
