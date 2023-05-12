import java.util.Scanner;

public class N_Buttons_1_Bulb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String r = sc.next();
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != r.charAt(i)) {
                    count++;
                }
            }
            System.out.println((count % 2 == 0) ? 1 : 0);
        }
    }
}
