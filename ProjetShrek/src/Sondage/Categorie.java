package Sondage;
/**
@author Groupe Shrek
**/
public class Categorie {
	/** 
	 * identifiant de la classe Catégorie s'incrémente à chaque création d'une nouvelle catégorie
	 * **/
	static int num = 0;
	private int id;
	/**
	 * Une Catégorie est composé d'un intitule et d'une description
	 */
	private String intitule;
	private String description;
	/** 
	 * constructeur de catégorie, sert pour l'ajout d'une catégorie
	 * **/
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
	@param intitule
	**/
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
	@param description
	**/
	public void setDescription(String description) {
		this.description = description;
	}
	
}
