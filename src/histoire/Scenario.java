package histoire;

public class Scenario {
	
	
	public static void main(String[] args) {
		Druide Panoramix= new Druide("Panoramix",5,10);
		Gaulois Asterix= new Gaulois("Ast�rix",8);
		Romain minus = new Romain("minus",6);
		Gaulois Obelix = new Gaulois("Ob�lix",1000);
		System.out.println(Panoramix);
		Panoramix.preparerPotion();
		Panoramix.preparerPotion();
		
		Panoramix.booster(Obelix);
		Obelix.parler("Par B�n�los, ce n'est pas juste !");
		Asterix.boirePotion(6);
		
		Asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
		
	}

}
