package com.company;

import java.util.Scanner;

public class AgeAgain {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How old are you?");
        String userInput = myScanner.nextLine();
        int userAge = Integer.parseInt(userInput);

        if(userAge < 14) {
            System.out.println("What grade are you in");
            String userAnswer = myScanner.nextLine();
            System.out.println("Wow! " + userAnswer + " grade - that sounds exciting");
        }
        if(userAge > 13 && userAge < 19){
            System.out.println("Are you planning on going to college?");
            String userResponse = myScanner.nextLine();
            if (userResponse="yes")
            System.out.println("Wow! " + userAnswer + " grade - that sounds exciting");
        }
        if(userAge > 34){
            System.out.println("You can be president.");
        }



    }
}
