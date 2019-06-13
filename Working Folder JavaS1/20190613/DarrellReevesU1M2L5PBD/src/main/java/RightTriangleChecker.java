import java.util.Scanner;

public class RightTriangleChecker {
    public static void main(String[] args) {
        System.out.println("Enter three integers:\n" +
                "Side 1: ");
        Scanner myScanner = new Scanner(System.in);
        int userChoice1 = myScanner.nextInt();

        System.out.println("Side 2: ");
        int userChoice2 = myScanner.nextInt();

        while (userChoice2 < userChoice1){
            System.out.println(userChoice2 + " is smaller than " + userChoice1 + ". Try again.");
            System.out.println("Side 2: ");
            userChoice2 = myScanner.nextInt();

        }
        System.out.println("Side 3: ");
        int userChoice3 = myScanner.nextInt();

        while (userChoice3 < userChoice2){
            System.out.println(userChoice2 + " is smaller than " + userChoice1 + ". Try again.");
            System.out.println("Side 3: ");
            userChoice3 = myScanner.nextInt();

        }
        System.out.println("Your three sides are " + userChoice1 + " " + userChoice2 + " " + userChoice3);
        double square1 = Math.pow(userChoice1,2);
        double square2 = Math.pow(userChoice2,2);
        double square3 = Math.pow(userChoice3,2);

        if (square1 + square2 == square3){
            System.out.println("These sides *do* make a right triangle.  Yippy-skippy!");
        } else {
            System.out.println("NO!  These sides do not make a right triangle!");
        }
    }
}
