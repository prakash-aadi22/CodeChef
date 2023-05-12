import java.util.Arrays;
import java.util.Scanner;

public class Maximize_the_Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println((k >= (n - 1)) ? arr[n - 1] : arr[k]);
        }
    }
}
