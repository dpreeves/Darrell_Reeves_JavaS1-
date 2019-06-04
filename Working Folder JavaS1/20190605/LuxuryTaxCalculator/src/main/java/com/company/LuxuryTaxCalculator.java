package com.company;

import java.util.Scanner;


public class LuxuryTaxCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your player 1 salary (no dollar sign or commas");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("Please enter your player 2 salary (no dollar sign or commas");
        int num2 = Integer.parseInt(input.nextLine());
        System.out.println("Please enter your player 3 salary (no dollar sign or commas");
        int num3 = Integer.parseInt(input.nextLine());
        int sum = num1 + num2 + num3;

        if (sum <= 40000000) {
            System.out.println("The team's spending is" + sum);
        } else {
            double overflow = sum - 40000000;
            System.out.println("The amount is " + overflow + " the team budget.");
            System.out.println("luxury tax charged");
            double tax = (overflow) * 0.18;
            System.out.println("Tax: " + tax);
        }


    }
}
