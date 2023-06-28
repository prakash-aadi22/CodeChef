import java.util.Scanner;

public class Spice_Level {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            System.out.println((x < 4) ? "MILD" : (4 <= x && x < 7) ? "MEDIUM" : "HOT");
        }
    }
}
