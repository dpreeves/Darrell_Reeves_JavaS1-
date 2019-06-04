package com.company;

import java.util.Scanner;

public class AddFiveAndDouble {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int num = Integer.parseInt(myScanner.nextLine());
        int solution = (num + 5) * 2;
        System.out.println("The sum of your number and 5 times 2 is " + solution);

    }
}
