package edu.mtc.egr281.horserace;


import java.util.Scanner;

public class HorseRace {

	// CONSTANTS
	public static final int FINISH_LINE = 75;
	
	// FIELDS
	private static Scanner keyboard;
	private static Dice dice;
	private static Horse[] horses;
	
	// METHODS	
	
	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		dice = new Dice();
		
		System.out.print("Enter number of horses in the race: ");
		horses = new Horse[keyboard.nextInt()];
		
		for(int i = 0; i < horses.length; ++i) {
			System.out.print("Enter name of horse #" + (i + 1) + ": ");
			horses[i] = new Horse(keyboard.next());
		} // end for
		
		int index = -1;
		Horse horse;
		
		do {
			
			++index;
			horse = horses[index % horses.length];
			
			dice.roll();
			horse.updateCurrentFurlong(dice.getValue());
			HorseRace.printHorseTrack(horse, dice.getValue());
			
		} while(horse.getCurrentFurlong() < HorseRace.FINISH_LINE);
		
		System.out.println(horse.getName() + " is the winner!");
		
		keyboard.close();
	} // end main method
	
	private static void printHorseTrack(Horse h, int roll) {
		
		System.out.print(h.getName() + " rolled " + roll + ": ");
		
		for(int i = 0; i < HorseRace.FINISH_LINE; ++i) {
			
			if(i == h.getCurrentFurlong()) {
				System.out.print("*");
			} else {
				System.out.print("-");
			} // end if
			
		} // end for
		
		System.out.println();
		
	} // end method printHorseTrack
	
} // end class HorseRace