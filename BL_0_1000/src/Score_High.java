import java.util.Scanner;

public class Score_High {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            System.out.println(Math.max(a, Math.max(b, Math.max(c, d))));
        }
    }
}
