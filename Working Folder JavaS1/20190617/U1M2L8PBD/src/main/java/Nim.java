import java.util.Scanner;

public class Nim {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = 3;
        int amount;
        String choicePile;
        int game = 0;


        Scanner myScanner = new Scanner(System.in);
        System.out.println("Player 1, enter your name: ");
        String player1 = myScanner.nextLine();
        System.out.println("Player 2, enter your name: ");
        String player2 = myScanner.nextLine();
        String currentPlayer = player1;


        do {
            if (game % 2 == 0)
                currentPlayer = player1;
            else currentPlayer = player2;

            System.out.println("A: " + a + "  " + "B: " + b + "  " + "C: " + c);
            System.out.print(currentPlayer + ", choose a pile: ");

            choicePile = myScanner.nextLine();
            System.out.println("How many to remove from pile " + choicePile);
            amount = Integer.parseInt(myScanner.nextLine());
            if (choicePile.equals("a") || choicePile.equals("A"))
                a = a - amount;
            if (choicePile.equals("b") || choicePile.equals("B"))
                b = b - amount;
            if (choicePile.equals("c") || choicePile.equals("C"))
                c = c - amount;
            game = game + 1;


            // statements
        } while ((a > 0 || b > 0 || c > 0));//currentPlayer == player1);
//        do {
//
//
//            System.out.println("A: " + a + "  " + "B: " + b + "  " + "C: " + c);
//            System.out.print(player2 + ", choose a pile: ");
//
//            choicePile = myScanner.nextLine();
//            System.out.println("How many to remove from pile " + choicePile);
//            amount = Integer.parseInt(myScanner.nextLine());
//            if (choicePile.equals("a") || choicePile.equals("A"))
//                a = a - amount;
//            if (choicePile.equals("b") || choicePile.equals("B"))
//                b = b - amount;
//            if (choicePile.equals("c") || choicePile.equals("C"))
//                c = c - amount;
//            game = game + 1;
//            currentPlayer = player1;
//            // statements
//        } while ((a > 0 || b > 0 || c > 0) && game % 2 == 1);//currentPlayer == player2);
        System.out.println("A: " + a + "  " + "B: " + b + "  " + "C: " + c);
        System.out.println("All piles are empty. Good job!");
        System.out.println(currentPlayer + ", there are no counters left, so you win.");

    }
}
