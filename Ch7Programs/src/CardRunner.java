import java.util.ArrayList;
import java.util.List;
public class CardRunner {
public static void main(String[] args) {
	List<Card> deckOfCards = new ArrayList<Card>();
	for(int i = 1; i < 5; i++) {
		for(int j = 1; j < 14; j++) {
			Card card = new Card(i, j);
			deckOfCards.add(card);
			System.out.println(card.getCard());
		}
		System.out.println();
	}
	int num;
	
	for(int k = 0; k < 1000; k++) {
		num = (int)(Math.random()*51);
		deckOfCards.add(deckOfCards.get(num));
		deckOfCards.remove(num);
		
	}
	
	for(int i = 0; i < 51; i++) {
		System.out.println(deckOfCards.get(i).getCard());
	}
	
	List<Card> player1 = new ArrayList<Card>();
	List<Card> player2 = new ArrayList<Card>();
	List<Card> player3 = new ArrayList<Card>();
	List<Card> player4 = new ArrayList<Card>();
	
	int counter = 1;
	for(int i = 0; i < 21; i++) {
		if(counter > 4)
			counter = 1;
		
		if(counter == 1)
			player1.add(deckOfCards.get(i));
		else if(counter == 2)
			player2.add(deckOfCards.get(i));
		else if(counter == 3)
			player3.add(deckOfCards.get(i));
		else if(counter == 4)
			player4.add(deckOfCards.get(i));
		counter++;
	}
	
	System.out.println();
	System.out.println("Player 1 has:");
	for(int i = 0; i < 5; i++) {
		System.out.println(player1.get(i).getCard());
	}
	System.out.println();
	System.out.println("Player 2 has:");
	for(int i = 0; i < 5; i++) {
		System.out.println(player2.get(i).getCard());
	}
	System.out.println();
	System.out.println("Player 3 has:");
	for(int i = 0; i < 5; i++) {
		System.out.println(player3.get(i).getCard());
	}
	System.out.println();
	System.out.println("Player 4 has:");
	for(int i = 0; i < 5; i++) {
		System.out.println(player4.get(i).getCard());
	}
}
}
