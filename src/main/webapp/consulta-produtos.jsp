<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>

<c:import url="/common/header.jsp" />

<body>
	<div class="container-fluid">
		<c:import url="/common/titulo.jsp" />

		<div class="row">

			<c:import url="/common/side-bar.jsp" />
			<!-- Side bar e col 3  -->


			<div class="col-9">
				<div class="container">
					<div class="row">
						<div class="col-12">
							<h3>Cadastro de Produtos</h3>
						</div>
						<div class="row">
							<div class="col-6">
								<c:forEach items="${ produtos }" var="produto">
									<div class="card">
										<div class="card-header">
											<h5>${ produto.nome }</h5>
										</div>
										<div class="card-body">
											<img class="card-img"
												src="assets/img/produto/${produto.nomeImagem}">
											<div class="card-title text-center mt-4">
												<div class = "badge badge-dark badge-pill ">
													<h5><fmt:formatNumber value="${ produto.preco }"
														type="currency" currencySymbol="R$" /></h5>
												</div>
											</div>
										</div>
										<div class="card-footer text-center">
											<div class="btn-group">
												<button class="btn btn-primary">Cadastrar</button>
												<a class="btn btn-info" href="#">Detalhes</a>
											</div>
										</div>
									</div>
								</c:forEach>
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>

	<c:import url="/common/footer.jsp" />

</body>
</html>