<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
	<div class="container-fluid">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link active" href="#">AppInstrumentos</a></li>
			<li class="nav-item"><a class="nav-link" href="/usuario/lista">Usuario</a></li>

			<li class="nav-item"><a class="nav-link" href="/pedido/lista">Pedidos</a></li>
			<li class="nav-item"><a class="nav-link"
				href="/instrumento/lista">Instrumentos</a></li>
			<li class="nav-item"><a class="nav-link" href="/cliente/lista">Clientes</a></li>
			<li class="nav-item"><a class="nav-link" href="/atabaque/lista">Atabaques</a></li>
			<li class="nav-item"><a class="nav-link" href="/bateria/lista">Baterias</a></li>
			<li class="nav-item"><a class="nav-link" href="/violao/lista">Violões</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<c:if test="${empty user}">
				<li><a href="/usuario"><span
						class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li><a href="/login"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</c:if>

			<c:if test="${not empty user}">
				<li><a href="/logout"><span
						class="glyphicon glyphicon-log-out"></span> Logout ${user.nome}</a></li>
			</c:if>
		</ul>
	</div>
</nav>