// Umut Geyik - 120200145 - CMPE101.02
package Week14;

public class Test extends AComponent {
	
	public static void main(String[] args) {
		
		// Create a Test object to run operations
		Test ops = new Test();
		System.out.println(ops.CPUnit("INTEL", "1151", 3600, 8));
		System.out.println(ops.MOBO("GIGABYTE", "1155", 4600));
		System.out.println(ops.RAM("DDR5", 16, 4600));
		
		CheckRAMSupport crs = new CheckRAMSupport(ops.RAMspeed, ops.MaxSpeed);
		CheckCPUSupport ccs = new CheckCPUSupport(ops.CPUpin, ops.MOBOpin);
	}
}
