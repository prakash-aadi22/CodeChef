import java.util.Scanner;

public class Air_Hockey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(7 - Math.max(a, b));
        }
    }
}
