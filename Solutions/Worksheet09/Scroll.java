// Umut Geyik - 120200145 - CMPE 101.02
package Worksheet09;

// Created Scroll class and inherited Paper class. Thus, I will assign 
// scroll's size and quality without initializing default values
public class Scroll extends Paper {
	// Method will create preserveTime by paper's quality. 
	// Every one quality increases preserveTime by 17 years
	
	public int preserveTime = 0;
	// To inherit paper class, we have to use its parameters
	public Scroll(int size, int quality) {
		// In order to return every single information, 
		// We need function super() to return all values
		super(size, quality);
		for(int i = 0; i <= quality; i++) {
			this.preserveTime += 17;
		}
	}
	// Getter and setter for preserveTime
	public int getPreserveTime() {
		return preserveTime;
	}
	public void setPreserveTime(int preserveTime) {
		this.preserveTime = preserveTime;
		
	}
	@Override
	// Created toString method to printout information for every scroll
	public String toString() {
		return "Scroll " + super.toString() + " [preserveTime=" + preserveTime + "]";
	}
	
}
