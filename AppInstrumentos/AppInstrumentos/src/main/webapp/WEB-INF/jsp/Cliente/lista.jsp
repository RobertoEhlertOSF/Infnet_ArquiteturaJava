<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Cadastro de Clientes</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h3>Clientes: ${listagem.size()}</h3>
		<h4>
			<a href="/cliente">Cadastrar Cliente</a>
		</h4>


		<table class="table table-striped">
			<thead>
				<tr>
					<th>Id</th>
					<th>Nome</th>
					<th>E-mail</th>
					<th>CPF</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="c" items="${listagem}">
					<tr>
						<td>${c.id}</td>
						<td>${c.nome}</td>
						<td>${c.email}</td>
						<td>${c.cpf}</td>
						<td><a href="/cliente/${c.id}/excluir">Excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>