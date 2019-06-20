package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CopyingArrayList {
    public static void main(String[] args) {
        List<Integer> randNums = new ArrayList<>();
        List<Integer> randNums2 = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            randNums.add(rand.nextInt(100) + 1);
        }
        for (int i = 0; i < 10; i++){
            randNums2.add(randNums.get(i));
        }
        randNums.set(9, -7);

        System.out.println("ArrayList 1: " + randNums);
        System.out.println("ArrayList 2: " + randNums2);

    }
}
