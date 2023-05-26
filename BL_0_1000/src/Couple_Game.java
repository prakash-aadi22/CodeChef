import java.util.Scanner;

public class Couple_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int g = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(b - g);
        }
    }
}
