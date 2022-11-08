package edu.mtc.egr281.horserace;


import java.util.Random;

public class Die {

	// CONSTANTS
	public static final int SIDES = 6;
	
	// FIELDS
	private int value;
	private int numberOfSides;
	private Random randomizer;
	
	// CONSTRUCTORS
	
	public Die() {
		this(Die.SIDES);
	} // end default constructor
	
	public Die(int newNumberOfSides) {
		this.setNumberOfSides(newNumberOfSides);
		this.randomizer = new Random();
		this.setValue(0);
	} // end constructor
	
	// METHODS
	public int getValue() {
		return this.value;
	} // end method getValue()

	private void setValue(int newValue) {
		this.value = newValue;
	} // end method setValue
	
	public int getNumberOfSides() {
		return this.numberOfSides;
	} // end method getValue()

	private void setNumberOfSides(int newNumberOfSides) {
		this.numberOfSides = newNumberOfSides;
	} // end method setValue
	
	public void roll() {
		this.setValue(this.randomizer.nextInt(this.getNumberOfSides()) + 1);
	} // end method roll()
	
} // end class Die
