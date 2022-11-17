package edu.mtc.egr281.sumswamp;

// Natalie Askew
// Project 12
// Current Date 11/17/2022
// Due Date 11/17/2022
// Driver class for the Sum Swamp Game

public class SumSwampGame {

	//create all pieces
	public static LittleCritter[] littleCritters = {new LittleCritter("blue"), new LittleCritter("yellow"), new LittleCritter("red"), new LittleCritter("green")}; 
			
	public static NumberDice numberDice = new NumberDice(6);
	public static OperationDie operationDie = new OperationDie(6);
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Sum Swamp!");
		System.out.println("Players will take turns rolling two number dice and one operation die.");
		System.out.println("The first player to reach space 40 is the winner!");
		
		boolean isThereAWinner = false;
		String winner = "";
		int round = 0;
		
		do {
			
			round++;
			System.out.println("Round " + round);
			
			for(int i = 0; i < littleCritters.length; ++i) {
				
				numberDice.roll();
				operationDie.roll();
				
				System.out.println(littleCritters[i].getColor() + " rolled a ");
				
				numberDice.printOperation(operationDie.getSymbol());
				
				System.out.print("and moved from space " + littleCritters[i].getCurrentSpace() + " to ");
				
				littleCritters[i].updateCurrentSpace(numberDice.getValue(operationDie.getSymbol()));
				
				// prevent going negative spaces
				if(littleCritters[i].getCurrentSpace() < 0) {
					int difference = 0 - littleCritters[i].getCurrentSpace();
					littleCritters[i].updateCurrentSpace(difference);
				} // end if
				
				// prevent going spaces over 40
				if(littleCritters[i].getCurrentSpace() > 40) {
					int difference = 40 - littleCritters[i].getCurrentSpace();
					littleCritters[i].updateCurrentSpace(difference);
				} // end if
				
				System.out.println("space " + littleCritters[i].getCurrentSpace());
				
				// check to see if the space landed on is a special space
				// if it is, do the associated action
				int evensOrOdds = 0;
				int numberSpaceResult = 0;
				switch(littleCritters[i].getCurrentSpace()) {
					case 2:
						evensOrOdds = evens();
						littleCritters[i].updateCurrentSpace(evensOrOdds);	
						System.out.println("You are now at space " + littleCritters[i].getCurrentSpace());
						break;
					case 14:
						evensOrOdds = evens();
						littleCritters[i].updateCurrentSpace(evensOrOdds);						
						System.out.println("You are now at space " + littleCritters[i].getCurrentSpace());
						break;
					case 16:
						evensOrOdds = evens();
						littleCritters[i].updateCurrentSpace(evensOrOdds);						
						System.out.println("You are now at space " + littleCritters[i].getCurrentSpace());
						break;
					case 20:
						evensOrOdds = evens();
						littleCritters[i].updateCurrentSpace(evensOrOdds);						
						System.out.println("You are now at space " + littleCritters[i].getCurrentSpace());
						break;
					case 36:
						evensOrOdds = evens();
						littleCritters[i].updateCurrentSpace(evensOrOdds);						
						System.out.println("You are now at space " + littleCritters[i].getCurrentSpace());
						break;
					case 8:
						evensOrOdds = odds();
						littleCritters[i].updateCurrentSpace(evensOrOdds);
						System.out.println("You are now at space " + littleCritters[i].getCurrentSpace());
						break;
					case 32:
						evensOrOdds = odds();
						littleCritters[i].updateCurrentSpace(evensOrOdds);
						System.out.println("You are now at space " + littleCritters[i].getCurrentSpace());
						break;
					case 3: 
						numberSpaceResult = numberSpace(2);
						littleCritters[i].updateCurrentSpace(numberSpaceResult);
						System.out.println("You are now at space " + littleCritters[i].getCurrentSpace());
						break;
					case 11: 
						numberSpaceResult = numberSpace(3);
						littleCritters[i].updateCurrentSpace(numberSpaceResult);
						System.out.println("You are now at space " + littleCritters[i].getCurrentSpace());
						break;
					case 18: 
						numberSpaceResult = numberSpace(1);
						littleCritters[i].updateCurrentSpace(numberSpaceResult);
						System.out.println("You are now at space " + littleCritters[i].getCurrentSpace());
						break;
					case 25: 
						numberSpaceResult = numberSpace(5);
						littleCritters[i].updateCurrentSpace(numberSpaceResult);
						System.out.println("You are now at space " + littleCritters[i].getCurrentSpace());
						break;
					case 27: 
						numberSpaceResult = numberSpace(3);
						littleCritters[i].updateCurrentSpace(numberSpaceResult);
						System.out.println("You are now at space " + littleCritters[i].getCurrentSpace());
						break;
					case 33: 
						numberSpaceResult = numberSpace(3);
						littleCritters[i].updateCurrentSpace(numberSpaceResult);
						System.out.println("You are now at space " + littleCritters[i].getCurrentSpace());
						break;
					case 37: 
						numberSpaceResult = numberSpace(2);
						littleCritters[i].updateCurrentSpace(numberSpaceResult);
						System.out.println("You are now at space " + littleCritters[i].getCurrentSpace());
						break;
					case 6: 
						System.out.println("You found a short cut to space 14!");
						littleCritters[i].updateCurrentSpace(8);
						break;
					case 15: 
						System.out.println("You found a short cut to space 21!");
						littleCritters[i].updateCurrentSpace(6);
						break;
					
				} // end switch
				
				
				
				if(littleCritters[i].getCurrentSpace() >= 40) {
					isThereAWinner = true;
					winner = littleCritters[i].getColor();
					break;
				}
				
			} // end for
			
			System.out.println();
			
		} while(isThereAWinner == false);
		
