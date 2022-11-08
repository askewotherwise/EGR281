package edu.mtc.egr281.horserace;


public class Horse {

	// CONSTANTS
	
	// FIELDS	
	private String name;
	private int currentFurlong;
	
	// CONSTRUCTORS
	public Horse(String newName) {
		this.setName(newName);
		this.setCurrentFurlong(0);
	} // end constructor
	
	// METHODS
	public String getName() {
		return this.name;
	} // end method getName()
	
	private void setName(String newName) {
		this.name = newName;
	} // end method setName
	
	public int getCurrentFurlong() {
		return this.currentFurlong;
	} // end method getCurrentFurlong
	
	private void setCurrentFurlong(int newCurrentFurlong) {
		this.currentFurlong = newCurrentFurlong;
	} // end method setCurrentFurlong()
	
	public void updateCurrentFurlong(int updateValue) {
		this.setCurrentFurlong(updateValue + this.getCurrentFurlong());
	} // end method updateCurrentFurlong
	
} // end class Horse

