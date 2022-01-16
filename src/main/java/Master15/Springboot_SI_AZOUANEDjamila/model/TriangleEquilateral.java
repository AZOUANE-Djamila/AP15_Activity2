/**
 * 
 */
package Master15.Springboot_SI_AZOUANEDjamila.model;

/**
 * 	Représente un triangle equilateral. Un triangle équilatéral est un triangle dont les trois côtés ont la même longueur.
 * 	@author AZOUANE DJAMILA
 * {@summary -	Un triangle équilatéral est un triangle dont tous les côtés sont égaux } 

 */
public class TriangleEquilateral extends Triangle {
	//TODO 	vérifier les régles métier
	/**
	 * Constructeur TriangleEquilateral vide
	 */
	public TriangleEquilateral() {
		super();
	}

	/**
	 * 
	 * @param origine
	 * L'origine point 
	 * @param cote
	 * La taille du coté
	 */
	public TriangleEquilateral(Point origine, int cote) {
		super(origine, cote);//Origine et cote sont hérités de la classe mere triangle
	}

	/**
	  * @return Retourne la superficie du triangle Equilateral
	 */
	@Override
	public double superficie() {
		return Math.round( Math.sqrt(3)/4 ) * getCote();//Formule de la superficie = √ 3/4 *cote
		//Retourner l'arrondie de la superficie
	}


	/**
	 * @return la superficie du triangle equilateral
	 */
	
	
	@Override
	public String toString() {
		return String.format("TriangleEquilateral [Superficie=%s, Cote=%s, Origine=%s, Nom=%s]",
				superficie(), getCote(), getOrigine(), getNom());
	}

	/**
	 * Afficher la superficie du triangle Equilateral
	 */
	public void afficher() {
		System.out.println("La superficie du triangle Equilateral"+toString());
	}

	
	

}
