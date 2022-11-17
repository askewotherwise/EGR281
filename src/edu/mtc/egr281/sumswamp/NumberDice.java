package edu.mtc.egr281.sumswamp;

//Natalie Askew
//Project 12
//Current Date 11/17/2022
//Due Date 11/17/2022
//Class that defines the number dice for the Sum Swamp Game

public class NumberDice {

	// CONSTANTS
	
	// FIELDS
	private NumberDie d1;
	private NumberDie d2;
	
	// CONSTRUCTORS
	public NumberDice() {
		this(NumberDie.SIDES);
	} // end default constructor
	
	public NumberDice(int newNumberOfSides) {
		this.d1 = new NumberDie(newNumberOfSides);
		this.d2 = new NumberDie(newNumberOfSides);
	} // end constructor
	
	// METHODS
	public void roll() {
		this.d1.roll();
		this.d2.roll();
	} // end method roll()
	
	public void singleRoll() {
		this.d1.roll();
	}
	
	public int getSingleRoll() {
		int singleRollValue = 0;
		singleRollValue = this.d1.getValue();
		return singleRollValue;
	} // end method getSingleRoll()
	
	public int getValue(char newOperation) {
		
		int returnValue = -1;
		
		//System.out.println( d1.getValue() + " " + newOperation + " " + d2.getValue());
		
		if(newOperation == '+') {
			returnValue = this.d1.getValue() + this.d2.getValue();
		} else if (newOperation == '-') {
			returnValue = this.d1.getValue() - this.d2.getValue();
		} else {
			System.out.println("Error in addition or subtraction.");
		}
		
		return returnValue;
	} // end method getValue()
	
	public void printOperation(char newOperation) {
		System.out.println( d1.getValue() + " " + newOperation + " " + d2.getValue());
	}
	
	public int getNumberOfSides() {
		return this.d1.getNumberOfSides();
	} // end method getNumberOfSides()
	
} // end class NumberDice