		System.out.println(winner + " is the winner!");
		
		
		
	} // end method main
	
	public static int evens() {
		int evenResult = 0;
		System.out.println("You landed on an evens space!");
		System.out.println("Roll one number die, if it's even, move that number of spaces!");
		numberDice.singleRoll();
		System.out.println("You rolled a " + numberDice.getSingleRoll());
		
		if(numberDice.getSingleRoll() % 2 == 0) {
			System.out.println("You rolled an even number, so you get to move ahead " + numberDice.getSingleRoll() + " spaces!");
			evenResult = numberDice.getSingleRoll();
		} else {
			System.out.println("Better luck next time!");
		}
		return evenResult;
	} // end method evens()
	
	public static int odds() {
		int oddResult = 0;
		System.out.println("You landed on an odds space!");
		System.out.println("Roll one number die, if it's odd, move that number of spaces!");
		numberDice.singleRoll();
		System.out.println("You rolled a " + numberDice.getSingleRoll());
		
		if(numberDice.getSingleRoll() % 2 == 1) {
			System.out.println("You rolled an odd number, so you get to move ahead " + numberDice.getSingleRoll() + " spaces!");
			oddResult = numberDice.getSingleRoll();
		} else {
			System.out.println("Better luck next time!");
		}
		return oddResult;
	} // end method odds()
	
	public static int numberSpace(int newNumber) {
		int returnValue = 0;
		
		System.out.println("You landed on a number space!");
		System.out.println("The number on this space is " + newNumber + ".");
		System.out.println("Roll the operation die to see if you move ahead " + newNumber + " spaces");
		System.out.println("or back " + newNumber + " spaces!");
		operationDie.roll();
		if(operationDie.getSymbol() == '+') {
			returnValue += newNumber;
			System.out.println("You rolled a + ! That means you get to move ahead " + newNumber + " spaces!");
		} else {
			returnValue -= newNumber;
			System.out.println("You rolled a - ! That means you have to move back " + newNumber + " spaces!");
		} // end if
		
		return returnValue;
	}
	
} // end class SumSwampGame
