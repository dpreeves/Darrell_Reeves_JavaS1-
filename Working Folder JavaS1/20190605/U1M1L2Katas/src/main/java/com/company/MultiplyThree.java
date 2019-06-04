package com.company;
import java.util.Scanner;

public class MultiplyThree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers to multiply them!");
        System.out.println("Please enter your first number...");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("Please enter your second number...");
        int num2 = Integer.parseInt(input.nextLine());
        System.out.println("Please enter your third number...");
        int num3 = Integer.parseInt(input.nextLine());
        int ans = num1*num2*num3;
        System.out.println("The answer is "+ans);
    }
}