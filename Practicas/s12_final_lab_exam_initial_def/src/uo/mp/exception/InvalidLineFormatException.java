package uo.mp.exception;

public class InvalidLineFormatException extends Exception {
private static final long serialVersionUID = 1L;
	
	
	public InvalidLineFormatException () {
		super();
	}

	public InvalidLineFormatException(String message) {
		super(message);
		
	}
	
	@Override
	public String toString() {
		return "InvalidLineFormatException [getMessage()=" + getMessage()
				+ ", getCause()=" + getCause() + "]";
	}
	
}

