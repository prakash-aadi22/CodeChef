import java.util.Scanner;

public class Candy_Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
//            System.out.println((y > x) ? (x + (2 * (y - x))) : (y));
            System.out.println((x >= y) ? (y) : (2 * y - x));
        }
    }
}
