import java.util.Random;

public class ShorterDoubleDice {
    public static void main(String[] args) {
        Random rand = new Random();

        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        int total = dice1 + dice2;






        System.out.println("HERE COMES THE DICE!\n\n" +
                "Roll #1: " + dice1);
        System.out.println("Roll #2: " + dice2);
        System.out.println("The total is " + total +"!\n");
        do {
            dice1 = rand.nextInt(6) + 1;
            dice2 = rand.nextInt(6) + 1;
            int sum = dice1 + dice2;
            System.out.println("Roll #1: " + dice1);
            System.out.println("Roll #2: " + dice2);
            System.out.println("The total is " + sum +"!\n");
        } while (dice1 != dice2);
    }
}
