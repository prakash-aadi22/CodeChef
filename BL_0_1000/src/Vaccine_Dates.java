import java.util.Scanner;

public class Vaccine_Dates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int d = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println((l > d) ? "Too Early" : (d > r) ? "Too Late" : "Take second dose now");
        }
    }
}
