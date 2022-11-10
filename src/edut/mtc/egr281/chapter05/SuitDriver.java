package edut.mtc.egr281.chapter05;

public class SuitDriver {

	public static void main(String[] args) {
		
		for(Suit s : Suit.values()) {
			System.out.println(s.getName() + ", " + s.getSymbol());
		} // end for
		
	} // end method main
	
} // end class SuitDriver
