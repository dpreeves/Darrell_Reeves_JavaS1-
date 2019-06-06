package com.company;

import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number");
        String userInput1 = myScanner.nextLine();
        int userNumber = Integer.parseInt(userInput1);

        for (int i = userNumber; i == 1; i--){
            do {
                int mod = (userNumber % (i - 1));
            } while (mod == 0);
        }

    }
}
