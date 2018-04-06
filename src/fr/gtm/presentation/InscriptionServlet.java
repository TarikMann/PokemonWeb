package fr.gtm.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.gtm.dao.ClientDao;
import fr.gtm.domaine.Client;
import fr.gtm.service.ClientService;

/**
 * Servlet implementation class InscriptionServlet
 */
@WebServlet("/InscriptionServlet")
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscriptionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Etape 1 : Récupération des paramètres de la requête
		
		String nomRecup = request.getParameter("Nom");
		String prenomRecup = request.getParameter("Prenom");
		String ageRecup = request.getParameter("Age");
		String adressRecup = request.getParameter("adresse");
		String sexeRecup = request.getParameter("sexe");
		
		// Etape 2 : Traitement métier (comparaison des entrées avec valeurs attendues)
		
		Client monClient;
		ClientDao monDao;
		ClientService monServiceClient;
		
		monDao = new ClientDao();
		monServiceClient = new ClientService();
		monClient = new Client(nomRecup, prenomRecup,adressRecup, ageRecup,  sexeRecup);
		String retour = monServiceClient.creerClient(monDao,monClient);
		 HttpSession maSession = request.getSession();
		 maSession.setAttribute("utilisateur", monClient);
		
		// Etape 3 : Réponse à l’utilisateur
		RequestDispatcher dispatcher;
	
		if(retour == "ok") {
			dispatcher = request.getRequestDispatcher("choixdepart.jsp");
			
		}else {
			dispatcher = request.getRequestDispatcher("refus.html");

		}
		dispatcher.forward(request, response);
	//	response.getWriter().append("NOm : " +retour).append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
