package edut.mtc.egr281.chapter05;

public class PlayingCardDriver {

	public static void main(String[] args) {
		
		for(Suit s : Suit.values()) {
			
			for(Rank r : Rank.values()) {
				PlayingCard pc = new PlayingCard(s, r);
				System.out.print(pc.toStringSymbol() + " - ");
				System.out.println(pc.toString());
			} // end for rank
			
		} // end for suit
		
		PlayingCard pc1 = new PlayingCard(Suit.CLUBS, Rank.ACE);
		PlayingCard pc2 = new PlayingCard(Suit.DIAMONDS, Rank.ACE);
		PlayingCard pc3 = new PlayingCard(Suit.CLUBS, Rank.ACE);
		
		System.out.println("Ace of Clubs == Ace of Diamons? " + pc1.equals(pc2));
		System.out.println("Ace of Clubs == Ace of Clubs? " + pc1.equals(pc3));
		
	} // end method main
	
} // end class PlayingCardDriver
