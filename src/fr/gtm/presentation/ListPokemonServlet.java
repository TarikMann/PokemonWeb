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

import fr.gtm.dao.PokemonDao;
import fr.gtm.domaine.Pokemon;
import fr.gtm.service.PokemonService;

/**
 * Servlet implementation class ListPokemonServlet
 */
@WebServlet("/ListPokemonServlet")
public class ListPokemonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListPokemonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PokemonDao monPokemonDao;
		PokemonService monServicePokemon;
		monPokemonDao = new PokemonDao();
		monServicePokemon = new PokemonService();
		List<Pokemon> LaListeDesPokemon = new ArrayList<Pokemon>();
		
		LaListeDesPokemon = monServicePokemon.getAll(monPokemonDao, LaListeDesPokemon);


		 HttpSession session = request.getSession();
		 session.setAttribute("listePokemon", LaListeDesPokemon);
		 
		 this.getServletContext().getRequestDispatcher("/ListPokemon.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
