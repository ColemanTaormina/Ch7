public class Card {
	private String cardSuit;
	private String cardValue;

	public Card(int s, int v) {
		if(s == 1)
			cardSuit = " of Spades";
		else if(s == 2)
			cardSuit = " of Hearts";
		else if(s == 3)
			cardSuit = " of Diamonds";
		else
			cardSuit = " of Clubs";
		
		if(v == 1)
			cardValue = "Ace";
		else if(v > 1 && v < 11)
			cardValue = Integer.toString(v);
		else if(v == 11)
			cardValue = "Jack";
		else if(v == 12)
			cardValue = "Queen";
		else if(v == 13)
			cardValue = "King";
	}

	public String getCard() {
		return cardValue + cardSuit;
	}
	
}
