import java.util.Scanner;

public class MonthConverterIf {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("January = 1\n" +
                "February = 2\n" +
                "March = 3\n" +
                "April = 4\n" +
                "May = 5 \n" +
                "June = 6\n" +
                "July = 7\n" +
                "August = 8\n" +
                "September = 9\n" +
                "October = 10\n" +
                "November = 11\n" +
                "December = 12\n\n" +
                "Please enter the corresponding number for the month");
        int userChoice = myScanner.nextInt();

        if (userChoice == 1){
            System.out.println("January");
        } else if (userChoice == 2){
            System.out.println("February");
        } else if (userChoice == 3){
            System.out.println("March");
        } else if (userChoice == 4){
            System.out.println("April");
        } else if (userChoice == 5){
            System.out.println("May");
        } else if (userChoice == 6){
            System.out.println("June");
        } else if (userChoice == 7){
            System.out.println("July");
        } else if (userChoice == 8){
            System.out.println("August");
        } else if (userChoice == 9){
            System.out.println("September");
        } else if (userChoice == 10){
            System.out.println("October");
        } else if (userChoice == 11){
            System.out.println("November");
        } else if (userChoice == 12){
            System.out.println("December");
        } else if (userChoice < 1 || userChoice > 12){
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }

    }
}
