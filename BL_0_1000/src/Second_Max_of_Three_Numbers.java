import java.util.Arrays;
import java.util.Scanner;

public class Second_Max_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] a = new int[3];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            System.out.println(a[1]);
//            int A = sc.nextInt();
//            int B = sc.nextInt();
//            int C = sc.nextInt();
//            if (A >= B && A < C || A >= C && A < B) {
//                System.out.println(A);
//            }
//            if (B >= C && B < A || B >= A && B < C) {
//                System.out.println(B);
//            }
//            if (C >= B && C < A || C >= A && C < B) {
//                System.out.println(C);
//            }
        }
    }
}
