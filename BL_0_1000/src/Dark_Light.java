import java.util.Scanner;

public class Dark_Light {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println((k == 0) ? (n % 4 == 0) ? "Off" : "On" : (n % 4 == 0) ? "On" : "Ambiguous");
        }
    }
}
