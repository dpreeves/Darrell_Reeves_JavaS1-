public class ArrayFunReverseIt {
    public static void main(String[] args) {
        int[] first = new int[]{1,2,3,4,5};
        int n = first.length;
        int[] second = new int[n];
        int x = n;
        for (int i = 0; i < n; i++) {
            second[x-1] = first[i];
            x = x-1;
        }
        System.out.println("Input array: "+first[0]+" "+first[1]+" "+first[2]+" "+first[3]+" "+first[4]);
        System.out.println("Reversed array: "+second[0]+" "+second[1]+" "+second[2]+" "+second[3]+" "+second[4]);
    }
}

