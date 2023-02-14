package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	
	
	@Override			
	public String toString() {
	return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";	
	
	}





	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
		parler("Idefix!");
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
		
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		
	}
	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un gand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force/3);
		
	}


	public String getNom() {
		return nom;
	}
	public static void main(String[] args) {
		Gaulois asterix= new Gaulois( "Astérix ", 8);
		System.out.println(asterix);
		
	}
}
