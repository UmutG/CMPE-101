// Umut Geyik - 120200145 - CMPE101.02
package Week15;

public abstract class AComponent implements IComponent {

	// PART I.II: Abstract class of Component
	// Create necessary variables and classes in order to call them
	// later on at the Test class. Also, every method will return String value.
	
	String RAMtype, CPUbrand, MOBObrand, CPUpin, MOBOpin;
	int memory, cores, MaxSpeed, RAMspeed, CPUSpeed;
	
	@Override
	public String RAM(String type, int memory, int speed) {
		// TODO Auto-generated method stub
		this.RAMtype = type;
		this.memory = memory;
		this.RAMspeed = speed;
		return "[Type = " + type + ", memory = " + memory + ", speed = " + speed + "]";
	}

	@Override
	public String CPUnit(String brand, String pin, int speed, int cores) {
		// TODO Auto-generated method stub
		this.CPUbrand = brand;
		this.CPUpin = pin;
		this.CPUSpeed = speed;
		this.cores = cores;
		return "[Brand = " + brand + ", pin = " + pin + ", speed = " + speed
				+ ", cores = " + cores + "]";
	}

	@Override
	public String MOBO(String brand, String pin, int MaxSpeed) {
		this.MOBObrand = brand;
		this.MOBOpin = pin;
		this.MaxSpeed = MaxSpeed;
		return "[Brand = " + brand + ", pin = " + pin + ", max memory speed = "
				+ MaxSpeed + "]";
	}

	// Initialize getters and setters methods
	
	public String getRAMtype() {
		return RAMtype;
	}

	public void setRAMtype(String rAMtype) {
		RAMtype = rAMtype;
	}

	public String getCPUbrand() {
		return CPUbrand;
	}

	public void setCPUbrand(String cPUbrand) {
		CPUbrand = cPUbrand;
	}

	public String getMOBObrand() {
		return MOBObrand;
	}

	public void setMOBObrand(String mOBObrand) {
		MOBObrand = mOBObrand;
	}

	public String getCPUpin() {
		return CPUpin;
	}

	public void setCPUpin(String cPUpin) {
		CPUpin = cPUpin;
	}

	public String getMOBOpin() {
		return MOBOpin;
	}

	public void setMOBOpin(String mOBOpin) {
		MOBOpin = mOBOpin;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getCores() {
		return cores;
	}

	public void setCores(int cores) {
		this.cores = cores;
	}

	public int getMaxSpeed() {
		return MaxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		MaxSpeed = maxSpeed;
	}

	public int getRAMspeed() {
		return RAMspeed;
	}

	public void setRAMspeed(int rAMspeed) {
		RAMspeed = rAMspeed;
	}

	public int getCPUSpeed() {
		return CPUSpeed;
	}

	public void setCPUSpeed(int cPUSpeed) {
		CPUSpeed = cPUSpeed;
	}

}
