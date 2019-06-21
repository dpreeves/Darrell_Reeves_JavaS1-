package com.company;

import java.util.Scanner;

public class ConverterApplication {
    public static void main(String[] args) {
        ConverterIf conIf = new ConverterIf();
        ConverterSwitch conSwitch = new ConverterSwitch();
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
        System.out.println(conIf.convertMonth(userChoice));

        System.out.println("Sunday = 1\n" +
                "Monday = 2\n" +
                "Tuesday = 3\n" +
                "Wednesday = 4\n" +
                "Thursday = 5 \n" +
                "Friday = 6\n" +
                "Saturday = 7\n" +
                "Please enter the corresponding number for the month");

        int userChoice2 = myScanner.nextInt();
        System.out.println(conIf.convertDay(userChoice2));

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

        int userChoice3 = myScanner.nextInt();
        System.out.println(conSwitch.convertMonth(userChoice3));

        System.out.println("Sunday = 1\n" +
                "Monday = 2\n" +
                "Tuesday = 3\n" +
                "Wednesday = 4\n" +
                "Thursday = 5 \n" +
                "Friday = 6\n" +
                "Saturday = 7\n" +
                "Please enter the corresponding number for the month");

        int userChoice4 = myScanner.nextInt();
        System.out.println(conSwitch.convertDay(userChoice4));

    }
}
