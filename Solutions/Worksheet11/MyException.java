// Umut Geyik - 120200145 - CMPE 101.02
package Week11;

public class MyException extends Exception {

	public MyException() {
		super("An error has occured.");
	}
	
	public MyException(String message) {
		super(message);
	}
}
