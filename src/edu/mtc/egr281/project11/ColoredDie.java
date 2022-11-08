package edu.mtc.egr281.project11;

import java.util.Random;

public class ColoredDie {
	// CONSTANTS
	public static final int DEFAULT_NUMBER_OF_SIDES = 6;
	
	// FIELDS
	private String color;
	private Random randomizer;
	
	// CONSTRUCTORS
	public ColoredDie() {
		this.randomizer = new Random();
	}
	
	// METHODS
	public String getColor() {
		return this.color;
	} // end method getColor()
	
	private void setColor(String newColor) {
		this.color = newColor;
	} // end method setColor()
	
	public String roll() {
		int rollValue = this.randomizer.nextInt(DEFAULT_NUMBER_OF_SIDES) + 1;
		switch(rollValue) {
			case 1:
				this.setColor("Red");
				break;
			case 2:
				this.setColor("Yellow");
				break;
			case 3:
				this.setColor("Blue");
				break;
			case 4:
				this.setColor("Green");
				break;
			case 5:
				this.setColor("Pink");
				break;
			case 6:
				this.setColor("Orange");
				break;		
			default:
				break;
		} // end switch
		
		return this.getColor();
		
	} // end method roll
	
} // end class ColoredDie
