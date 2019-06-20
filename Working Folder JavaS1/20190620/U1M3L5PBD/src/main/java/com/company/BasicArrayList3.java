package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BasicArrayList3 {
    public static void main(String[] args) {
        List<Integer> randNums = new ArrayList<>();
        Random rand = new Random();
//    int randNum = rand.nextInt(100)+1;

        for (int i = 0; i < 1000; i++) {
            randNums.add(rand.nextInt(90) + 10);
        }
        System.out.println(randNums);
    }
}
