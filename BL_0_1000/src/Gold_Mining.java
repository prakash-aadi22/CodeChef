import java.util.Scanner;

public class Gold_Mining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println((((n + 1) * y) >= x) ? "Yes" : "No");
        }
    }
}
