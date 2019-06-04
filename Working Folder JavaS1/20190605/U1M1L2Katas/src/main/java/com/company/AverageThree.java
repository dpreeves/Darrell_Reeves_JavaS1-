package com.company;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AverageThree {

    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("##.00");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter 1st number.");
        double num1 = myScanner.nextDouble();
        System.out.println("Please enter 2nd number.");
        double num2 = myScanner.nextDouble();
        System.out.println("Please enter 3rd number.");
        double num3 = myScanner.nextDouble();
        double avg = (num1+num2+num3)/3;
        System.out.println(f.format(avg));
    }
}