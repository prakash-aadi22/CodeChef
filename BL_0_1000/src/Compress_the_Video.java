import java.util.Scanner;

public class Compress_the_Video {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            int c = n;
            for (int j = 0; j < n - 1; j++) {
                if (a[j] == a[j + 1]) {
                    c--;
                }
            }
            System.out.println(c);
        }
    }
}
