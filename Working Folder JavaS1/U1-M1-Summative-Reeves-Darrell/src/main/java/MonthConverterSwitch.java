import java.util.Scanner;

public class MonthConverterSwitch {
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

        switch (userChoice)
        {
            case 1:
            System.out.println("January");
                break;
            case 2:
            System.out.println("February");
            break;
            case 3:
            System.out.println("March");
                break;
            case 4:
            System.out.println("April");
                break;
            case 5:
            System.out.println("May");
                break;
            case 6:
            System.out.println("June");
                break;
            case 7:
            System.out.println("July");
                break;
            case 8:
            System.out.println("August");
                break;
            case 9:
            System.out.println("September");
                break;
            case 10:
            System.out.println("October");
                break;
            case 11:
            System.out.println("November");
                break;
            case 12:
            System.out.println("December");
                break;
            default:
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }

    }
}
