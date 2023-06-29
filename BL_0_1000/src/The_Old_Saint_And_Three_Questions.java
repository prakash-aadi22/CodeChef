import java.util.Scanner;

public class The_Old_Saint_And_Three_Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] a = new int[3];
            int countA0 = 0, countA1 = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 0) {
                    countA0++;
                } else if (a[i] == 1) {
                    countA1++;
                }
            }
            int[] b = new int[3];
            int countB0 = 0, countB1 = 0;
            for (int i = 0; i < b.length; i++) {
                b[i] = sc.nextInt();
                if (b[i] == 0) {
                    countB0++;
                } else if (b[i] == 1) {
                    countB1++;
                }
            }
            if (countA0 == countB0 || countA1 == countB1) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }
    }
}
