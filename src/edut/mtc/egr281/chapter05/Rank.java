package edut.mtc.egr281.chapter05;

public enum Rank {

	// CONSTANTS
	DEUCE("Deuce",'2'), TREY("Trey", '3'), FOUR("Four", '4'),  
	FIVE("Five",'5'), SIX("Six", '6'), SEVEN("Seven", '7'), 
	EIGHT("Eight",'8'), NICE("Nine", '9'), TEN("Ten", 'T'), 
	JACK("Jack",'J'), QUEEN("Queen", 'Q'), KING("King", 'K'), ACE("Ace",'A'); 
	
	// FIELDS
	private String name;
	private char symbol;
	
	// CONSTRUCTORS
	private Rank(String newName, char newSymbol) {
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
	
} // end enum Rank
