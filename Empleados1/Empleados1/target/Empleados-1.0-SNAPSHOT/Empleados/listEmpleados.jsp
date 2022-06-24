<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista empleados</title>
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
    </head>
    <body>





        <div class="container">
            <div>
                <a class="btn btn-primary" href="EmpleadoServletController?action=ag">Agregar empleado</a>
                <a class="btn btn-danger" href="index.jsp">Regresar a index</a>
            </div>
            <h1>Lista De empleados</h1>
            <table class="table">
                <thead class="table-dark">
                <th>id</th>
                <th>Tipo documento</th>
                <th>Numero documento</th>
                <th>Nombres</th>
                <th>Apellidos</th>
                <th>Id departamento</th>
                <th>Direccion</th>
                <th>Correo electronico</th>
                <th>Telefono</th>
                <th>Acciones</th>
                </thead>
                <tbody>
                    <c:forEach var="empleado" items="${listEmp}">

                        <tr>
                            <td> <c:out value="${empleado.id}"/> </td>
                            <td><c:out value="${empleado.tipo_documento}"/></td>
                            <td><c:out value="${empleado.numero}"/></td>
                            <td><c:out value="${empleado.nombres}"/></td>
                            <td><c:out value="${empleado.apellidos}"/></td>
                            <td><c:out value="${empleado.departamento_id}"/></td>
                            <td><c:out value="${empleado.direccion}"/></td>
                            <td><c:out value="${empleado.correo_electronico}"/></td>
                            <td><c:out value="${empleado.telefono}"/></td>
                            <td><a class="btn btn-primary" href="EmpleadoServletController?action=edit&id=<c:out value="${empleado.id}"></c:out>">Editar<a/>
                                    <a class="btn btn-danger" href="EmpleadoServletController?action=eliminar&id=<c:out value="${empleado.id}"></c:out>">Eliminar<a/> </td>

                                            </tr>
                                    </c:forEach>

                                    </tbody>

                                    </div>
                                    </body>
                                    </html>
