import java.util.Random;

public class Dealer {
    public static void main(String[] args) {
        // Generate ranks dynamically
        String[] ranks = new String[13];
        for (int i = 0; i < 9; i++) {
            ranks[i] = String.valueOf(i + 2); // 2 to 10
        }
        ranks[9] = "J";
        ranks[10] = "Q";
        ranks[11] = "K";
        ranks[12] = "A";

        // Define suits
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // Pick a random card
        Random random = new Random();
        String rank = ranks[random.nextInt(ranks.length)];
        String suit = suits[random.nextInt(suits.length)];

        // Create Card object
        Card pickedCard = new Card(rank, suit);

        // Print the picked card
        System.out.println("Picked card: " + pickedCard);
    }
}
