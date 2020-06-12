<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="col-3">
<nav id="sidebar">
		<ul class="list-unstyled">
			<li><a class="btn btn-dark btn-block m-1" href="<c:url value="/"/>">Principal</a></li>
			<li><a class="btn btn-dark btn-block m-1" href="<c:url value="//cadastro-produtos"/>">Cadastro de Produtos</a></li>
			<li><a class="btn btn-dark btn-block m-1" href="<c:url value="/consulta-produtos.jsp"/>">Consulta de Produtos</a></li>
		</ul>
	</nav>
</div>
