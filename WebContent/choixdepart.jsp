<%@page import="fr.gtm.domaine.Client"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="fr.gtm.presentation.InscriptionServlet"%>
<%@ page import="fr.gtm.presentation.ListClientServlet"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenue</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src='js/monpremierJS.js'></script>
<script>
	Holder.addTheme('thumb', {
		bg : '#55595c',
		fg : '#eceeef',
		text : 'Thumbnail'
	});
</script>

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
	<%
		String nom = request.getParameter("Nom");
		Client lutilisateur = (Client) session.getAttribute("utilisateur");
	%>


	<div
		class="callout-light text-center fade-in-b primary alert alert-success">
		<h1>
			Bienvenue dresseur - <b><%=lutilisateur.getNom()%> <%=lutilisateur.getPrenom()%>
			</b> -<br> Maintenant choisi ton pokemon de depart :
		</h1>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-sm-4">

				<img id="myImagecara" src="img/pkb.jpg" width="80%">
			</div>
			<div class="col-sm-4">

				<img id="myImagesala" src="img/pkb.jpg" width="80%">
			</div>
			<div class="col-sm-4">

				<img id="myImagebulbi" src="img/pkb.jpg" width="80%">
			</div>
		</div>
		<h1 id="demo" class="text-center text-warning"></h1>
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



</body>
</html>