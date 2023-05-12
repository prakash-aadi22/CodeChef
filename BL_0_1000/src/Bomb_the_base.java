import java.util.Scanner;

public class Bomb_the_base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int ans = 0;
            int[] defence = new int[n];
            for (int i = 0; i < defence.length; i++) {
                defence[i] = sc.nextInt();
//                if (defence[i] < x) {
//                    ans = i + 1;
//                }
                if (defence[i] <= x) {
                    ans = i;
                }
            }
            System.out.println(ans);
        }
    }
}
