<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Inicio</title>
</head>
<body>
	<nav class="navbar navbar-light bg-write">
		<span class="navbar-brand mx-auto" href="#"> <img
			src="ebixla.png" width="50" height="50"
			class="d-inline-block align-top" alt="">
		</span>
	</nav>

	<div class="container">
	<form action="${pageContext.request.contextPath}/ebix/cadastro">
		<div class="card text-center mx-au to mt-5">
			<h5 class="card-header bg-light text-primary">CADASTRAR SEGURADO</h5>
			<div class="card-body">
				${mensagem}
				<p class="card-text ">Deseja cadastrar um segurado?</p>
				<a href="cadastro.jsp" class="btn btn-primary">Clique aqui</a>
			</div>
		</div>
	</form>
		
	</div>
	
	<div class="text-center text-dark mt-2"> © 2019 Javista, Inc.</div>
</body>
</html>
