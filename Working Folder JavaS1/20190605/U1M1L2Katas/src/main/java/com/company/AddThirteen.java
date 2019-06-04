package com.company;

import java.util.Scanner;

public class AddThirteen {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = Integer.parseInt(myScanner.nextLine());

        int sum = num + 13;
        System.out.println("The sum of your number and 13 is " + sum);

    }
}
