package fr.gtm.service;

import java.util.List;

import fr.gtm.dao.ClientDao;
import fr.gtm.dao.PokemonDao;
import fr.gtm.domaine.Client;
import fr.gtm.domaine.Pokemon;

public class ClientService {

	String leretour;

	public String creerClient(ClientDao dao, Client client) {
		if (dao.createClient(client)) {
			leretour = "ok";
			return leretour;
		} else {
			leretour = "ko";
			return leretour;
		}
	}

	public List<Client> getAll(ClientDao dao, List<Client> LaListeDesClients) {

		dao.getAllClient(LaListeDesClients);
		return LaListeDesClients;

	}

	public Client getClient(ClientDao dao, int idClient) {
		System.out.println("Récupération du client dans la base de donnée");
		return dao.getClient(idClient);
	}


	public Client updateClient(ClientDao dao, Client client) {
		System.out.println("Modification des données du client");

		return dao.updateClient(client);
	}
}
