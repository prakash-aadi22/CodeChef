import java.util.Arrays;
import java.util.Scanner;

public class Largest_and_Second_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            for (int i = a.length - 1; i >= 0; ) {
                if (a[i] != a[i - 1]) {
                    System.out.println(a[i] + a[i - 1]);
                    break;
                } else {
                    i--;
                }
            }
        }
    }
}
