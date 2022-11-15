<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastro de Atabaque</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">

		<h2>Atabaque</h2>
		<form action="/atabaque/adicionar" method="post">
			<div class="form-group">
				<label>Quantidade de Ganchos:</label> <input type="text"
					class="form-control" placeholder="Entre com a quantidade de ganchos" name="quantidadeGanchos">
			</div>
			<div class="form-group">
				<label>Couro Artificial:</label> <input type="radio"
					class="form-control" placeholder="É Couro Artificial?"
					name="isCouroArtificial">
			</div>
			<div class="form-group">
				<label>Origem:</label> <input type="text" class="form-control"
					placeholder="Entre com a origem" name="origem">
			</div>
			<div class="form-group">
				<label>Valor:</label> <input type="text" class="form-control"
					placeholder="Entre com o valor" name="valor">
			</div>
			<div class="form-group">
				<label>Fabricante:</label> <input type="text" class="form-control"
					placeholder="Entre com o fabricante" name="fabricante">
			</div>
			<div class="form-group">
				<label>Importado:</label> <input type="text" class="form-control"
					placeholder="Informe se é importado" name="isImportado">
			</div>
			<button type="submit" class="btn btn-default">Salvar</button>
		</form>
	</div>
</body>
</html>