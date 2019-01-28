package Sondage;
/**
@author Groupe Shrek
**/
public class Reponse {
	/** 
	 * identifiant de la classe Reponse s'incrémente à chaque création d'une nouvelle reponse
	 * **/
	static int num=0;
	private int id;
	/**
	 * Une Reponse est composé d'un intitule 
	 */
	private String intitule;
	/** 
	 * constructeur de Reponse, sert pour l'ajout d'une réponse
	 * **/
	public Reponse(String intitule){
		num++;
		this.id=num;
		this.intitule=intitule;
	}
	/**
	 * Accès à l'intitule de la reponse
	 * @return l'intitule de la reponse
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
	 * Accès à l'ID de la réponse
	 * @return l'id de la réponse
	 */
	public int getId() {
		return id;
	}
	
}
