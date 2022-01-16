/**
 * 
 */
package Master15.Springboot_SI_AZOUANEDjamila.model;

/**
 * Repr�sente un cube
 * @author AZOUANE Djamila
 *
 */

// La classe cube ne peut pas �tre h�rit�e par une autre classe ;
	/**
	 * J'ai utilis� final pour ne pas autoriser l'h�ritage de la classe Cube par une autre classe
	 */
public final class Cube extends Carre {

	/**
	 * Constructeur Cube vide
	 */
	public Cube() {
		super();
	}

	//	Exemple d�utilisation du mot � super � avec une m�thode et un constructeur ; (mettre une explication en commentaire)
	/**
	 * Constructeur de la classe Cube
	 * super(origine, longueur); est pour acceder aux attribut h�rit� de la classe mere
	 * @param origine
	 * Point d'origine du Cube
	 * @param longueur
	 * La longueur du cube
	 */
	public Cube(Point origine, int longueur) {
		super(origine, longueur);
		setOrigine(origine);
		setLongueur(longueur);
	}

	/**
	  * @return la superficie du cube
	  * Superficie du cube = La superficie deu carr� * 6
	 */
	@Override
	public double superficie() {

		//return 6 * Math.pow(getLongueur(),2);
		return super.superficie() * 6;
	}
	

	/**
	 * Calculer et retourner le volume du cube
	 * La m�thode volume ne peut pas �tre red�finie par les classes filles ;
	 * @return vCb le colume du cube
	 * J'ai utilis� final pour ne pas autoriser l'h�ritage du volume par une autre classe
	 */
	public final double volume() {
		double vCb = Math.round(Math.pow(getLongueur(),3));//Retourner l'arrondie de la superficie
		return vCb;
	}

	//	Red�finition de la m�thode � toString � pour la classe Cube
		/**
		 * Redefinir la m�thode toString attribu�e � Cube
		 */
	@Override
	public String toString() {
		return String.format(
				"Cube [superficie=%s, volume=%s, Longueur=%s, Origine=%s, Nom=%s]",
				superficie(), volume(), getLongueur(), getOrigine(), getNom());
	}
	
	
	
}
