package com.company;

import java.util.Scanner;

public class CountByThirteen {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number");
        String userInput = myScanner.nextLine();
        int userInt = Integer.parseInt(userInput);
        for(int i =0; i <= userInt; i += 13){
            System.out.println(i);
        }



    }
}