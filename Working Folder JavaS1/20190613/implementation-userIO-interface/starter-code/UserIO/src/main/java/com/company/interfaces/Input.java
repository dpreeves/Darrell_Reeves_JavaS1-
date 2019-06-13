package com.company.interfaces;

import java.util.Scanner;

public class Input implements UserIO {
    Scanner myScanner = new Scanner(System.in);



    public int readInt(String prompt) {
        System.out.println(prompt);
        String userInput = myScanner.nextLine();
        int userInt = Integer.parseInt(userInput);

        return userInt;
    }

    public long readLong(String prompt) {
        System.out.println(prompt);
        String userInput = myScanner.nextLine();
        long userLong = Long.parseLong(userInput);

        return userLong;
    }

    public double readDouble(String prompt) {
        System.out.println(prompt);
        String userInput = myScanner.nextLine();
        double userDouble = Double.parseDouble(userInput);

        return userDouble;
    }

    public float readFloat(String prompt) {
        System.out.println(prompt);
        String userInput = myScanner.nextLine();
        float userFloat = Float.parseFloat(userInput);

        return userFloat;
    }

    public String readString(String prompt) {
        System.out.println(prompt);
        String userInput = myScanner.nextLine();

        return userInput;
    }
}
