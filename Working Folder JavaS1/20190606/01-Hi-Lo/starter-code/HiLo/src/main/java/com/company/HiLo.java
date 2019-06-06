package com.company;

//import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Random;
import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to Hi-Low!");
        System.out.println("What is your name?");
        String name = myScanner.nextLine();
        System.out.println("Ok, " + name + " here are the rules.");
        System.out.println("The computer will come up with a number between 1 and 100 (inclusive).");
        System.out.println("The user will be prompted to guess the number.");
        System.out.println("If the user guesses the number correctly, the program displays:\n" +
                "Congratulations, [name of user]! You win!”\n" +
                "It took you [number of guesses] guesses to find my number!");
        System.out.println("If the user does not guess the number correctly,\nThe program will display “Too low!”\nIf the guess is too low and “Too high!”\nIf the guess is too high, and then will prompt the user for another guess.\nThis goes on until the number is guessed correctly");

        Random ran = new Random();
        int comGuess = ran.nextInt(100) + 1;
        System.out.println(comGuess);
        System.out.println("Guess a number between 1 and 100(inclusive)");
        String userInput = myScanner.nextLine();
        int userGuess = Integer.parseInt(userInput);


    }
}
