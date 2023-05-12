import java.util.Scanner;

public class Motivation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int maxR = 0;
            for (int j = 0; j < n; j++) {
                int s = sc.nextInt();
                int r = sc.nextInt();
                if (x >= s) {
                    if (r > maxR) {
                        maxR = r;
                    }
                }
            }
            System.out.println(maxR);
        }
    }
}
