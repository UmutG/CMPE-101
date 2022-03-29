// Umut Geyik - 120200145 - CMPE101.02
package weekly;

// Let's import necessary libraries
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

public class Week12 {

	//				!-- PART I --!
	public double[] convertMeter(double meter) {
		// Since I decided to write 6 values of given meter value,
		// I created an array with 6 elements:
		double units [] = new double [6];

		// For feet calculation, Google says for an approximate result, 
		// multiply the length value by 3.281.
		
		units[5] = 3.281 * meter; // Feet
		units[4] = 39.37 * meter; // Inch
		units[3] = meter / Math.pow(10, 3); // Kilometer
		units[2] = meter; // Meter
		units[1] = Math.pow(10, 2) * meter; // Centimeter
		units[0] = Math.pow(10, 3) * meter; // Millimeter
		return units;
	}
	
	//				!-- PART II --!
	public void writeUnits(double [] unit) {
		// Now, let's write every single value that we have after
		// converted meter value.
		try {
			File file = new File("units.txt");
			
			// Here we have cleaner. This guy has no action but
			// cleaning previous written values. Thus, we will save space
			// and will not see previous values.
			FileWriter cleaner = new FileWriter(file);
			cleaner.write("");
			cleaner.close();
			
			// Essential FileWriter object to write values to a file
			// We need to make it append to read lines and not confuse
			// when reader read values.
			FileWriter fileWriter = new FileWriter(file, true);
			for(int i = 0; i < unit.length; i++){
				// Write values to units.txt
				fileWriter.write(Double.toString(unit[i]) + "\n");
				fileWriter.flush();
			}
			// Process finished. Close fileWriter.
			fileWriter.close();
			
		} catch (IOException e) {
			// In case we have any error.
			e.getMessage();
			e.printStackTrace();
		}
	}
	
	//				!-- PART III --!
	public void readUnits() throws IOException {
		File file = new File("units.txt");
		// I used BufferedReader to read processed values in units.txt
		// It gives me efficient reading of chars, arrays and strings.
		BufferedReader buffReader = new BufferedReader(new FileReader(file));
		String value;
		
		// If taken value is not null, print it out
		while((value = buffReader.readLine()) != null)
			System.out.println(value);
		
		// Close buffReader object.
		buffReader.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		// To get input from user, create a Scanner object.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is the value?: ");
		double meter = scan.nextDouble();
		scan.close();
		
		// To run operations, create a Week12 object.
		Week12 ops = new Week12();
		
		// Let's run operations.
		ops.writeUnits(ops.convertMeter(meter));
		ops.readUnits();
	}
}
