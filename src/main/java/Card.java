public class Card {


    private String suit;
    private String value;
    private boolean faceUp;

    // Set the starting values for a new card
    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.faceUp = true;
    }

    // Get the suit if the card is face up
    public String getSuit() {
        if (this.faceUp) {
            return this.suit;
        } else {
            // Hide the suit
            return "#";
        }
    }

    // Get the value if the card is face up
    public String getValue() {
        if (this.faceUp) {
            return this.value;
        } else {
            // Hide the value
            return "#";
        }
    }

    // Check if the card is face up
    public boolean isFaceUp() {
        return this.faceUp;
    }

    // Turn the card over
    public void flip() {
        this.faceUp = !this.faceUp;
    }
}