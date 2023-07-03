import java.util.Scanner;

public class Tekken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println((a - Math.abs(b - c)) > 0 ? "Yes" : "No");
        }
    }
}
