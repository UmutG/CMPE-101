// Umut Geyik - 120200145 - CMPE101.02
package Week14;

public class CheckRAMSupport {
	
	// PART II.II: One of the classes to use components
	// Check the RAM and MOBO speeds in order to compare the
	// compatibility of the given components.
	
	public CheckRAMSupport(int RAMspeed, int MOBOspeed) {
		if (RAMspeed > MOBOspeed) {
			System.out.println("Motherboard doesn't support " + RAMspeed +
					" memory speed. Either change Motherboard or RAM.");
		}
		if (RAMspeed <= MOBOspeed)
			System.out.println("Motherboard and RAM are compatible.");
	}
}
