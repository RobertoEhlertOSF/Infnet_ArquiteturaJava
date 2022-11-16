<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Cadastro de Pedidos</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h3>Pedidos: ${listagem.size()}</h3>
		<h4>
			<a href="/pedido">Novo pedido</a>
		</h4>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Id</th>
					<th>Observações</th>
					<th>Data</th>
					<th>Entrega em Casa</th>
					<th>Nome Cliente</th>
					<th>Quantidade Itens</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="p" items="${listagem}">
					<tr>
						<td>${p.id}</td>
						<td>${p.observacoes}</td>
						<td>${p.data}</td>
						<td>${p.entregaEmCasa}</td>
						<td>${p.cliente.nome}</td>
						<td>${p.instrumentos.size()}</td>
						<td><a href="/pedido/${p.id}/excluir">Excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>