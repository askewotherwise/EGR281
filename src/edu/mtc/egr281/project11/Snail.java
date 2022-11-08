package edu.mtc.egr281.project11;

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
