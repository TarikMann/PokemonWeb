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
 * Servlet implementation class ListClientServlet
 */
@WebServlet("/ListClientServlet")
public class ListClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListClientServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		ClientService monServiceClient;
		ClientDao monClientDao = new ClientDao();
		monServiceClient = new ClientService();
		List<Client> LaListeDesClients =new ArrayList<Client>();
		
		
		LaListeDesClients= monServiceClient.getAll(monClientDao, LaListeDesClients);

		 HttpSession session = request.getSession();
		 session.setAttribute("listeClient", LaListeDesClients);
		 
		 this.getServletContext().getRequestDispatcher("/ListDresseur.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
