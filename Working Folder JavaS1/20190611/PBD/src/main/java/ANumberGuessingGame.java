import java.util.Random;
import java.util.Scanner;

public class ANumberGuessingGame {
    public static void main(String[] args) {
aNumberGuessingGame();
    }
    public static void aNumberGuessingGame(){
        Random randomGenerator = new Random();
        Scanner myScanner = new Scanner(System.in);
        int secret = randomGenerator.nextInt(10 ) + 1;
        System.out.println("I'm thinking of a number from 1 to 10.\n" +
                "Your guess:");
        int ans = myScanner.nextInt();
        if(ans == secret){
            System.out.println("That's right!  My secret number was " + secret+"!");
        } else {
            System.out.println("Sorry, but I was really thinking of " + secret + ".");
        }
    }
}
