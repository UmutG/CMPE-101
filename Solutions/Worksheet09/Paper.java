// Umut Geyik - 120200145 - CMPE 101.02
package Worksheet09;
	// Create a class called Paper and assign two parameters:
	// Paper size  with integer value, its quality with integer value
public class Paper {
	public int size = 0;
	public int quality = 0;
	
	// Paper constructor
	public Paper(int size, int quality) {
		this.size = size;
		this.quality = quality;
	}

	// Getters and setters for paper's size and quality
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	// toString method to return paper's values
	@Override
	public String toString() {
		return "Paper [size=" + size + ", quality=" + quality + "]";
	}
	
}
