package edu.mtc.egr281.sumswamp;

//Natalie Askew
//Project 12
//Current Date 11/17/2022
//Due Date 11/17/2022
//Class that defines the operation die for the Sum Swamp Game

import java.util.Random;

public class OperationDie {

	// CONSTANTS
		public static final int SIDES = 6;
		
		// FIELDS
		private char symbol;
		private int value;
		private int numberOfSides;
		private Random randomizer;
		
		// CONSTRUCTORS
		public OperationDie() {
			this(NumberDie.SIDES);
		} // end default constructor
		
		public OperationDie(int newNumberOfSides) {
			this.setNumberOfSides(newNumberOfSides);
			this.randomizer = new Random();
			this.setSymbol(' ');
		} // end constructr
		
		// METHODS
		public char getSymbol() {
			return this.symbol;
		} // end method getValue
		
		private void setSymbol(char newSymbol) {
			this.symbol = newSymbol;
		} // end method setValue()
		
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
			// even numbers return '+' and odd numbers return '-'
			if(this.value % 2 == 0) {
				this.setSymbol('+');
			} else {
				this.setSymbol('-');
			}
			
		} // end method roll()
	
}
