import java.util.Scanner;

public class Good_Turn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            if (sum > 6) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
