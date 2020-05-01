<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Musicas</title>

<spring:url value="/resources/css" var="css" />
<spring:url value="/resources/js" var="js" />

<c:set value="${pageContext.request.contextPath}" var="contextPath" />

<link href="${css}/bootstrap.css" rel="stylesheet">
<link href="${css}/small-business.css" rel="stylesheet">
</head>
<body>
	<div class="container col-md-12">

		<h1 style="margin-bottom: 50px">Musicas</h1>
		<div class="toolbar">
			<a class="btn btn-default">Nova musica</a>
		</div>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Album</th>
					<th>Artista</th>
					<th>Nome</th>
					<th>Acoes</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${musicas}" var="musica">
					<tr>
						<td>${musica.album}</td>
						<td>${musica.artista}</td>
						<td>${musica.nome}</td>
						<td>
							<div class="toolbar">
								<form:form action="${contextPath}/musica/${musica.id}" method="delete">
									<a class="btn btn-success">Editar</a>
									<a class="btn btn-warning">Detalhe</a>
									<input type="submit" class="btn btn-danger" value="excluir">
								</form:form>
							</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>