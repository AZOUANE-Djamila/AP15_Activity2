/**
 * 
 */
package Master15.Springboot_SI_AZOUANEDjamila.model;

/**
 * Représente un sphere
 * @author AZOUANE Djamila
 *
 */

public class Sphere extends Cercle {

	/**
	 * Le constructeur du sphere vide
	 */
	public Sphere() {
		super();
	}
	
	/**
	  * @return sSph la superficie du sphere
	  * sSph= 4 × π × R2
	 */
	
	@Override
	public double superficie() {
		double rSph = getDiametre()/2;
		double sSph = 4 * Math.PI * Math.pow(rSph,2);//Formule mathémtique= 4πr2
		return sSph;
	}
	
	/**
	 * 
	 * @return v
	 * Le volume du sphere : V = 4/3πr³
	 */
	public final double volume() {
		double rSph = getDiametre()/2;
		double v = Math.round(4/3 * Math.PI * Math.pow(rSph,3));//Retourner l'arrondie du volume
		return v;
	}
	
	/**
	 * Redéfinir la méthode toString attribué à la classe Sphere
	 */
	@Override
	public String toString() {
		return String.format("Sphere [superficie=%s, volume=%s, Diametre=%s, Origine=%s, Nom=%s]",
				superficie(), volume(), getDiametre(), getOrigine(), getNom());
	}	
	
	/**
	 * Afficher le contenu de toString
	 */
	public void afficher() {System.out.println(this.toString());}

	
}
