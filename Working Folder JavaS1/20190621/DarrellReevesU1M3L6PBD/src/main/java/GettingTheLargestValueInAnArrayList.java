import java.util.ArrayList;
import java.util.Random;

public class GettingTheLargestValueInAnArrayList {
    public static void main(String[] args) {
        Random ranInt = new Random();
        ArrayList<Integer> arr = new ArrayList<>(10);

        for (int i = 0; i < 10; i++){
            arr.add(ranInt.nextInt(100) + 1);
        }

        System.out.println("ArrayList: " + arr);

        int max = arr.get(0);

        for (int i =0; i < 10; i++){
            if(arr.get(i) > max){
                max = arr.get(i);
            }
        }

        System.out.println("The largest value is " + max);

    }
}
