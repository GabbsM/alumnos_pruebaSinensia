<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>Empanafy</title>
	<jsp:include page="estilosbootstrap.jsp"/>
</head>
<body>
	<div class="container">
		<jsp:include page="header.jsp"/>
		<h2>Listado de Alumnos</h2>
		<table class="table">
			<thead>
				<tr>
					<th>DNI</th>
					<th>Nombre </th>
					<th>Apellido1</th>
					<th>Apellido2</th>
					<th>Nota</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="alumno" items="${alumnos}">
				<tr>
					<td>${alumno.dni}</td>
					<td>${alumno.nombre}</td>
					<td>${alumno.apellido1}</td>
					<td>${alumno.apellido2}</td>
					<td>${alumno.nota}</td>

				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>