package com.company;

import java.util.ArrayList;
import java.util.List;

public class BasicArrayList1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            arr.add(-113);
        }


//        arr.add(-113);
//        arr.add(-113);
//        arr.add(-113);
//        arr.add(-113);
//        arr.add(-113);
//        arr.add(-113);
//        arr.add(-113);
//        arr.add(-113);
//        arr.add(-113);

        for (int i = 0; i < arr.size(); i++){
            System.out.println("Slot " + i + " contains a " + arr.get(i));
        }
    }
}
