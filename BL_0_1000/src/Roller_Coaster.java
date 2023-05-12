import java.util.Scanner;

public class Roller_Coaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int h = sc.nextInt();
            System.out.println((x >= h) ? "YES" : "NO");
        }
    }
}
