package lsystems_exceptions;

public class LSystemSymbolException extends Exception {
	
	private char symbol;
	
	public LSystemSymbolException(char symbol) {
		this.symbol = symbol;
	}

	public char getSymbol() {
		
		return symbol;
	}

}
