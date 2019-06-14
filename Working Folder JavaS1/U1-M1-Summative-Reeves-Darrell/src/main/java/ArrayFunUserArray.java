import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String[] args) {
        int[] input = new int[5];
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter 5 numbers.\n" +
                "First number: ");
        input[0] = myScanner.nextInt();
        System.out.println("Second number: ");
        input[1] = myScanner.nextInt();
        System.out.println("Third number: ");
        input[2] = myScanner.nextInt();
        System.out.println("Forth number: ");
        input[3] = myScanner.nextInt();
        System.out.println("Fifth number: ");
        input[4] = myScanner.nextInt();

        System.out.println(input[0]+" "+input[1]+" "+input[2]+" "+input[3]+" "+input[4]);
    }


    // combining both statements in one


}

//Each of the items in this exercise must be contianed in a separate Java file with a main method as specified below.
//
//
//This solution must be contained in a Java file called ArrayFunUserArray.
//Your code must read 5 ints from the user, put them in an array, and print the array elements to the screen.
//This solution must be contained in a Java file called ArrayFunReverseIt.
//Your code must declare the following array [1, 2, 3, 4, 5], create another array of equal length, and fill that array with values from the original array but in reverse order. Finally, your code must print the contents of both arrays to the screen.
//This solution must be contained in a Java file called ArrayFun5Words.
//Your code must get 5 words from the user, put them in an array, and print the array elements to the screen.