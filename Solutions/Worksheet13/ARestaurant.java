// Umut Geyik - 120200145 - CMPE101.02
package Week13;

/*
 * PART II: Restaurant Abstract Class
 * We have to have branches' names, year of foundations, locations and phone numbers. 
 * For owner, we have to have his/her name, surname, title and payment.
 * Rent is calculated by total meter square of the land * price per meter square.
 */

public abstract class ARestaurant implements Restaurant {
	String name, date, location, phone;
	String empName, empSurname, empTitle;
	double empPayment;
	public ARestaurant(String name, String date, String location, String phone) {
		this.name = name;
		this.date = date;
		this.location = location;
		this.phone = phone;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	} 
	
	public void Owner(String empName, String empSurname, String empTitle, double empPayment) {
		this.empName = empName;
		this.empSurname = empSurname;
		this.empTitle = empTitle;
		this.empPayment = empPayment;
		System.out.println("[Name: " + empName + " | Surname: " + empSurname + " | Title: " + 
				empTitle + " | Salary: $" + empPayment +"]"); 
	}
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSurname() {
		return empSurname;
	}

	public void setEmpSurname(String empSurname) {
		this.empSurname = empSurname;
	}

	public String getEmpTitle() {
		return empTitle;
	}

	public void setEmpTitle(String empTitle) {
		this.empTitle = empTitle;
	}

	public double getEmpPayment() {
		return empPayment;
	}

	public void setEmpPayment(double empPayment) {
		this.empPayment = empPayment;
	}

	
	public double Rent(double cubicMeter, double price) {
		return cubicMeter * price;
	}
}
