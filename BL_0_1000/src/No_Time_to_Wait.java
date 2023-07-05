import java.util.Arrays;
import java.util.Scanner;

public class No_Time_to_Wait {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
        Arrays.sort(t);
        System.out.println(((x + t[t.length - 1]) >= h) ? "Yes" : "No");
    }
}
