import java.util.Scanner;

public class Read_Pages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println((x * y) >= n ? "YES" : "NO");
        }
    }
}
