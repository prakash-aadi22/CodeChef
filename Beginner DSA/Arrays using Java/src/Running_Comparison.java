import java.util.Scanner;

public class Running_Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int total_happiness = 0;
            int[] a = new int[n];
            int[] b = new int[n];
            for (int j = 0; j < a.length; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < b.length; j++) {
                b[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                if (a[j] <= (2 * b[j]) && b[j] <= (2 * a[j])) {
                    total_happiness += 1;
                }
            }
            System.out.println(total_happiness);
        }
    }
}
