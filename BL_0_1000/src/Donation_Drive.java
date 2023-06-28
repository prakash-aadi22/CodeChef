import java.util.Scanner;

public class Donation_Drive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            System.out.println((n >= x) ? (n - x) : 0);
        }
    }
}
