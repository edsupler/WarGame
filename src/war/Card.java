package war;

public class Card {

	//Card
	//Fields
	//value (contains a value from 2-14 representing cards 2-Ace)
	//done through the map in deck
	//name (e.g. Ace of Diamonds, or Two of Hearts)
	private int value;
	private String suit;
	private String valueToString;
	
	
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
		return this.valueToString + " of " + this.suit;
		
		
		
	}

	public String getValueToString() {
		return valueToString;
	}

	public void setValueToString(String valueToString) {
		this.valueToString = valueToString;
	}
	
	
	

	
		

}