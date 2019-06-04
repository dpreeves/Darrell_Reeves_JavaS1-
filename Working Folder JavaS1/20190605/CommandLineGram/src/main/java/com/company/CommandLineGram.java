package com.company;

import java.util.Scanner;

public class CommandLineGram {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = myScanner.nextLine();
        System.out.println("What is your last name?");
        String lastName = myScanner.nextLine();
        System.out.println("What is your email address?");
        String email = myScanner.nextLine();
        System.out.println("What is your twitter handle?");
        String twitter = myScanner.nextLine();
        System.out.println("What is your age?");
        String age = myScanner.nextLine();
        System.out.println("What country are you from?");
        String country = myScanner.nextLine();
        System.out.println("What is your profession?");
        String profession = myScanner.nextLine();
        System.out.println("What is your favorite operating system?");
        String favOS = myScanner.nextLine();
        System.out.println("What is your favorite programming language?");
        String favLang = myScanner.nextLine();
        System.out.println("Who is your favorite computer scientist?");
        String favCS = myScanner.nextLine();
        System.out.println("What is your favorite keyboard shortcut?");
        String favKeySh = myScanner.nextLine();
        System.out.println("Have you ever built your own computer?");
        String builtOwnPC = myScanner.nextLine();
        System.out.println("If you could be any superhero, who would it be?");
        String superhero = myScanner.nextLine();

        //Display to user
        System.out.println("Here is your information: ");
        System.out.println("==================================");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Twitter: " + twitter);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
        System.out.println("Profession: " + profession);
        System.out.println("Favorite operating system: " + favOS);
        System.out.println("Favorite programming language: " + favLang);
        System.out.println("Favorite computer scientist: " + favCS);
        System.out.println("Favorite keyboard shortcut: " + favKeySh);
        System.out.println("Built your own computer before: " + builtOwnPC);
        System.out.println("If you could be any superhero, who would it be?: " + superhero);
        System.out.println("==================================");


//        System.out.println("Hello, " + name);
//
//        System.out.println("Please enter a number.");
//        int num1 = Integer.parseInt(myScanner.nextLine());
//
//        System.out.println("Please enter another number.");
//        int num2 = Integer.parseInt(myScanner.nextLine());
//
//        int sum = num1 + num2;
//        System.out.println("The sum of your numbers is " + sum);

    }
}
