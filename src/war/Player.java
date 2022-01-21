package war;

import java.util.ArrayList;
import java.util.List;

public class Player {
//	Player
//	Fields
//	hand (List of Card)
//	score (set to 0 in the constructor)
//	name
	
	private List<Card> hand = new ArrayList<>();
	private int score;
	private String name;
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}
	
	
	
	//Player Methods
	
	//Prints out information about the player and calls the describe method for each card in the Hand List
	public void describe() {
		
		System.out.println("Player: " + name + " has a score of " + score);
		for(Card card : hand) {
				System.out.println(card.describeCard());
				}
	}
	
//	flip (removes and returns the top card of the Hand)
	public Card flip() { 
		return hand.remove(0);		
		}
	
//	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)	
	public void draw(Deck deck) {
		hand.add(deck.draw());	
	}
	
//	incrementScore (adds 1 to the Player’s score field)	
	public void incrementScore() { 
		this.score++;
		
	}
	
// 	Getters and Setters
	public List<Card> gethand(){
		return hand;
	}
	public void setHand(List<Card> hand) {
		
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName( ) {
		
	}
	
}
