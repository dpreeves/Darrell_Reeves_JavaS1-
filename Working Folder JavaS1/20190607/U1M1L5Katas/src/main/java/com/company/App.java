package com.company;

public class App {
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int subtractOrZero(int a, int b) {
        int orZero = a - b;
        if (orZero > 0) {
            return orZero;
        } else {
            return 0;
        }
    }

    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }
        if (c > a && c > b) {
            return c;
        } else {
            return 0;
        }
    }

    public static int min(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        }
        if (b < a && b < c) {
            return b;
        }
        if (c < a && c < b) {
            return c;
        }

        if ((a == b && b < c)){
            return a;
        }

        if ((b == c && c < a)){
            return b;
        }

        if ((c == a && a < b)){
            return c;
        } else if ((c == a && a == b)){
            return a;
        } else  return 0;



    }

    public static boolean isLarger(int first, int second) {
        if (first > second) {
            return true;
        } else {
            return false;
        }
    }
}


