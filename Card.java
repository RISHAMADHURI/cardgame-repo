public class Card {
    private String rank;
    private String suit;

    // Constructor
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Getter methods
    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    // Display method
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

