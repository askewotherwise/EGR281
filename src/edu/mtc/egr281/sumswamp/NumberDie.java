package edu.mtc.egr281.sumswamp;

//Natalie Askew
//Project 12
//Current Date 11/17/2022
//Due Date 11/17/2022
//Class that defines a single number die for the Sum Swamp Game

import java.util.Random;

public class NumberDie {

	// CONSTANTS
	public static final int SIDES = 6;
	
	// FIELDS
	private int value;
	private int numberOfSides;
	private Random randomizer;
	
	// CONSTRUCTORS
	public NumberDie() {
		this(NumberDie.SIDES);
	} // end default constructor
	
	public NumberDie(int newNumberOfSides) {
		this.setNumberOfSides(newNumberOfSides);
		this.randomizer = new Random();
		this.setValue(0);
	} // end constructr
	
	// METHODS
	public int getValue() {
		return this.value;
	} // end method getValue
	
	private void setValue(int newValue) {
		this.value = newValue;
	} // end method setValue()
	
	public int getNumberOfSides() {
		return this.numberOfSides;
	} // end method getNumberOfSides
	
	private void setNumberOfSides(int newNumberOfSides) {
		this.numberOfSides = newNumberOfSides;
	} // end method setNumberOfSides
	
	public void roll() { 
		this.setValue(this.randomizer.nextInt(this.getNumberOfSides()) +1);
	} // end method roll()
	
} // end class NumberDie
