import java.util.Scanner;

public class ALittleQuiz {
    public static void main(String[] args) {
quiz();
    }
    public static void quiz(){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Are you ready for a quiz?");
        String resopnse = myScanner.nextLine();
        System.out.println("Okay, here it comes!\n\n" +
                "Q1) What is the capital of Alaska?\n" +
                "\t1) Melbourne\n" +
                "\t2) Anchorage\n" +
                "\t3) Juneau");
        int correct = 0;
        int ans1 = myScanner.nextInt();

        if (ans1 == 3){
            System.out.println("That's right!\n");
            correct = correct +1;
        } else {
            System.out.println("Sorry, Juneau is the capital of Alaska.\n");
        }
        System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?\n" +
                "\t1) yes\n" +
                "\t2) no");
        int ans2 = myScanner.nextInt();

        if (ans2 == 2){
            System.out.println("That's right!\n");
            correct = correct +1;
        } else{
            System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.\n");
        }
        System.out.println("Q3) What is the result of 9+6/3?\n" +
                "\t1) 5\n" +
                "\t2) 11\n" +
                "\t3) 15/3");
        int ans3 = myScanner.nextInt();

        if (ans3 == 2){
            System.out.println("That's correct!");
            correct = correct +1;
            System.out.println("\n\nOverall, you got " + correct + " out of 3 correct.\n" +
                    "Thanks for playing!");
        } else {
            System.out.println("\n\nOverall, you got " + correct + " out of 3 correct.\n" +
                    "Thanks for playing!");
        }

    }
}

