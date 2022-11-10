package edut.mtc.egr281.chapter05;

public enum Suit {
	
	// CONSTANTS
	SPADES("Spades", '\u2660'), CLUBS("Clubs", '\u2663'), 
	HEARTS("Hearts", '\u2665'),DIAMONDS("Diamonds",'\u2666');
	
	// FIELDS
	private String name;
	private char symbol;
	
	// CONSTRUCTORS
	private Suit(String newName, char newSymbol) {
		this.name = newName;
		this.symbol = newSymbol;
	} // end constructor
	
	// METHODS
	public String getName() {
		return this.name;
	} // end method getName()
	
	public char getSymbol() {
		return this.symbol;
	} // end method getSymbol()

} // end enum Suit
