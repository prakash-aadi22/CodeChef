import java.util.Scanner;

public class Multivitamin_Tablets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println((y >= (x * 3)) ? "YES" : "NO");
        }
    }
}
