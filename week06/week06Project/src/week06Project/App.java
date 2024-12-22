package week06Project;


	public class App {
		public static void main(String[] args) {
	        // Instantiate a deck and two players
	        Deck deck = new Deck();
	        Player player1 = new Player("Player 1");
	        Player player2 = new Player("Player 2");

	        // Shuffle the deck
	        deck.shuffle();

	        // Deal 26 cards to each player
	        System.out.println("Dealing cards...");
	        for (int i = 0; i < 26; i++) {
	            player1.draw(deck);
	            player2.draw(deck);
	        }

	        // Play the game
	        System.out.println("Starting game...");
	        for (int i = 0; i < 26; i++) {
	            Card card1 = player1.flip();
	            Card card2 = player2.flip();

	            System.out.println("Round " + (i + 1) + ":");
	            System.out.println("Player 1 flips:");
	            card1.describe();
	            System.out.println("Player 2 flips:");
	            card2.describe();

	            if (card1.getValue() > card2.getValue()) {
	                player1.incrementScore();
	                System.out.println("Player 1 wins this round!");
	            } else if (card2.getValue() > card1.getValue()) {
	                player2.incrementScore();
	                System.out.println("Player 2 wins this round!");
	            } else {
	                System.out.println("It's a tie!");
	            }

	            System.out.println("Current Score:");
	            System.out.println(player1.getName() + ": " + player1.getScore());
	            System.out.println(player2.getName() + ": " + player2.getScore());
	            System.out.println();
	        }

	        // Print the final score
	        System.out.println("Final Score:");
	        System.out.println(player1.getName() + ": " + player1.getScore());
	        System.out.println(player2.getName() + ": " + player2.getScore());

	        // Determine the winner
	        if (player1.getScore() > player2.getScore()) {
	            System.out.println("Player 1 wins the game!");
	        } else if (player2.getScore() > player1.getScore()) {
	            System.out.println("Player 2 wins the game!");
	        } else {
	            System.out.println("It's a tie game!");
	        }
	    }
	}