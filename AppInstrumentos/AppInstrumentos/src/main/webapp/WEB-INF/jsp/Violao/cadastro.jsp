<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastro de Violão</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">

		<h2>Violão</h2>
		<form action="/Violão/adicionar" method="post">
			<div class="form-group">
				<label>Quantidade de Cordas:</label> <input type="text"
					class="form-control" placeholder="Entre com a quantidade de cordas" name="quantidadeCordas">
			</div>
			<div class="form-group">
				<label>Elétrica:</label> <input type="radio"
					class="form-control" placeholder="É Elétrica"
					name="isEletrica">
			</div>
			<div class="form-group">
				<label>Tipo de Corda:</label> <input type="text" class="form-control"
					placeholder="Entre com o tipo de corda" name="tipoCorda">
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