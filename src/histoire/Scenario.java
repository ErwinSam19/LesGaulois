package histoire;

public class Scenario {
	
	
	public static void main(String[] args) {
		Druide Panoramix= new Druide("Panoramix",5,10);
		Gaulois Asterix= new Gaulois("Astérix",8);
		Romain minus = new Romain("minus",6);
		Gaulois Obelix = new Gaulois("Obélix",1000);
		System.out.println(Panoramix);
		Panoramix.preparerPotion();
		Panoramix.preparerPotion();
		
		Panoramix.booster(Obelix);
		Obelix.parler("Par Bénélos, ce n'est pas juste !");
		Asterix.boirePotion(6);
		
		Asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
		
	}

}
