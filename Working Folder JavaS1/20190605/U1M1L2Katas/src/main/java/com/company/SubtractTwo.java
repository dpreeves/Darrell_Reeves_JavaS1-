package com.company;

import java.util.Scanner;
public class SubtractTwo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers!");
        System.out.println("Please enter your first number...");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("Please enter your second number...");
        int num2 = Integer.parseInt(input.nextLine());
        int ans = num1 - num2;
        System.out.println("1st number minus the 2nd number is " + ans);

    }
}
