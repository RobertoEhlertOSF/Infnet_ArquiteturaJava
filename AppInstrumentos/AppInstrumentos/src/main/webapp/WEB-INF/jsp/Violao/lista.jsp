<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
	<title>Cadastro de Violões</title>
</head>
<body>
	<div class="container mt-3">
		<h3>Violões: ${listagem.size()}</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>isEletrico</th>
					<th>quantidadeCordas</th>
					<th>tipoCorda</th>
					<th>Valor</th>
					<th>É Importado?</th>
					<th>Fabricante</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="v" items="${listagem}">
					<tr>
						<td>${v.id}</td>
						<td>${v.isEletrico}</td>
						<td>${v.quantidadeCordas}</td>
						<td>${v.tipoCorda}</td>
						<td>${v.valor}</td>
						<td>${v.isImportado}</td>
						<td>${v.fabricante}</td>
						<td><a href="/violao/${v.id}/excluir">Excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>