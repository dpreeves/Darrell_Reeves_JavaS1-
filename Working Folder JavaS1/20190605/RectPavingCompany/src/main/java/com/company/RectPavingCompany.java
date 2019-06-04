package com.company;

import java.util.Scanner;


public class RectPavingCompany {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("the width of the driveway as an integer in feet?");
        double width = myScanner.nextDouble();
        System.out.println("the length of the driveway as an integer in feet?");
        double length = myScanner.nextDouble();
        double area = length * width;
        System.out.println("The area of your driveway is " + area);
        double perimeter = (length + width) * 2;
        System.out.println("The perimeter of your driveway is " + perimeter);
        System.out.println("The cement for the driveway cost $12.50/square foot");
        System.out.println("The framing/footers for the driveway cost $8.25/linear foot");

        double cement = area * 12.5;
        double framing = perimeter * 8.25;
        double total = cement + framing;


        System.out.printf("The subtotal cost of the cement is %.2f", cement);
        System.out.printf("The subtotal cost of the framing is  %.2f", framing);
        System.out.printf("The total cost of the framing and cement is  %.2f", total);


    }
}
