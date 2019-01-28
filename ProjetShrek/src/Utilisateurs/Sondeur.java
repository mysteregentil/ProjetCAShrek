package Utilisateurs;
import Sondage.Categorie;
import Sondage.Sondage;

public class Sondeur {
	public static int num = 0;
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private String mdp;
	
	{
		num++;
	}

	public Sondeur(String nom, String prenom, String email, String mdp) {
		this.setId(num);
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setEmail(email);
		this.setMdp(mdp);
	}
	
	/** Cree un sondage **/
	public void createSondage() {
		
	}
	
	/** Supprime un sondage 
	 * Supprime les données associees (questions, reponses, resultats et les participants)
	 * @param s Sondage à supprimer **/
	public void supprimerSondage(Sondage s) {
		
	}
	
	/** Crée une categorie **/
	public void createCategorie() {
		
	}
	
	/** Supprime un sonde 
	 * @param c Categorie à supprimer **/
	public void supprimerSonde(Categorie c) {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

}
