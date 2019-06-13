import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {
    public static void main(String[] args) {
        Random rand = new Random();
        int card = rand.nextInt(3 + 1);
        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n" +
                        "He glances at you out of the corner of his eye and starts shuffling.\n" +
                        "He lays down three cards.\n\n" +

                "Which one is the ace?\n\n"+

                        "##  ##  ##\n" +
                "##  ##  ##\n" +
                "1   2   3");

                Scanner myScanner = new Scanner(System.in);


        int userChoice = myScanner.nextInt();

        if (userChoice==card){
            System.out.println("You win!!!");
        } else {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + card);
        }

//        System.out.println(userChoice);
    }

}
