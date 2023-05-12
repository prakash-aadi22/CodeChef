import java.util.Scanner;

public class Tom_And_Jerry_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int k = sc.nextInt();
            int shortest = Math.abs(a - c) + Math.abs(b - d);
//            if (k >= shortest) {
//                if ((k - shortest) % 2 == 0) {
//                    System.out.println("YES");
//                } else {
//                    System.out.println("NO");
//                }
//            } else {
//                System.out.println("NO");
//            }
            System.out.println((k >= shortest) ? ((k - shortest) % 2 == 0) ? "YES" : "NO" : "No");
        }
    }
}
