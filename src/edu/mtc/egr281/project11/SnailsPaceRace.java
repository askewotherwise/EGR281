package edu.mtc.egr281.project11;

// Natalie Askew
// EGR 281 Project 11
// Due Date 11/10/2022
// Current Date 11/8/2022
// Program that runs the game Snails Pace Race


import java.util.Scanner;

public class SnailsPaceRace {
	
	// CONSTANTS
	public static final int FINISH_LINE = 8;
	public static final Snail[] SNAILS = {new Snail("Red"), new Snail("Yellow"), new Snail("Blue"), new Snail("Green"), new Snail("Pink"), new Snail("Orange")}; 
	public static final String[] SNAIL_NAMES = {"   Red", "Yellow" , "  Blue", " Green", "  Pink" , "Orange"};
	public static final String BLANK = "       ";
	
	// FIELDS
	
	private static ColoredDie d1;
	private static ColoredDie d2;
	private static Scanner kb;
	
	//METHODS

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		System.out.println("Welcome to Snails Pace Race!");
		System.out.println("Out of Red, Yellow, Blue, Green, Pink or Orange,");
		System.out.println("Which snail do you think will cross the finish line first?");
		
		String prediction = kb.next();
		
		System.out.println("Which snail do you think will be in last place at the end of the race?");
		
		String loserPrediction = kb.next();
		
		System.out.println("You predicted that " + prediction + " will win, and " + loserPrediction + " will be in last place! Let's find out if you're right!");
		
		String winner = "";
		String tiedWinner = "";
		 
		SnailsPaceRace.createDice();
			
		boolean isThereAWinner = false;
		
		int numberOfRolls = 0;
		
		do {
			numberOfRolls++;
			d1.roll();
			d2.roll();
			System.out.println("Roll number " + numberOfRolls + " rolled a " + d1.getColor() + " and a " + d2.getColor());
			
			for(int i = 0; i < SNAILS.length; ++i) {
				if(d1.getColor().equals(SNAILS[i].getColor())) {
					SNAILS[i].incrementCurrentSpace();
				} // end if
				
				if(d2.getColor().equals(SNAILS[i].getColor())) {
					SNAILS[i].incrementCurrentSpace();
				} // end if
				
				if(SNAILS[i].getCurrentSpace() == SnailsPaceRace.FINISH_LINE) {
					isThereAWinner = true;
					winner = SNAILS[i].getColor();
					
					// check to see if there is a second winner that is not the same as the first
					
					for(int j = 0; j < SNAILS.length; j++) {
						
						if(SNAILS[j].getCurrentSpace() == SnailsPaceRace.FINISH_LINE && !(SNAILS[j].getColor().equals(SNAILS[i].getColor()))) {
							tiedWinner = SNAILS[j].getColor();
						} // end if
						
					} // end for j
					
				} // end if
			} // end for i
			
			SnailsPaceRace.printSnailTrack();
			
		} while (isThereAWinner != true);
		
		System.out.println();
		System.out.println(winner + " is the winner!");
		
		if(tiedWinner != "") {
			System.out.println(tiedWinner + " also won in a tie!");
		} // end if
		
		System.out.print("You guessed that " + prediction + " would be the winner and ");
		
		if(prediction.equals(winner) || prediction.equals(tiedWinner)) {
			System.out.println("you're right!");
		} else {
			System.out.println("you're wrong!");
		} // end if
		
		// Determine which snails are in last place
		int lastPlace = 8;
		boolean guessedALoser = false;
		
		// find what the last place is
		for(int i = 0; i < SNAILS.length; ++i) {
			
			if(SNAILS[i].getCurrentSpace() < lastPlace) {
				lastPlace = SNAILS[i].getCurrentSpace();
			} // end if
		} // end for
		
		// see if there is more than one snail at the last place
		System.out.println("Snails in last place include ");
		for(int i = 0; i < SNAILS.length; ++i) {
			if(SNAILS[i].getCurrentSpace() == lastPlace) {
				System.out.print(SNAILS[i].getColor() + " ");	
				
				if(SNAILS[i].getColor().equals(loserPrediction)) {
					guessedALoser = true;
				} // end if
				
			} // end if
			
		} // end for
		System.out.println("at " + lastPlace + " place.");
		
		System.out.print("You guessed " + loserPrediction + " would lose ");
		if(guessedALoser) {
			System.out.println("and you were right!");
		} else {
			System.out.println("and you were wrong!");
		}
		
		System.out.println("Thanks for playing!");
		
		kb.close();
		
	} // end method main
	
	
	private static void createDice() {
		d1 = new ColoredDie();
		d2 = new ColoredDie();
	}
	
	
	private static void printSnailTrack() {
		
		for(int i = 0; i < SNAILS.length; ++i) {
			System.out.print(SNAIL_NAMES[i] + ": |");
			
			for(int j = 0; j < SnailsPaceRace.FINISH_LINE; ++j) {
				
				if(SNAILS[i].getCurrentSpace() == (j +1)) {
					System.out.print(SNAIL_NAMES[i] + " |");
				} else {
					System.out.print(BLANK + "|");
				} // end if
				
			} // end for j
			
			System.out.println();
			
		} // end for i
		
		System.out.println();
		
	} // end method printHorseTrack
} // end class SnailsPaceRace
