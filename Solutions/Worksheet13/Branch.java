// Umut Geyik - 120200145 - CMPE101.02
package Week13;

// Extend the Branch class with ARestaurant (Abstract class)
public class Branch extends ARestaurant {
	/*
	 * Part III: Branch Class
	 * First, let's add "active" variable if the branch is still operating
	 * during the Covid-19 pandemic.
	 */
	boolean active;
	
	public Branch(String name, String date, 
			String location, String phone, boolean active) {
		super(name, date, location, phone);
		this.active = active;
	}
	
	
	public static void main(String[] args) {
		// Let's crate 3 branches and their owners
		Branch br1 = new Branch("Amy's Backing Company", "01/02/1993", "New York City, USA", "+1 1112223344", false);
		br1.Owner("Amy", "Blabla", "Co-Owner", 15580.8);
		
		// Owner's name is Danny, not Amy! Update it.
		br1.empName = "Danny";
		
		// Also, he is the founder, not co-owner.
		br1.empTitle = "Founder";
		
		System.out.println(br1.empName);
		System.out.println(br1.empTitle);
		
		// They pay $50 per meter square and company has 380 m2 area.
		System.out.println(br1.Rent(380, 50));
		
		Branch br2 = new Branch("Amy's Backing Company XL", "02/03/1994", "Illinois, USA", "+1 2223334455", false);
		br2.Owner("Bernie", "Blabla", "Owner", 8047);
		
		// Amy's Backing Company XL decided to operate it's business during the pandemic.
		// Let's mark them active branch.
		br2.active = true;
		
		// Therefore, more business = more money. Bernie's profit has increased. 
		br2.empPayment = 9342.25;
		System.out.println(br2.active + ", " + br2.empPayment);
		
		// They pay $38.7 per meter square and company has 500 m2 area.
		System.out.println(br2.Rent(500, 38.7));
		
		Branch br3 = new Branch("Amy's Backing Company XXL", "03/04/2006", "California, USA", "+1 3334445566", true);
		
		// A database operator made a typo in the establishment date and no one noticed for a whole year.
		br3.date = "03/04/2005";
		
		System.out.println(br3.date);
		br3.Owner("Sam", "Blabla", "Souis Chef", 16329);
		
		// They pay $121.10 per meter square and company has 690 m2 area (Yes, this one is rich).
		System.out.println(br3.Rent(690, 121.10));
		
		
	}

	

}
