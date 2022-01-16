/**
 * 
 */
package Master15.Springboot_SI_AZOUANEDjamila.model;
import java.lang.Math;

/**
 * Cette classe repr�sente un carr�
 * @author AZOUANE DJAMILA
 *
 */
public class Carre extends FormeGeometrique {
	
	protected int longueur;
	
	
	/**
	 * R�cup�rer la longueur du carr�
	 * @return la longueur
	 */
	public int getLongueur() {
		return longueur;
	}


	/**
	 * @param longueur � affecter
	 * Attribuer l'argument longueur � this.longueur = Attribuez la valeur du param�tre "longueur" � la variable d'instance "longueur"
	 * 'this' est utilis� pour d�sambigu�ser les r�f�rences de variables. 
	 */
	public void setLongueur(int longueur) {
		if (longueur <= 0) 
		      throw new ArithmeticException("La longueur doit etre superieure � 0"); 
		
		else {
	        	this.longueur = longueur;    	
	        	}
	}

	
	/**
	 * Constructeur Carre vide
	 */
	public Carre() {
		super();
	}


	/**	
	 * Constructeur Carre avec ses parametres en argument
	 * 
	 * @param origine
	 * Point d'origine
	 * @param longueur
	 * La longueur du carr�
	 */
 	public Carre(Point origine, int longueur) {
		super(origine);//Les attribut h�rit�s de la classe mere
		setLongueur(longueur);
	}

	/**
	  * Calculer et r�cup�rer la superficie du carr�e
	  * @return sC la superficie du carr�e
	 */
	@Override
	public double superficie() {
		double sC = Math.pow(longueur,2);//La formule math�matique =longueur^2
		return sC; 
	}

	// Red�finition de la m�thode � toString � pour toutes les classes non abstraites ;
		/**
		 * Red�finir la classe toString() attribu�e � la classe Carre
		 */
	@Override
	public String toString() {
		return String.format("Carre [Longueur=%s, Superficie=%s, Origine=%s, Nom=%s]", getLongueur(),
				superficie(), getOrigine(), getNom());
	}
	
	
	
	
	
}
