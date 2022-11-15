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
<title>Cadastro de Baterias</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h3>Baterias: ${listagem.size()}</h3>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>Id</th>
					<th>É Eletrônica</th>
					<th>Modelo</th>
					<th>Qtd Pratos</th>
					<th>Valor</th>
					<th>É Importado?</th>
					<th>Fabricante</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="b" items="${listagem}">
					<tr>
						<td>${b.id}</td>
						<td>${b.isEletronica}</td>
						<td>${b.modelo}</td>
						<td>${b.quantidadePratos}</td>
						<td>${b.valor}</td>
						<td>${b.isImportado}</td>
						<td>${b.fabricante}</td>
						<td><a href="/bateria/${b.id}/excluir">Excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>