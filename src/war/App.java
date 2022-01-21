package war;

public class App {

	public static void main(String[] args) {
//		Instantiate a Deck and two Players, call the shuffle method on the deck.		
		
		Deck deck = new Deck();
		deck.shuffleCards();
		
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		
//		Using a traditional for loop, iterate 52 times calling the Draw method on 
//		the other player each iteration using the Deck you instantiated.		
		for(int i = 0; i <=51; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
//		Using a traditional for loop, iterate 26 times and call the flip method for each player.		
		Card p1card = new Card();
		Card p2card = new Card();
		
		for(int i = 0; i <=25; i ++) {
			p1card = player1.flip();
			System.out.println("Player 1's card is: " + p1card.describeCard());
			
			p2card = player2.flip();
			System.out.println("Player 2's card is: " + p2card.describeCard());
			
			
			if (p1card.getValue() > p2card.getValue()) {
				player1.incrementScore();
				System.out.println("Player 1 wins!");
				System.out.println("\t-------------------------------");
			} else if
				(p1card.getValue() < p2card.getValue())	{
				player2.incrementScore();
				System.out.println("Player 2 wins!");
				System.out.println("\t-------------------------------");
			} else {
				System.out.println("DRAW");
				System.out.println("\t-------------------------------");
				
			}
		}
			
//		After the loop, compare the final score from each player. 
//		Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” 
//		depending on which score is higher or if they are both the same.				
		
		System.out.println("Player 1's score is " + player1.getScore());
		System.out.println("Player 2's score is " + player2.getScore());
		 if (player1.getScore() > player2.getScore()) {
			 System.out.println("PLAYER 1 WINS!");
		 } else if
		 	(player1.getScore() < player2.getScore()) {
			 System.out.println("PLAYER 2 WINS!");
			 System.out.println("\t-------------------------------");
		 } else {
			 System.out.println("IT'S A DRAW!!");
		 }
		
		
		
		
	
	}

}
