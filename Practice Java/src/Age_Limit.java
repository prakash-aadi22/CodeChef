import java.util.Scanner;

public class Age_Limit {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            if (a >= x && a < y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
