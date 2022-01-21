package war;

public class Card {

	private int value;
	private String suit;
	
	
	
	//Getters and setters
	//suit and value
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	
	
	//describe card method
	public String describeCard() {
		return "This is a " + this.value + " of " + this.suit;
		
		
		
	}
	
	
	

	
		

}