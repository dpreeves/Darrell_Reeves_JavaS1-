import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
keepGuessing();    }
    public static void keepGuessing(){
        Random randomGenerator = new Random();
        Scanner myScanner = new Scanner(System.in);
        int secret = randomGenerator.nextInt(10 ) + 1;
        System.out.println("I'm thinking of a number from 1 to 10. Try to guess it\n" +
                "Your guess:");
        int ans = myScanner.nextInt();

        do {
            System.out.print("This is incorrect. Guess again.\n");
            ans = myScanner.nextInt();
        }while( ans != secret );
        if (ans == secret){
            System.out.println("That's right! You're a good guesser.");
        }
    }
}
