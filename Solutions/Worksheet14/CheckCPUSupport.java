// Umut Geyik - 120200145 - CMPE101.02
package Week14;

public class CheckCPUSupport extends AComponent {

	// PART II.I: One of the classes to use components
	// Check the CPU and MOBO pin types in order to compare the
	// compatibility of the given components.
	public CheckCPUSupport(String cpuPin, String moboPin) {
		if (cpuPin != moboPin) {
			System.out.println("Motherboard doesn't support " + cpuPin +
					" pin type. Either change Motherboard or CPU.");
		}
		else
			System.out.println("Motherboard and CPU are compatible.");
	}
}
