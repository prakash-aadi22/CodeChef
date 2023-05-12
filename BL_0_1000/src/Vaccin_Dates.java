import java.util.Scanner;

public class Vaccin_Dates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int d = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            if (l <= d && d <= r) {
                System.out.println("Take second dose now");
            } else if (d > r) {
                System.out.println("Too Late");
            } else if (l > d) {
                System.out.println("Too Early");
            }
        }
    }
}
