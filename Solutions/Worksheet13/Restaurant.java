// Umut Geyik - 120200145 - CMPE101.02
package Week14;

public interface Restaurant {
	/*
	 *  PART I: Restaurant Interface:
	 *  =====================================================================
	 *  Have 2 different methods: Owner and Rent
	 *  Owner refers to owner in that branch
	 *  Rent refers to the monthly payment for the landlord
	 */
	public void Owner (String name, String surname, String role, double payment);
	public double Rent (double cubicMeter, double price);
	
}
