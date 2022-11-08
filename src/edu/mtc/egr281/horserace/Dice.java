package edu.mtc.egr281.horserace;


public class Dice {

	// CONSTANTS
	
	// FIELDS
	private Die d1;
	private Die d2;
	
	// CONSTRUCTORS
	
	public Dice() {
		this(Die.SIDES);
	} // end default constructor
	
	public Dice(int newNumberOfSides) {
		this.d1 = new Die(newNumberOfSides);
		this.d2 = new Die(newNumberOfSides);
	} // end constructor
	
	// METHODS
	public void roll() {
		this.d1.roll();
		this.d2.roll();
	} // end method roll()
	
	public int getValue() {
		return this.d1.getValue() + this.d2.getValue();
	} // end method getValue()
	
	public int getNumberOfSides() {
		return this.d1.getNumberOfSides();
	} // end method getNumberOfSides()
	
	public boolean isDoubles() {
		return (this.d1.getValue() == this.d2.getValue());
	} // end method isDoubles()
	
} // end class Dice

