package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BasicArrayList2 {
    public static void main(String[] args) {


        List<Integer> randNums = new ArrayList<>();
        Random rand = new Random();
//    int randNum = rand.nextInt(100)+1;

        for (int i = 0; i < 10; i++) {
            randNums.add(rand.nextInt(100) + 1);
        }
        System.out.println("ArrayList: " + randNums);
    }
}
