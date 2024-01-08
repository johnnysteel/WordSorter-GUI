package project4;

// Throw an exception when an invalid word is read within the input file
// Displays a message to the console
public class IllegalWordException extends IllegalArgumentException {
	public IllegalWordException (String message) {
		super(message);
	}
}
