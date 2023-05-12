import java.util.Scanner;

public class Weight_Balance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int w1 = sc.nextInt();
            int w2 = sc.nextInt();
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int m = sc.nextInt();
            int incWght = w2 - w1;
            int minInc = x1 * m;
            int maxInc = x2 * m;
//            if (minInc <= incWght && incWght <= maxInc) {
//                System.out.println(1);
//            } else {
//                System.out.println(0);
//            }
            System.out.println((minInc <= incWght && incWght <= maxInc) ? 1 : 0);
        }
    }
}
