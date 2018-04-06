package fr.gtm.domaine;

public class Pokemon {
	int id_pokemon;
	String nom;
	String imageUrl;
	int pxDepart;
	
	
	
	
	
	
	//Constructeur
	
	public Pokemon(int id_pokemon, String nom, String imageUrl, int pxDepart) {
		super();
		this.id_pokemon = id_pokemon;
		this.nom = nom;
		this.imageUrl = imageUrl;
		this.pxDepart = pxDepart;
	}



	public Pokemon() {
		super();
	}
	
	
	
	//get set
	public int getId_pokemon() {
		return id_pokemon;
	}
	public void setId_pokemon(int id_pokemon) {
		this.id_pokemon = id_pokemon;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getPxDepart() {
		return pxDepart;
	}
	public void setPxDepart(int pxDepart) {
		this.pxDepart = pxDepart;
	}
	
	

}
