/**
 * 
 */
package Master15.Springboot_SI_AZOUANEDjamila.model;

/** 
 * Repr�sente un triangle isoc�le. un triangle isoc�le est un triangle ayant au moins deux c�t�s de m�me longueur.
 * @author AZOUANE DJAMILA
 * {@summary Un triangle isoc�le est un triangle dont deux c�t� sont �gaux. Le troisi�me c�t� est appel� la base} 
 */

public class TriangleIsocele extends Triangle {
	
	private int base;
	
	
	/**
	 * @return la base du triangle isocele
	 */
	public int getBase() {
		return base;
	}


	/**
	 * @param base 
	 * Remplacer la taille de la base par la base en argument
	 */
	public void setBase(int base) {
		if (base <= 0) 
		      throw new ArithmeticException("La longueur de la base doit etre superieure � 0"); 
		
		else {
	        	this.base = base;    	
	        	}
	}

	
	/**
	 * Constructeur Triangle socele vide
	 */
	public TriangleIsocele() {
		super();
		setOrigine(new Point());//setOrigine est h�rit� de la classe mere triangle
		setBase(base);
	}

	/**
	 * Constructeur Triangle socele avec ses parametres
	 * @param origine
	 * Relative � l'origine
	 * @param cote
	 * La taille du cot� 
	 * @param base
	 * La base du triangle Isocele
	 */
	public TriangleIsocele(Point origine, int cote, int base) {
		super(origine, cote);//Les parametres sont h�rit�s de la classe mere triangle
		setOrigine(origine);
		setBase(base);
		
	}

	/**
	 * Calculer la superficie du Triangle Isocele
	 * @return Retourne la superficie du triangle socele
	 */
	@Override
	public double superficie() {
		return Math.round(1/2 * getBase() * getCote());//Retourner l'arrondie de la superficie
	}

	

	/**
	 * @return la superficie du triangle Isocele
	 */
	

	@Override
	public String toString() {
		return String.format(
				"TriangleIsocele [Base=%s, superficie=%s, Cote=%s, Origine=%s, Nom()=%s]",
				getBase(), superficie(), getCote(), getOrigine(), getNom());
	}


	/**
	 * Afficher la superficie du triangle Isocele
	 */
	public void afficher() {
		System.out.println("La superficie du triangle socele"+toString());
	}


	
	
}
