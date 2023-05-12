import java.util.Scanner;

public class Turn_It {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int a = sc.nextInt();
            int s = sc.nextInt();
            System.out.println((Math.pow(v, 2) >= (Math.pow(u, 2) - (2 * a * s))) ? "Yes" : "No");
        }
    }
}
