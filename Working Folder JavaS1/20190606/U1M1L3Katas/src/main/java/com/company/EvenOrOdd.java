package com.company;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        int userInput = myScanner.nextInt();
        if(userInput % 2 == 0)
        {
            System.out.println("The given number "+userInput+" is Even ");
        }
        else
        {
            System.out.println("The given number "+userInput+" is Odd ");
        }

    }
}
