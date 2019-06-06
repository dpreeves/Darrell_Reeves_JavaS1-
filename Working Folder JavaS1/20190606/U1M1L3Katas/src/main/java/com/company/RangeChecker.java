package com.company;

import java.util.Scanner;

public class RangeChecker {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int userNumber;
        String userInput;

        do {
            System.out.println("Enter a number between 15 and 32");
            userInput = myScanner.nextLine();
            userNumber = Integer.parseInt(userInput);
        } while (userNumber < 15 || userNumber > 32);
        System.out.println(userNumber);


    }
}
