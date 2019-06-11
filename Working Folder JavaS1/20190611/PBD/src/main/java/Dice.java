import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        dice();
    }
    public static void dice(){
        Random randomGenerator = new Random();
        int dice1 = randomGenerator.nextInt(6) + 1;
        int dice2 = randomGenerator.nextInt(6) + 1;
        int total = dice1 + dice2;
        System.out.println("HERE COMES THE DICE!\n\n" +
                "Roll #1: " + dice1);
        System.out.println("Roll #2: " + dice2);
        System.out.println("The total is " + total +"!");
    }
}
