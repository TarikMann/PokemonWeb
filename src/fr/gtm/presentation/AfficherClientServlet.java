package fr.gtm.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * Servlet implementation class AfficherClientServlet
 */
@WebServlet("/AfficherClientServlet")
public class AfficherClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AfficherClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idCLientString = request.getParameter("idclient");
		
		int idClient = Integer.parseInt( idCLientString);
		Client monClient;
		ClientService monServiceClient;
		ClientDao monClientDao = new ClientDao();
		monServiceClient = new ClientService();
		monClient = new Client();
	
		monClient = monServiceClient.getClient(monClientDao,idClient);
	

		 HttpSession session = request.getSession();
		 
		 session.setAttribute("nom", monClient.getNom());
		 session.setAttribute("prenom", monClient.getPrenom());
		 session.setAttribute("age", monClient.getAge());
		 session.setAttribute("adresse", monClient.getAdresse());
		 session.setAttribute("sexe", monClient.getSexe());
		 this.getServletContext().getRequestDispatcher("/AfficherDresseur.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
