package com.company;

import java.util.Scanner;

public class YourAgeCan {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How old are you?");
        String userInput = myScanner.nextLine();
        int userAge = Integer.parseInt(userInput);

        if(userAge > 17){
            System.out.println("You can vote.");
        }
        if(userAge > 20){
            System.out.println("You can drink alcohol.");
        }
        if(userAge > 34){
            System.out.println("You can be president.");
        }
        if(userAge > 54){
            System.out.println("You are eligible for AARP.");
        }
        if(userAge > 64){
            System.out.println("You can retire.");
        }
        if(userAge > 79 && userAge < 90){
            System.out.println("You are an octogenerian.");
        }
        if(userAge > 99){
            System.out.println("You are more than a century old.");
        }else{

        }


    }
}
