package week06Project;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


 //Represents a standard deck of 52 playing cards.
 
public class Deck {
    // List of cards in the deck
    private List<Card> cards;

    
      //Constructor: initialize deck with 52 cards.
     
    public Deck() {
        cards = new ArrayList<>();

        // Populate the deck with 52 cards
        for (int suit = 0; suit < 4; suit++) {
            for (int value = 2; value <= 14; value++) {
                String name = getCardName(value, suit);
                Card card = new Card(value, name);
                cards.add(card);
            }
        }
    }

  
     // Returns the name of a card based on its value and suit.
      
     // @param value The value of the card (2-14)
     //@param suit  The suit of the card (0-3)
     // @return The name of the card
     
    private String getCardName(int value, int suit) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        return values[value - 2] + " of " + suits[suit];
    }

    
     //Shuffles the deck of cards.
     
    public void shuffle() {
        Collections.shuffle(cards);
    }

    
     // Draws the top card from the deck.
      
      //@return The top card from the deck
     
    public Card draw() {
        return cards.remove(0);
    }


    // Draw top card
    public Card draw1() {
        return cards.remove(0);
    }
}	

