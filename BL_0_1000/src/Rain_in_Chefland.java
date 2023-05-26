import java.util.Scanner;

public class Rain_in_Chefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            System.out.println((x < 3) ? "LIGHT" : (x < 7) ? "MODERATE" : "HEAVY");
        }
    }
}
