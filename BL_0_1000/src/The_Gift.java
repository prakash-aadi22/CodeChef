import java.util.Scanner;

public class The_Gift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(((x + m) >= n) ? "YES" : "NO");
    }
}
