// Umut Geyik - 120200145 - CMPE101.02
package Week14;

public interface IComponent {
	
	// PART I.I: Interface class of Component
	
	public String RAM(String type, int memory, int speed);
	public String CPUnit(String brand, String pin, int speed, int cores);
	public String MOBO(String brand, String pin, int MaxRAMSpeed);
}
