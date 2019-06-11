import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {

        makeWeight();
    }

        public static void makeWeight(){
            Scanner myScanner = new Scanner(System.in);

            System.out.println("Please enter your current weight");
            int currentWeight = myScanner.nextInt();

            System.out.println("Which plannet are you visiting?");
            System.out.println("1 for Venus");
            System.out.println("2 for Mars");
            System.out.println("3 for Jupiter");
            System.out.println("4 for Saturn");
            System.out.println("5 for Uranus");
            System.out.println("6 for Neptune");

            int userChoice = myScanner.nextInt();
            double newWeight;

            switch (userChoice){
                case 1:
                    newWeight = currentWeight*.78;
                    System.out.println("Your weight would be "+newWeight+" on that planet");
                    break;
                case 2:
                    newWeight = currentWeight*.39;
                    System.out.println("Your weight would be "+newWeight+" on that planet");
                    break;
                case 3:
                    newWeight = currentWeight*2.65;
                    System.out.println("Your weight would be "+newWeight+" on that planet");
                    break;
                case 4:
                    newWeight = currentWeight*1.17;
                    System.out.println("Your weight would be "+newWeight+" on that planet");
                    break;
                case 5:
                    newWeight = currentWeight*1.05;
                    System.out.println("Your weight would be "+newWeight+" on that planet");
                    break;
                case 6:
                    newWeight = currentWeight*1.23;
                    System.out.println("Your weight would be "+newWeight+" on that planet");
                    break;
                default:
                    System.out.println("You have entered an invalid choice");

            }
        }
}
//
//1	Venus	0.78
//        2	Mars	0.39
//        3	Jupiter	2.65
//        4	Saturn	1.17
//        5	Uranus	1.05
//        6	Neptune	1.23