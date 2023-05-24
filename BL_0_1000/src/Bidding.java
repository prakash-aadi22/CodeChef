import java.util.Scanner;

public class Bidding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = Math.max(a, Math.max(b, c));
            System.out.println((x == a) ? "Alice" : (x == b) ? "Bob" : "Charlie");
        }
    }
}
