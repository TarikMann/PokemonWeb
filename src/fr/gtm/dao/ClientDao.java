package fr.gtm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import fr.gtm.domaine.Client;
import fr.gtm.domaine.Pokemon;

public class ClientDao {

	public boolean createClient(Client leclientAdd) {

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
			String SqlIns = "Insert Into client( nom, prenom, adresse, age, sexe) Value ('" + leclientAdd.getNom()
					+ "','" + leclientAdd.getPrenom() + "','" + leclientAdd.getAdresse() + "' , '"
					+ leclientAdd.getAge() + "' , '" + leclientAdd.getSexe() + "' )";
			// System.out.println(SqlIns);

			// etape 4 : executer la requete
			int rs2 = stmt.executeUpdate(SqlIns);
			return true;
		} catch (ClassNotFoundException e) {

			System.out.println("probleme d'importation du driver  : " + e.getMessage());
			// e.printStackTrace();
			return false;
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			return false;
		}

	}
	
	public List<Client> getAllClient(List<Client> LaListeDesClients) {

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
			String Sql = "SELECT * FROM client";

			// etape 4 : executer la requete
			ResultSet rs = stmt.executeQuery(Sql);
			// System.out.println(rs.toString());
			while (rs.next()) {
				Client LeClient = new Client(rs.getInt("id_client"),rs.getString("nom"), rs.getString("prenom"), rs.getString("adresse"),
						rs.getString("age"),rs.getString("sexe"));
				LaListeDesClients.add(LeClient);
			}
			
		

			for (Client leClient : LaListeDesClients) {

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
	
	public Client getClient(int idPrimaire) {
		// Client monclientSelect;
		try {

			// Select idClient From Client

			// Etape 1 : Importer le driver
			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("DRiver ok");
			// si le driver n'est pas importer on affiche une erreur

			// Etape 2 : Connexion a la BDD
			String url = "jdbc:mysql://127.0.0.1:3306/pokemonbdd";
			String user = "root";
			String passwd = "";

			Connection con = DriverManager.getConnection(url, user, passwd);

			System.out.println("Connexion ok");
			// Etape 3 : Preparation de la requete
			java.sql.Statement stmt = con.createStatement();
			String Sql = "SELECT * FROM client WHERE id_client = " + idPrimaire;
System.out.println(Sql);
			// etape 4 : executer la requete
			ResultSet rs = stmt.executeQuery(Sql);
			rs.first();
			// System.out.println(rs.toString());
		System.out.println(rs);
			Client monclientSelect = new Client(rs.getInt("id_client"),rs.getString("nom"), rs.getString("prenom"), rs.getString("adresse"),
					rs.getString("age"),rs.getString("sexe"));
			System.out.println(monclientSelect.toString());
			System.out.println(monclientSelect);
			return monclientSelect;
		} catch (ClassNotFoundException e) {

			System.out.println("probleme d'importation du driver  : " + e.getMessage());

			// e.printStackTrace();

		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}

		return null;

	}
	
	
	public Client updateClient(Client leClientUpd) {
		try {

			// Select idClient From Client

			// Etape 1 : Importer le driver
			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("DRiver ok");
			// si le driver n'est pas importer on affiche une erreur

			// Etape 2 : Connexion a la BDD
			String url = "jdbc:mysql://127.0.0.1:3306/mabddjava";
			String user = "root";
			String passwd = "";

			Connection con = DriverManager.getConnection(url, user, passwd);

			System.out.println("Connexion ok");
			// Etape 3 : Preparation de la requete
			java.sql.Statement stmt = con.createStatement();
			// String Sdql = "SELECT * FROM client WHERE idClient = " + idPrimaire;
			String Sql = "UPDATE `client` SET `nom`='" + leClientUpd.getNom() + "',`prenom`='" + leClientUpd.getPrenom()
					+ "',`age`=" + leClientUpd.getAge() + ",`sexe`=" + leClientUpd.getSexe()+ ",`adresse`=" + leClientUpd.getAdresse()
					+ " WHERE id_client = " + leClientUpd.getIdClient();
			// etape 4 : executer la requete
			int rs3 = stmt.executeUpdate(Sql);
			// System.out.println(rs.toString());
			System.out.println(rs3);
			return null;
		} catch (ClassNotFoundException e) {

			System.out.println("probleme d'importation du driver  : " + e.getMessage());

			// e.printStackTrace();

		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}

		return null;

	}
	
	
	

}
