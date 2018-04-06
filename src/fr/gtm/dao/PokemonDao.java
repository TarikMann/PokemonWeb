package fr.gtm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import fr.gtm.domaine.Pokemon;

public class PokemonDao {
	public List<Pokemon> getAllPokemon(List<Pokemon> LaListeDesPOkemon) {

		try {

			// Etape 1 : Importer le driver
			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("Driver ok");

			// Etape 2 : Connexion a la BDD
			String url = "jdbc:mysql://127.0.0.1:3306/pokemonbdd";
			String user = "root";
			String passwd = "";

			Connection con = DriverManager.getConnection(url, user, passwd);
			System.out.println("Connexion ok");

			// si le driver n'est pas importer on affiche une erreur

			// Etape 3 : Preparation de la requete
			java.sql.Statement stmt = con.createStatement();
			String Sql = "SELECT * FROM pokemon";

			// etape 4 : executer la requete
			ResultSet rs = stmt.executeQuery(Sql);
			// System.out.println(rs.toString());
			while (rs.next()) {
				Pokemon Lepokemon = new Pokemon(rs.getInt("id_pokemon"), rs.getString("nom"), rs.getString("imageUrl"),
						rs.getInt("pxDepart"));
				LaListeDesPOkemon.add(Lepokemon);
			}

			for (Pokemon leClient : LaListeDesPOkemon) {

//				Pokemon.out.println("[CLient (id: " + Lepokemon.getIdClient() + ", nom: " + Lepokemon.getNom()
//						+ ", prenom: " + Lepokemon.getPrenom() + ", age: " + leClient.getAge() + ", IdConseiller: "
//						+ leClient.getIdConseiller() + "]");
			}

		} catch (ClassNotFoundException e) {

			System.out.println("probleme d'importation du driver  : " + e.getMessage());
			// e.printStackTrace();

		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());

		}
		return null;
	}
}
