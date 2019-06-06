package com.company;

import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int dice1 = randomGenerator.nextInt(6 ) + 1;
        int dice2 = randomGenerator.nextInt(6 ) + 1;
        int rollValue = dice1 + dice2;

        for(int i = 0; i < 100; i++){
            rollValue = randomGenerator.nextInt(6) + 1;
            System.out.println(rollValue)

    }
}
