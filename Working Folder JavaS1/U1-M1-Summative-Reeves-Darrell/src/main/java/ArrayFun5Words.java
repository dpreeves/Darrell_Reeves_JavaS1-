import java.util.Scanner;

public class ArrayFun5Words {
    public static void main(String[] args) {
        String[] input = new String[5];
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter 5 strings.\n" +
                "First string: ");
        input[0] = myScanner.nextLine();
        System.out.println("Second string: ");
        input[1] = myScanner.nextLine();
        System.out.println("Third string: ");
        input[2] = myScanner.nextLine();
        System.out.println("Forth string: ");
        input[3] = myScanner.nextLine();
        System.out.println("Fifth string: ");
        input[4] = myScanner.nextLine();

        System.out.println(input[0]+" "+input[1]+" "+input[2]+" "+input[3]+" "+input[4]);
    }
}


