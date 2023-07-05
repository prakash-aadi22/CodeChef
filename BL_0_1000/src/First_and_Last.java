import java.util.Scanner;

public class First_and_Last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            int max = a[0] + a[a.length - 1];
            for (int i = 0; i < a.length - 1; i++) {
                max = Math.max(max, (a[i] + a[i + 1]));
            }
            System.out.println(max);
        }
    }
}
