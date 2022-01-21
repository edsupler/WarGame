package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deck {
	
	
	private List<Card> cards = new ArrayList<Card>();
	
	
	//constructor
	public Deck() {
		Map<Integer, String> cardValueMap = new HashMap<Integer, String>();// swap string and int
		cardValueMap.put(2, "2");
		cardValueMap.put(3, "3");
		cardValueMap.put(4, "4");
		cardValueMap.put(5, "5");
		cardValueMap.put(6, "6");
		cardValueMap.put(7, "7");
		cardValueMap.put(8, "8");
		cardValueMap.put(9, "9");
		cardValueMap.put(10, "10");
		cardValueMap.put(11, "Jack");      
		cardValueMap.put(12, "Queen");
		cardValueMap.put(13, "King");
		cardValueMap.put(14, "Ace");
		
		
		String[] suits = {"Hearts", "Diamonds", "Club", "Spade"};
		
		for (int i = 2; i <= 14; i++) {
			Card card = new Card();
			card.setSuit(suits[0]);
			card.setValue(i);
			cards.add(card);
		}
		for (int i = 2; i <= 14; i++) {
			Card card = new Card();
			card.setSuit(suits[1]);
			card.setValue(i);
			cards.add(card);
		}
		for (int i = 2; i <= 14; i++) {
			Card card = new Card();
			card.setSuit(suits[2]);
			card.setValue(i);
			cards.add(card);
		}
		for (int i = 2; i <= 14; i++) {
			Card card = new Card();
			card.setSuit(suits[3]);
			card.setValue(i);
			cards.add(card);
		}
		System.out.println(cards);
	}
	
	
	public void shuffleCards() { //randomize order of cards
		Collections.shuffle(cards);
		
	}
	public Card draw() { //removed and return top card
		return cards.remove(0);
}
}