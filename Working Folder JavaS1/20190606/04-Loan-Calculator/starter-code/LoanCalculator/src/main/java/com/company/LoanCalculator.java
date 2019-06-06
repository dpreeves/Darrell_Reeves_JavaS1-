package com.company;

import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is the mortgage amount");
        String userInput1 = myScanner.nextLine();
        int userMortgage = Integer.parseInt(userInput1);

        System.out.println("What is the term of the mortgage in months");
        String userInput2 = myScanner.nextLine();
        int userTerm = Integer.parseInt(userInput2);

        System.out.println("What is the annual interest rate of the mortgage");
        String userInput3 = myScanner.nextLine();
        float userRate = float.parsefloat(userInput3);

//        P = L[c(1 + c)n]/[(1 + c)n - 1]

        float c = userRate/12;
        int p = userMortgage*(c*Math.pow((1 + c),userTerm))/(Math.pow((1 + c),userTerm) - 1);

    }
}
