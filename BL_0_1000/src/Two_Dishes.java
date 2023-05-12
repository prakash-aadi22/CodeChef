import java.util.Scanner;

public class Two_Dishes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if ((b >= n) && (a + c >= n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
