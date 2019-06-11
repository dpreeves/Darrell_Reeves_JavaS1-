import java.util.Random;


public class FortuneCookie {
    public static void main(String[] args) {
        fortuneCookie();
    }

    public static void fortuneCookie() {
        String fortune1 = "The fortune you seek is in another cookie.";
        String fortune2 = "A closed mouth gathers no feet.";
        String fortune3 = "A conclusion is simply the place where you got tired of thinking.";
        String fortune4 = "A cynic is only a frustrated optimist.";
        String fortune5 = "A foolish man listens to his heart. ...";
        String fortune6 = "You will die alone and poorly dressed.";

        Random randomGenerator = new Random();
        int lot1 = randomGenerator.nextInt(54) + 1;
        int lot2 = randomGenerator.nextInt(54) + 1;
        int lot3 = randomGenerator.nextInt(54) + 1;
        int lot4 = randomGenerator.nextInt(54) + 1;
        int lot5 = randomGenerator.nextInt(54) + 1;
        int lot6 = randomGenerator.nextInt(54) + 1;

        int forGen = randomGenerator.nextInt(6) + 1;

        if (forGen == 1) {
            System.out.println("Fortune cookie say: \"" + fortune1 + "\"\n");
            System.out.println(lot1 + " - " + lot2 + " - " + lot3 + " - " + lot4 + " - " + lot5 + " - " + lot6);
        }

        if (forGen == 2) {
            System.out.println("Fortune cookie say: \"" + fortune2 + "\"\n");
            System.out.println(lot1 + " - " + lot2 + " - " + lot3 + " - " + lot4 + " - " + lot5 + " - " + lot6);
        }

        if (forGen == 3) {
            System.out.println("Fortune cookie say: \"" + fortune3 + "\"\n");
            System.out.println(lot1 + " - " + lot2 + " - " + lot3 + " - " + lot4 + " - " + lot5 + " - " + lot6);
        }

        if (forGen == 4) {
            System.out.println("Fortune cookie say: \"" + fortune4 + "\"\n");
            System.out.println(lot1 + " - " + lot2 + " - " + lot3 + " - " + lot4 + " - " + lot5 + " - " + lot6);
        }
        if (forGen == 5) {
            System.out.println("Fortune cookie say: \"" + fortune5 + "\"\n");
            System.out.println(lot1 + " - " + lot2 + " - " + lot3 + " - " + lot4 + " - " + lot5 + " - " + lot6);
        }
        if (forGen == 6) {
            System.out.println("Fortune cookie say: \"" + fortune6 + "\"\n");
            System.out.println(lot1 + " - " + lot2 + " - " + lot3 + " - " + lot4 + " - " + lot5 + " - " + lot6);
        }


    }
}