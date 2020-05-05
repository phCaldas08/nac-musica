<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<c:if test="${tipo == 'detalhe'}">
	<title>Musica Detalhe</title>
</c:if>
<c:if test="${tipo == 'novo'}">
	<title>Nova Musica</title>
</c:if>
<c:if test="${tipo == 'editar'}">
	<title>Editar Musica</title>
</c:if>

<spring:url value="/resources/css" var="css" />
<spring:url value="/resources/js" var="js" />

<c:set value="${pageContext.request.contextPath}" var="contextPath" />

<link href="${css}/bootstrap.css" rel="stylesheet">
<link href="${css}/small-business.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row">
			<c:if test="${tipo == 'detalhe'}">
				<h1>Detalhes Musica</h1>
			</c:if>
			<c:if test="${tipo == 'novo'}">
				<h1>Nova Musica</h1>
			</c:if>
			<c:if test="${tipo == 'editar'}">
				<h1>Editar Musica</h1>
			</c:if>
			</br> </br>
			<form:form modelAttribute="musicaModel"
				action="${contextPath}/musica"
				method="${tipo == 'novo' ? 'post' : 'put'}">
				<form:input type="text" id="id" path="id" name="id"
					style="display: none" />
				<div class="form-group">
					<label>Nome <form:input class="form-control" type="text"
							disabled="${tipo == 'detalhe'}" id="nome" path="nome" name="nome" />
					</label> 
					<br/><font color="red"> <form:errors path="nome" />
					</font><br />
				</div>
				<div class="form-group">
					<label>Album <form:input class="form-control" type="text"
							disabled="${tipo == 'detalhe'}" id="album" path="album"
							name="album" />
					</label>
					<br/> <font color="red"> <form:errors path="album" />
					</font><br />
				</div>
				<div class="form-group">
					<label>Artista <form:input class="form-control" type="text"
							disabled="${tipo == 'detalhe'}" id="artista" path="artista"
							name="artista" />
					</label> 
					<br/>
					<font color="red"> <form:errors path="artista" />
					</font><br />
				</div>

				<div class="form-group">
					<label>Estilo <form:input class="form-control"
							disabled="${tipo == 'detalhe'}" type="text" id="estilo"
							path="estilo" name="estilo" />
					</label>
					<br/> <font color="red"> <form:errors path="estilo" />
					</font><br />
				</div>
				<div class="form-group">
					<label>Ano de lancamento <form:input class="form-control"
							disabled="${tipo == 'detalhe'}" type="number" id="anoLancamento"
							path="anoLancamento" name="anoLancamento" />
					</label>
					<br/> <font color="red"> <form:errors path="anoLancamento" />
					</font><br />
				</div>
				<div class="form-group">
					<label>Duracao <form:input class="form-control"
							disabled="${tipo == 'detalhe'}" type="number" id="duracao"
							path="duracao" name="duracao" />
					</label> 
					<br/><font color="red"> <form:errors path="duracao" />
					</font><br />
				</div>

				<c:if test="${tipo != 'detalhe'}">
					<a class="btn btn-danger" href="${contextPath}/musica">Cancelar</a>
					<input type="submit" value="Salvar" class="btn btn-success">
				</c:if>
				<c:if test="${tipo == 'detalhe'}">
					<a class="btn btn-default" href="${contextPath}/musica">Voltar</a>
				</c:if>
			</form:form>
		</div>
	</div>
</body>
</html>