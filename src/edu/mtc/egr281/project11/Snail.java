package edu.mtc.egr281.project11;

//Natalie Askew
//EGR 281 Project 11
//Due Date 11/10/2022
//Current Date 11/8/2022
//Program that defines a single Snail object

public class Snail {

	// CONSTANTS
	
	// FIELDS
	private String color;
	private int currentSpace;
	
	// CONSTRUCTORS
	public Snail(String newColor) {
		this.setColor(newColor);
		this.setCurrentSpace(0);
	}
	
	// METHODS
	public int getCurrentSpace() {
		return this.currentSpace;
	} // end method getCurrentSpace()
	
	private void setCurrentSpace(int newCurrentSpace) {
		this.currentSpace = newCurrentSpace;
	} // end method setCurrentSpace()
	
	public void incrementCurrentSpace() {
		this.currentSpace++;
	} // end method incrementCurrentSpace()
	
	public String getColor() {
		return this.color;
	} // end method getColor()
	
	private void setColor(String newColor) {
		this.color = newColor;
	} // end method setColor()
	
	
} // end class Snail
