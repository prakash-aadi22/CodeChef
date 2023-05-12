import java.util.*;

public class Kitchen_Timetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int size = sc.nextInt();
            int[] x = new int[size];
            int[] y = new int[size];
            for (int i = 0; i < x.length; i++) {
                x[i] = sc.nextInt();
            }
            for (int i = 0; i < y.length; i++) {
                y[i] = sc.nextInt();
            }
            int count = 0;
            int[] A = new int[size];
            A[0] = x[0];
            for (int j = 1; j < A.length; j++) {
                A[j] = x[j] - x[j - 1];
            }
            for (int j = 0; j < size; j++) {
                if (A[j] >= y[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
