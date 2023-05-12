import java.util.Scanner;

public class Distinct_Pair_Sums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(2 * (r - l) + 1);
        }
    }
}
