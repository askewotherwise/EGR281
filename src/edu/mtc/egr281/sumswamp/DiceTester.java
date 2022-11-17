package edu.mtc.egr281.sumswamp;

public class DiceTester {

	public static void main(String[] args) {
		
		NumberDice numberDice = new NumberDice(6);
		OperationDie operationDie = new OperationDie(6);
		
		System.out.println("Dice Tester"); 
		
		for(int i = 0; i < 10; ++i) {
			numberDice.roll();
			operationDie.roll();
			
			System.out.println(numberDice.getValue(operationDie.getSymbol()));
			
		} // end for
		
		
		
	} // end method main
	
} // end class DiceTester
