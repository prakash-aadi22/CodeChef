import java.util.Scanner;

public class Audible_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            System.out.println((67 <= x && x <= 45000) ? "YES" : "NO");
        }
    }
}
