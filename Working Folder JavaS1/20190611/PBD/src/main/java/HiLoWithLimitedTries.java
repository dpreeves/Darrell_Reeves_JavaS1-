import java.util.Random;
import java.util.Scanner;

public class HiLoWithLimitedTries {
    public static void main(String[] args) {
        hiLo();    }
    public static void hiLo(){
        Random randomGenerator = new Random();
        Scanner myScanner = new Scanner(System.in);
        int secret = randomGenerator.nextInt(100 ) + 1;
        System.out.println("I'm thinking of a number from 1 to 100. You have 7 guesses.\n" +
                "First guess: ");
        int ans = myScanner.nextInt();
        int count = 2;

        do {
            if(ans < secret) {
                System.out.print("Sorry, you are too low.\n" +
                        "Guess #" + count + " ");
                ans = myScanner.nextInt();
                count = count + 1;
            }
            if(ans > secret) {
                System.out.print("Sorry, that guess is too high.\n" +
                        "Guess #" + count + " ");
                ans = myScanner.nextInt();
                count = count + 1;
            }

        }while( ans != secret && count < 7);
        if (ans == secret){
            System.out.println("You guessed it! What are the odds?!?");
        }
        if (ans != secret && count == 7){
            System.out.println("Sorry, you didn't guess it in 7 tries. You lose");
        }

    }
}
