import java.util.Scanner;

public class Enough_Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println((n >= (x + (y * 2))) ? "YES" : "NO");
        }
    }
}
