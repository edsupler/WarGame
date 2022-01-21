package war;

import java.util.ArrayList;
import java.util.List;

public class Player {

	//constructors
	private List<Card> hand = new ArrayList<Card>();
	private int score = 0;
	private String name;
	
	public Player(String name, int score, List<Card> hand) {
		this.name = name;
		this.score = 0;
		this.hand = hand;
	}
	public Player() {	
	}
	
	
	//Player Methods
	
	//Prints out information about the player and calls the describe method for each card in the Hand List
	public void describe(Card card) {
		System.out.println("Player: " + name + " is holding a " + card.describeCard());
	
	}
	public void flip() { //remove and return top card of Hand
		
	}
	public void draw() {//take deck as an argument and calls the 
						//draw method on the deck. adding returned
						// card to hand field
		
	}
	public int incrementScore(int score) { 
		return score + 1;
		
	}
}
//ArrayList<Integer> p1 = new ArrayList<>(): <<<<<??????