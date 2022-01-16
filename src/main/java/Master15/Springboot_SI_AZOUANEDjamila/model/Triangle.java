/**
 * 
 */
package Master15.Springboot_SI_AZOUANEDjamila.model;

/**
 * Repr�sente un triangle
 * @author AZOUANE DJAMILA
 *
 */
public abstract class Triangle extends FormeGeometrique {
	
	private int cote;
	
	
	/**
	 * @return cote
	 * R�cup�rer la taille du cot� d'un triangle
	 */
	public int getCote() {
		return cote;
	}


	/**
	 * Modifier la taille du cot� d'un triangle
	 * @param cote la taille du cot� � mettre
	 */
	public void setCote(int cote) {
		if (cote <= 0) 
		      throw new ArithmeticException("La longueur du cote doit etre superieure � 0"); 
		
		else {
	        	this.cote = cote;    	
	        	}
	}

	/**
	 * Constructeur Triangle vide
	 */
	public Triangle() {
		super();
	}

	/**
	 * Constructeur Triangle avec des parametres en argument
	 * @param origine
	 * Le point d'origine du traingle, il a �t� h�rit� de la classe forme g�om�trique
	 * @param cote
	 * Un c�t� de l'angle droit est soit oppos�, soit adjacent � l'un des angles aigus du triangle.
	 */
	public Triangle(Point origine,int cote) {
		super(origine);
		setCote(cote);
	}
	
}
