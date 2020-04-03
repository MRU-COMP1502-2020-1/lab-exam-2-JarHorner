package lsystems_exceptions;

public class LSystemLengthException extends Exception {
	
	int length;
	
	public LSystemLengthException(int length) {
		this.length = length;
	}
	
	

}
