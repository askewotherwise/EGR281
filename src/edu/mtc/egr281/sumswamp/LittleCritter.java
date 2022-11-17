package edu.mtc.egr281.sumswamp;

//Natalie Askew
//Project 12
//Current Date 11/17/2022
//Due Date 11/17/2022
// class that defines the LittleCritter game pieces for the Sum Swamp Game

public class LittleCritter {
	
	// CONSTANTS
	
	// FIELDS
	private String color;
	private int currentSpace;
	
	// CONSTRUCTORS
	public LittleCritter(String newColor) {
		this.setColor(newColor);
		this.setCurrentSpace(0);
	}
	
	// METHODS
	private void setColor(String newColor) {
		this.color = newColor;
	} // end method setColor()
	
	public String getColor() {
		return this.color;
	} // end method getColor()
	
	private void setCurrentSpace(int updateNumber) {
		this.currentSpace += updateNumber;
	} // end method setSpace
	
	public int getCurrentSpace() {
		return this.currentSpace;
	} // end method getCurrentSpace()
	
	public void updateCurrentSpace(int updateNumber) {
		this.setCurrentSpace(updateNumber);
	}

} // end class LittleCritter
