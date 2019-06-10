package com.company;

public class App {



int[] arr  = {0, 1, 2, 3, 4, 5, 6, 7};

        public static int total(int[] arr) {
            int total = 0;
            for (int i = 0; i < arr.length; i++) {
                total = total + arr[i];

            }
            return total;

        }

        public static int totalEven(int[] arr) {
            int total = 0;
            int[] a = new int [arr.length];

            for(int i = 0; i < arr.length; i++) {
            if (i % 2 == 0){
                total = total + arr[i];
            }
            }return total;
        }

    public static int totalOdd(int[] arr) {
        int total = 0;
        int[] a = new int [arr.length];

        for(int i = 0; i < arr.length; i++) {
            if (i % 2 == 1){
                total = total + arr[i];
            }
        }return total;
    }

    public static int secondLargestNumber(int[] array){
        int temp, size;

        size = array.length;
        temp = 0;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {

                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array[size-2];
    }

    public static String[] swapFirstAndLast(String[] arr) {
        int first = 0;

        int  last = arr.length -1;

        String temp = arr[0];
        arr[0] = arr[(last)];
        arr[last] = temp;

        return arr;
    }

    public static int[] reverse(int[] arr) {
        int[] a = new int[arr.length];
        int j = arr.length;
        for (int i = 0; i < arr.length; i++) {
            a[j - 1] = arr[i];
            j = j - 1;
        } return a;


    }

    public static String concatenateString(String[] arr) {
            String output = "";
            for (int i = 0; i < arr.length; i++){
                output = output + arr[i];
            }return output;
    }

    public static int[] everyThird(int[] arr) {
        int[] a = new int[arr.length/3];
        int j = arr.length;
        if (arr.length < 3) {
            for (int i = 0; i < arr.length; i++) {
                if (i % 3 == 0) {
                    a[i / 3] = arr[i];
                }
            }return a;
        } else return "null";
    }

    public static int[] lessThanFive(int[] arr){
            int j = 0;
            for (int i = 0; i < arr.length; i++){
                if (arr[i] >= 5) {
                    j++;
                }
            }

            int[] a = new int[j];
            for (int i = 0; i < arr.length; i++){
                
            }
    }




}
