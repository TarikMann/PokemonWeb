package fr.gtm.service;

import java.util.List;

import fr.gtm.dao.PokemonDao;
import fr.gtm.domaine.Client;
import fr.gtm.domaine.Pokemon;

public class PokemonService {
	
	public List<Pokemon>  getAll(PokemonDao dao ,List<Pokemon> LaListeDesPOkemon) {
		 
		 dao.getAllPokemon(LaListeDesPOkemon);
	//	 LaListeDesPOkemon.clear();
		return LaListeDesPOkemon;
	}
	
	
}
