package Sondage;
/**
 * @author Groupe Shrek
 */
/**
 * Classe catégorie, contient les informations sur une catégorie à qui appartiendront des sondés et des sondages
 */
public class Categorie {

	/**
	 * Attributs : intitule, description, identifiant (auto-incrémenté)
	 */
	static int num = 0;
	private int id;
	private String intitule;
	private String description;
	
	/** 
	 * constructeur de catégorie, sert pour l'ajout d'une catégorie
	 * @param intitulé (string) : intitulé de la catégorie
	 * @param descrition (string) : description de la catégorie
	 */
	public Categorie(String intitule, String description){
		num++;
		this.id = num;
		this.intitule=intitule;
		this.description=description;
	}
	/**
	 * Accès à l'ID de la catégorie
	 * @return l'id de la catégorie
	 */
	public int getId() {
		return this.id;
	}
	/**
	 * Accès à l'intitule de la catégorie
	 * @return l'intitule de la catégorie
	 */
	public String getIntitule() {
		return intitule;
	}
	/**
	 * Modification d'un intitule
	 * @param intitule
	 */
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	/**
	 * Accès à la description de la catégorie
	 * @return la description de la catégorie
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Modification d'une description
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}
