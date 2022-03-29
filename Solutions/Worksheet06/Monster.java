// Umut Geyik - 120200145 - CMPE 101.02
package weekly;
import java.util.Random;
public class Monster {

	// Create given properties with private modifier
	private String name; 
	private int power; 
	private int criticalChance;

	// Override toString() method to print out data
	@Override
	public String toString() {
		return "Name = " + name + ", Power = " + power + ", Critical Chance = " + criticalChance;
	}

	// Getters and setters for my properties
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getCriticalChance() {
		return criticalChance;
	}

	public void setCriticalChance(int criticalChance) {
		this.criticalChance = criticalChance;
	}

	// Default constructor for my Monster class
	public Monster() {
		name = "Test Monster";
		power = 10;
		criticalChance = 10;
	}
	
	// Constructor for my Monster class
	public Monster(String name, int power, int criticalChance) {
		super();
		
		// If monster's power or critical chance is lower than zero,
		// that is an invalid input
		if (power < 0 || criticalChance < 0) {
			System.out.println("Invalid Input!");
			System.exit(1);
		}
		// Assign given monster number to Monster class' properties	
		this.name = name;
		this.power = power;
		this.criticalChance = criticalChance;
	}
	
	public int attack (int criticalMultiplier) {
		// Create random method and integer variable to assign value of random
		// range between 0 - 100
		Random rnd = new Random();
		int checkRnd = rnd.nextInt(101);
		
		// If below condition is true, return power * criticalMultiplier
		// Thus, called monster will give additional damage to its opponent
		if (checkRnd == criticalChance) {
			return power * criticalMultiplier;
		}
		// If above condition is false, then return only power value
		else
			return power;
	}
	
}
