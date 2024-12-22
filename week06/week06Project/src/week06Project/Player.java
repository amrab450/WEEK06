package week06Project;



import java.util.ArrayList;
import java.util.List;


  //Represents a player in the card game.
 
public class Player {
    // Player's hand and score
    private List<Card> hand;
    private int score;
    private String name;

 
      //Constructor: initialize player's name, hand, and score.
     
     //@param name The player's name
     
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }

   
     // Prints out information about the player and their hand.
     
    public void describe() {
        System.out.println("Player Name: " + name);
        System.out.println("Player Score: " + score);
        System.out.println("Player Hand:");
        for (Card card : hand) {
            card.describe();
        }
    }

   
      //Flips the top card from the player's hand.
     
     // @return The top card from the player's hand
     
    public Card flip() {
        return hand.remove(0);
    }

 
     // Draws a card from the deck and adds it to the player's hand.
      
     // @param deck The deck to draw from
     
    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

   
      //Increments the player's score by 1.
     
    public void incrementScore() {
        score++;
    }

  
     // Returns the player's score.
     
     //@return The player's score
     
    public int getScore() {
        return score;
    }

    
     // Returns the player's name.
      
     // @return The player's name
     
    public String getName() {
        return name;
    }
}
