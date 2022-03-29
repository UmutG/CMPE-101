// Umut Geyik - 120200145 - CMPE 101.02
package weekly;

public class Test {

	// Create battle method to let them fight
	public void battle(Monster monster, int wizardHealth) {
		int round = 1;
		// Round counter
		while(wizardHealth > 0) {
			// If wizard health is bigger than zero
			// Let's get some damage done
			int damage = monster.attack(2);
			// If monster has done any damage, reduce wizard's health by its value
			wizardHealth -= damage;
			System.out.println("Round " + round + ": " + damage + " damage done to wizard!");
			// Print out round numbers and damages 
			round++;
		}
		System.out.println("Wizard has killed by " + monster.getName() + "!");
		// Notification that shows wizard has killed by its opponent
			
	}
	public static void main(String[] args) {
		// Create three different Monster to prepare them to fight
		Monster m1 = new Monster("Nameless Queen", 34, 10);
		Monster m2 = new Monster("Consumed Twins", 50, 50);
		Monster m3 = new Monster("Ocarios", 20, 100);
	
		// Print out their attributes
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		// Let the fight begins!
		// Create a method from Test class in order to call void method
		Test timeTo = new Test();
		// Call monster and give wizard some health
		timeTo.battle(m3, 59);
		timeTo.battle(m2, 80);
		timeTo.battle(m1, 600);
	}
}
