package com.company;

import java.util.Scanner;

public class DoubleAndAddFive {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int num1 = Integer.parseInt(myScanner.nextLine());

        int answer = (num1 * 2) + 5;

        System.out.println("Your number doubled plus 5 is " + answer);


    }
}
