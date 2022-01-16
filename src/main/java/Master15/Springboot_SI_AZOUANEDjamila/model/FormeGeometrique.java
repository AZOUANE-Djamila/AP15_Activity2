/**
 * 
 */
package Master15.Springboot_SI_AZOUANEDjamila.model;

/**
 * Repr�sente une forme g�om�trique.
 * @author AZOUANE DJAMILA
 *
 */

public abstract class FormeGeometrique {

	/**
	 * D�finition d�une variable globale � �paisseur � de type entier qui indiquera l��paisseur du trait des diff�rente formes g�om�triques
	 */
	public static int EPAISSEUR = 1;
	
	/**
	 * origine est le point d'origine d'une forme g�om�trique
	 * nom est le nom de la forme g�om�trique
	 */
	private Point origine;
	/**
	 * @return origine R�cup�rer le point d'origine de la forme g�om�trique 
	 */
	public Point getOrigine() {
		return origine;
	}
	
	/**
	 * @param origine le point d'origine � mettre
	 * Attribuer l'argument origine � this.x = Attribuez la valeur du param�tre "origine" � la variable d'instance "origine"
	 * 'this' est utilis� pour d�sambigu�ser les r�f�rences de variables. 
	 */
	public void setOrigine(Point origine) {
		this.origine = origine;
	}
	

	/**
	 * R�cup�rer le nom relatif � la forme g�om�trique
	 * @return nom
	 */
	public String getNom() {
		return this.getClass().getSimpleName();
	}
	
	
	/**
	 * @param nom le nom � attribuer � la forme g�om�trique
	 */
	public void setNom(FormeGeometrique fg) {
		fg.getClass().getSimpleName();
	}
	
	
	/**
	 * Constructeur avec tous les attribut d'une orme g�om�trique
	 * @param origine Le point
	 * @param nom Le nom de la forme g�om�trique
	 */
	public FormeGeometrique(Point origine) {
		super();
		setOrigine(origine);
		setNom(this);
	}
	
	/**
	 * Constructeur forme g�om�trique vide
	 */
	public FormeGeometrique() {
		super();
	}

	/**
	 * D�claration de la m�thode superficie. Cette derniere va �tre d�finie dans les classes filles
	 * @return la superficie de la forme g�om�trique
	 */
	public abstract double superficie();
	

	/**
	 * red�finir la m�thode equals
	 */
	@Override  	//overriding equals() method  
	public boolean equals(Object o)   
	{  
		if (o == null)  return false;  
		if (o == this)return true;  
		return this.superficie() == ((FormeGeometrique) o).superficie();  
	}  


	/**
	 * Une m�thode qui sert � doubler l'�paisseur d'une forme g�om�trique
	 * @param FG
	 * La forme g�om�trique
	 * @return Le double d'�paisseur de la forme g�om�trique
	 */
	public static double doubleEpaisseur(FormeGeometrique FG) {
		return FormeGeometrique.EPAISSEUR * 2;//Doubler l'�paisseur de la forme g�om�trique
	}
	
}
