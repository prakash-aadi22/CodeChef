import java.util.Scanner;

public class Divisible_by_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println((a % 3 == 0 || b % 3 == 0) ? 0 : (a % 3 == b % 3) ? 1 : 2);
        }
    }
}
