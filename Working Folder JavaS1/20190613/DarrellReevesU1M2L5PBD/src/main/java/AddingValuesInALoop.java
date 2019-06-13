import java.util.Scanner;

public class AddingValuesInALoop {
    public static void main(String[] args) {
        System.out.println("I will add up the numbers you give me.");
        Scanner myScanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Number: ");
        int userChoice = myScanner.nextInt();
        sum = userChoice + sum;
        System.out.println("The total so far is " + (userChoice));
        while (userChoice != 0){
            System.out.println("Number: ");
            userChoice = myScanner.nextInt();
            sum = userChoice + sum;
            System.out.println("The total so far is " + sum);

//            System.out.println("The total is " + sum +"!");
        }
    }
}
