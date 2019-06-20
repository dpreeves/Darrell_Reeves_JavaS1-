package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayListThereOrNot {
    public static void main(String[] args) {
        List<Integer> randNums = new ArrayList<>();
        Random rand = new Random();
//    int randNum = rand.nextInt(100)+1;

        for (int i = 0; i < 10; i++) {
            randNums.add(rand.nextInt(50) + 1);
        }
        System.out.println("ArrayList: " + randNums);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Value to find: ");
        int guess = Integer.parseInt(scanner.nextLine());
        boolean there = false;


        for(int i = 0; i < 10; i++){
            if (guess == randNums.get(i)){
                System.out.println(guess + " is in the ArrayList.");
                there = true;

            }

        }

        if (there == false) {
            System.out.println(guess + " is not in the ArrayList");
        }
    }
}
