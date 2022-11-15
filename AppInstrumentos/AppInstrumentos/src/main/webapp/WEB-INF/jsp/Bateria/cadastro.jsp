<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastro de Bateria</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">

		<h2>Bateria</h2>
		<form action="/bateria/adicionar" method="post">
			<div class="form-group">
				<label>Modelo:</label> <input type="text"
					class="form-control" placeholder="Entre com o modelo" name="modelo">
			</div>
			<div class="form-group">
				<label>Eletrônica:</label> <input type="radio"
					class="form-control" placeholder="É Eletrônica?"
					name="isEletronica">
			</div>
			<div class="form-group">
				<label>Quiantidade de Pratos:</label> <input type="text" class="form-control"
					placeholder="Entre com a quantidade de pratos" name="quantidadePratos">
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