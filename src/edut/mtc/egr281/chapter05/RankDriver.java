package edut.mtc.egr281.chapter05;

public class RankDriver {

	public static void main(String[] args) {
		
		for(Rank r : Rank.values()) {
			System.out.println(r.getName() + ", " + r.getSymbol());
		} // end for
		
	} // end method main
	
}  // end class RankDriver
