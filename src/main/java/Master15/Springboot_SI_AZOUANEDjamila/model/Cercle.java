/**
 * 
 */
package Master15.Springboot_SI_AZOUANEDjamila.model;
import java.lang.Math;

/**
 *  Repr�sente un cercle
 * @author AZOUANE DJAMILA
 *
 */
public class Cercle extends FormeGeometrique {
	
	private int diametre;
	
	
	/**
	 * @return the diametre
	 */
	public int getDiametre() {
		return diametre;
	}


	/**
	 * @param diametre the diametre to set
	 * Attribuer l'argument diametre � this.diametre = Attribuez la valeur du param�tre "diametre" � la variable d'instance "diametre"
	 * 'this' est utilis� pour d�sambigu�ser les r�f�rences de variables. 
	 */
	public void setDiametre(int diametre) {
		if (diametre <= 0) 
		      throw new ArithmeticException("La longueur du diametre doit etre superieure � 0"); 
		
		else {
	        	this.diametre = diametre;    	
	        	}
	}

	/**
	 * Constructeur Cercle vide
	 */
	public Cercle() {
		super();
		setOrigine(new Point());
	}

	/**
	 * 
	 * @param origine
	 * Le point d'origine de la classe Cercle
	 * @param diametre
	 * Diametre du cercle 
	 */
	public Cercle(Point origine, int diametre) {
		super(origine);
		setDiametre(diametre);
	}

	/**
	  * @return la superficie du cercle
	 */
	@Override
	public double superficie() {
		double rayon = getDiametre()/2;
		return Math.round(Math.pow(rayon,2) * Math.PI);//Retourner l'arrondie de la superficie
	}
	
	
	// Red�finition de la m�thode � toString � pour la classe Cercle

	/**
	 * Red�finir la m�thode toString attribu�e � la classe Cercle
	 */
	@Override
	public String toString() {
		return String.format("Cercle [Diametre=%s, Superficie=%s, Origine=%s, Nom=%s]", getDiametre(),
				superficie(), getOrigine(), getNom());
	}
	
	/**
	 * Afficher les informations relatives � la classe Cercle
	 */
	public void afficher() {
		System.out.println(toString());
	}
	
}
