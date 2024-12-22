package week06Project;

//Represents a playing card with a value and name.
 
public class Card {
    // Card value (2-14) and name
    private int value;
    private String name;

    //Constructor: initialize card value and name.
     // @param value The value of the card (2-14)
      //@param name  The name of the card
     
    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    // Getters and Setters
    public int getValue() { return value; }
    public void setValue(int value) { this.value = value; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

   // Prints out information about the card.
     
    public void describe() {
        System.out.println("Card Name: " + name);
        System.out.println("Card Value: " + value);
    }
}

