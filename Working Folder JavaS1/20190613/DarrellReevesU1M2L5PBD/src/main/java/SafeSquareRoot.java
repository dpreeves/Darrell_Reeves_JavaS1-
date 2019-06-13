import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String[] args) {
        System.out.println("SQUARE ROOT!\n" +
                "Enter a number:");

        Scanner myScanner = new Scanner(System.in);
        int userChoice = myScanner.nextInt();
        while (userChoice <= 0){
            System.out.println("You can't take the square root of a negative number, silly.");
            System.out.println("Try again");
            userChoice = myScanner.nextInt();
        }
        if(userChoice >= 0){
            double root = Math.sqrt(userChoice);
            System.out.println("The square root of " + userChoice + " is " + root);
        }


    }
}
