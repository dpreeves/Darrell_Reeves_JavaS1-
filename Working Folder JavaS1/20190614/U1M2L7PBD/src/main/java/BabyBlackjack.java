import java.util.Random;

public class BabyBlackjack {
    public static void main(String[] args) {

        Random rand = new Random();


        int dealer1 = rand.nextInt(10) + 1;
        int dealer2 = rand.nextInt(10) + 1;
        int player1 = rand.nextInt(10) + 1;
        int player2 = rand.nextInt(10) + 1;

        int playerHand = player1 + player2;
        int dealerHand = dealer1 + dealer2;

        System.out.println("Baby Blackjack!\n" +
                "\n" +
                "You drew " + player1 + " and " + player2 + ".\n" +
                "Your total is " + playerHand + ".\n" +
                "\n" +
                "The dealer has " + dealer1 + " and " + dealer2 + ".\n" +
                "Dealer's total is " + dealerHand + ".\n");

        if (playerHand > dealerHand){
            System.out.println("YOU WIN!");
        }
        if (dealerHand > playerHand){
            System.out.println("DEALER WINS!");
        }
        if (playerHand == dealerHand){
            System.out.println("IT'S A PUSH");
        }
    }
}
