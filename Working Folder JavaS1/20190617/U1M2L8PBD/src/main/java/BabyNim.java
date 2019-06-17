import java.util.Scanner;

public class BabyNim {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = 3;
        int amount;
        String choicePile;

        Scanner myScanner = new Scanner(System.in);

        do {
            System.out.println("A: " + a + "  "+ "B: "+ b +"  " + "C: "+ c);
            System.out.print("Choose a pile: ");

            choicePile = myScanner.nextLine();
            System.out.println("How many to remove from pile "+ choicePile);
            amount = Integer.parseInt(myScanner.nextLine());
            if (choicePile.equals("a") || choicePile.equals("A"))
                a = a-amount;
            if (choicePile.equals("b") || choicePile.equals("B"))
                b = b-amount;
            if (choicePile.equals("c") || choicePile.equals("C"))
                c = c-amount;
            // statements
        } while (a > 0 || b > 0 || c > 0);
        System.out.println("A: " + a + "  "+ "B: "+ b +"  " + "C: "+ c);
        System.out.println("All piles are empty. Good job!");

    }
}
