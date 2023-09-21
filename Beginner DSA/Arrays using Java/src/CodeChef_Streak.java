import java.util.Scanner;

public class CodeChef_Streak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] O = new int[n];
            int[] A = new int[n];
            int countA = 0;
            int maxA = 0;
            int maxB = 0;
            for (int i = 0; i < n; i++) {
                O[i] = s.nextInt();
                if (O[i] != 0) {
                    countA++;
                } else {
                    maxA = Math.max(maxA, countA);
                    countA = 0;
                }
                maxA = Math.max(maxA, countA);
            }

            countA = 0;
            for (int j = 0; j < n; j++) {
                A[j] = s.nextInt();
                if (A[j] != 0) {
                    countA++;
                } else {
                    maxB = Math.max(maxB, countA);
                    countA = 0;
                }
                maxB = Math.max(maxB, countA);
            }

            if (maxA > maxB) {
                System.out.println("Om");
            } else if (maxA < maxB) {
                System.out.println("Addy");
            } else {
                System.out.println("Draw");
            }
        }
    }
}
