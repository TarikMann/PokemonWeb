<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="fr.gtm.service.ClientService"%>
<%@ page import="fr.gtm.domaine.Client"%>
<%@ page import="fr.gtm.dao.ClientDao"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="fr.gtm.presentation.ListClientServlet"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste des pokemons</title>



<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="style.css" rel="stylesheet">
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

	<div
		class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
		<h1 class="display-4">La Liste des Dresseurs</h1>

	</div>

	<div class="container">

		<div class="row text-center">
			<table class="table  table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Nom</th>
						<th>Prenom</th>
						<th>Adresse</th>
						<th>Age</th>
						<th>Sexe</th>
						<th>Gestions</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach var="lesClients" items="${listeClient}">

						<tr>
							<td>${lesClients.getIdClient()}</td>
							<td>${lesClients.getNom()}</td>
							<td>${lesClients.getPrenom()}</td>
							<td>${lesClients.getAdresse()}</td>
							<td>${lesClients.getAge()} ans</td>
							<td>${lesClients.getSexe()}</td>
							
							
							
							
							
							
							<td><a class='btn btn-info btn-xs'
								href='AfficherClientServlet?idclient=${lesClients.getIdClient()}'><span
									class='glyphicon glyphicon-edit'></span> Afficher </a> <a
								class='btn btn-primary btn-xs' href='#'><span
									class='glyphicon glyphicon-edit'></span> Modifier </a> <a
								class='btn btn-danger btn-xs' href='#'><span
									class='glyphicon glyphicon-edit'></span> Supprimer </a></td>
						</tr>

					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>


	<footer class="pt-4 my-md-5 pt-md-5 border-top">
	<div class="row">
		<div class="col-12 col-md ">

			<small class="d-block mb-3 text-muted text-center">&copy;
				Tarik 2017-2018</small>
		</div>

	</div>
	</footer>
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