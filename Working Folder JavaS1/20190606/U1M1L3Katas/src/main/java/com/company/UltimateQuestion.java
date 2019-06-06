package com.company;

import java.util.Scanner;

public class UltimateQuestion {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int userNumber;
        String userInput;

        do {
            System.out.println("Enter a number between 1 and 100");
            userInput = myScanner.nextLine();
            userNumber = Integer.parseInt(userInput);
        } while (userNumber != 42);
        System.out.println("That's the number I was looking for! 42 is definitely the answer!");

    }
}
