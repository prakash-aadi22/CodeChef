import java.util.Scanner;

public class Chef_gives_Party {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(((n * x) <= k) ? "YES" : "NO");
        }
    }
}
