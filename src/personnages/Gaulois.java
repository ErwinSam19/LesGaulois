package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	
	
	@Override			
	public String toString() {
	return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";	
	
	}



	public void boirePotion(int forcePotion) {
		parler("Merci Druide, je sens que ma force est "+forcePotion+"fois décuplée");
		
	}

	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
		
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
		
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		
	}
	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un gand coup dans la m�choire de " + romain.getNom());
		romain.recevoirCoup((force/3)*effetPotion);
		
	}


	public String getNom() {
		return nom;
	}
	public static void main(String[] args) {
		Gaulois asterix= new Gaulois( "Ast�rix ", 8);
		System.out.println(asterix);
		asterix.boirePotion(3);
	}
}
