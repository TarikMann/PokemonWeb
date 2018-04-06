<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div
		class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom box-shadow">
		<h5 class="my-0 mr-md-auto font-weight-normal">TBA</h5>
		<nav class="my-2 my-md-0 mr-md-3"> <a class="p-2 text-dark"
			href="index.html">Accueil</a> <a class="p-2 text-dark"
			href="ListPokemonServlet">Pokemon</a> <a class="p-2 text-dark"
			href="ListClientServlet">Dresseur</a> <a class="p-2 text-dark"
			href="inscription.html">Inscription</a> </nav>

	</div>

	<div class="container">
		<div
			class="callout-light text-center fade-in-b primary alert alert-info">

			<h1>
				Le Dresseur :
				<c:out value="${nom}" />
			</h1>
		</div>
		<div class="row centered-form">
			<div
				class="col-xs-12 col-sm-12 col-md-12 col-sm-offset-2 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<small>Creation de compte </small>
						</h3>
					</div>
					<div class="panel-body">

						<!-- Form Name -->
						<div class="row">
							<div class="col-md-3">
								<!-- Text input-->
								<div class="form-group row">
									<label class="col-md-4 control-label" for="textinput">Nom
										:</label>
									<div class="col-md-8">

										<c:out value="${nom}" />

									</div>
								</div>
								<div class="form-group row">
									<label class="col-md-4 control-label" for="textinput">Prenom
										:</label>
									<div class="col-md-8">
										<c:out value="${prenom}" />
									</div>
								</div>
								<div class="form-group row">
									<label class="col-md-4 control-label" for="textinput">Age
										: </label>
									<div class="col-md-8">
										<c:out value="${age}" />
										ans
									</div>
								</div>
								<div class="form-group row">
									<label class="col-md-4 control-label" for="textinput">Adresse
										:</label>
									<div class="col-md-8">
										<c:out value="${adresse}" />
									</div>
								</div>

								<div class="form-group row">
									<label class="col-md-4 control-label" for="radios">Sexe
										:</label>
									<div class="col-md-4">
										<c:out value="${sexe}" />
									</div>
								</div>
							</div>

							<div class="col-md-9">
								<c:choose>

									<c:when test="${sexe == 'homme'}">
										<img src='img/sacha.jpg' width='80%'>
									</c:when>
									<c:when test="${sexe == 'femme'}">
										<img src='img/micha.jpg' width='80%'>
									</c:when>
									<c:otherwise>
										<img src='img/neutre.jpg' width='80%'>
									</c:otherwise>
								</c:choose>



							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="../../../../assets/js/vendor/jquery-slim.min.js"><\/script>')
	</script>
	<script src="../../../../assets/js/vendor/popper.min.js"></script>
	<script src="../../../../dist/js/bootstrap.min.js"></script>
	<script src="../../../../assets/js/vendor/holder.min.js"></script>
	<script>
		Holder.addTheme('thumb', {
			bg : '#55595c',
			fg : '#eceeef',
			text : 'Thumbnail'
		});
	</script>
</body>
</html>