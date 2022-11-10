package edut.mtc.egr281.chapter05;

public class PlayingCard {
	
	// CONSTANTS
	
	// FIELDS
	private Suit suit;
	private Rank rank;
	
	// CONSTRUCTORS
	public PlayingCard(Suit s, Rank r) {
		this.setSuit(s);
		this.setRank(r);
	}
	
	// METHODS
	public Suit getSuit() {
		return this.suit;
	} // end method getSuit()
	
	private void setSuit(Suit newSuit) {
		this.suit = newSuit;
	} // end method setSuit()
	
	public Rank getRank() {
		return this.rank;
	} // end method getRank()
	
	private void setRank(Rank newRank) {
		this.rank = newRank;
	} // end method setRank()

	public String toString() {
		return this.rank.getName() + " of " + this.suit.getName();
	} // end method toString()
	
	public String toStringSymbol() {
		return this.rank.getSymbol() + "" + this.suit.getSymbol();
	} // end method toStringSymbol()
	
	public boolean equals(PlayingCard pc) {
		boolean rv = false;
		
		if((this.getRank() == pc.getRank()) && (this.getSuit() == pc.getSuit())) {
			rv = true;
		} // end if
		
		return rv;
	} // end method equals()
	
} // end class PlayingCard
