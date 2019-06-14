import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int userInput = myScanner.nextInt();

        while (userInput < 1 || userInput > 10) {
            System.out.println("You must enter a number between 1 and 10, please try again.");
            userInput = myScanner.nextInt();
        }



    }
}

/*This program prompts the user for a number between 1 and 10 and keeps asking until the entered number is in range.
Your solution must be in a Java file called ValidNumber.

The program must do the following:


Prompt the user to enter a number between 1 and 10.
If the user enters a number less than 1 or greater than 10, display the following error message and prompt the user for another entry:
"You must enter a number between 1 and 10, please try again."
When the user enters a valid number, print the number to the screen and exit*/