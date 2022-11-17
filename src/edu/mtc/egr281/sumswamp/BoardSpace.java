package edu.mtc.egr281.sumswamp;

public class BoardSpace {
	
	// CONSTANTS
	
	// FIELDS
	private int spaceNumber;
	private int shortCut;
	private String evensOrOdds;
	private int numberSpace;
	
	// CONSTRUCTORS
		
	public BoardSpace() {
		this.setSpaceNumber(0);  
		this.setShortCut(0);
		this.setEvensOrOdds("neither");
		this.setNumberSpace(0);
	} // end default constructor
	
	public BoardSpace(int newSpaceNumber, int newShortCut, String newEvensOrOdds, int newNumberSpace) {
		this.setSpaceNumber(newSpaceNumber);
		this.setShortCut(newShortCut);
		this.setEvensOrOdds(newEvensOrOdds);
		this.setNumberSpace(newNumberSpace);
	} // end constructor
	
	// METHODS
	
	public void printSpaceInfo() {
		System.out.println("Space Number: " + this.getSpaceNumber());
		System.out.println("Has shortcut? " + this.getShortCut());
		System.out.println("Has evensOrOdds? " + this.getEvensOrOdds());
		System.out.println("Has number? " + this.getNumberSpace());
	} // end method
	
	private void setSpaceNumber(int newSpaceNumber) {
		this.spaceNumber = newSpaceNumber;
	} // end method
		
	public int getSpaceNumber() {
		return this.spaceNumber;
	} // end method
	 
	private void setShortCut(int newShortCut) {
		this.shortCut = newShortCut;
	} // end method
	
	public int getShortCut() {
		return this.shortCut;
	} // end method
	
	private void setEvensOrOdds(String newEvensOrOdds) {
		this.evensOrOdds = newEvensOrOdds;
	} // end method
	
	public String getEvensOrOdds() {
		return this.evensOrOdds;
	} // end method
	
	private void setNumberSpace(int newNumberSpace) {
		this.numberSpace = newNumberSpace;
	} // end method
	
	public int getNumberSpace() {
		return this.numberSpace;
	} // end method
	
} // end class BoardSpace
