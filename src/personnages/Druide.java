package personnages;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	public int forcePotion =1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		super();
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler(" Bonjour je suis le druide " + nom + " et ma potion peut aller d'une force "+ effetPotionMin +" � "+ effetPotionMax + " . ");
		
	}

	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< "+ texte + ">>");
		
	}
	public void booster(Gaulois gaulois) {
		gaulois.boirePotion(forcePotion);
		nom=gaulois.getNom();
		if (nom="Obélix"):
			parler("Non Obélix !... tu n'auras pas de potion magique !");
		
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
		
	}
	//fonction incomplète
	public void preparerPotion() {
		Random random= new Random();
		force=random.nextInt(effetPotionMax);
		if (force>7):
			parler("J'ai préparé une super potion de force",+force+);
		else:
			parler("Je n'ai pas trouvé les ma potion est seulement de force ",+force+);
	}
	public static void main(String[] args) {
		Druide Panoramix = new Druide("Panoramix",5,10);
		Panoramix.preparerPotion();
		
	}

}
