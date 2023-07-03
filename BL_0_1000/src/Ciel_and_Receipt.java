import java.util.Scanner;

public class Ciel_and_Receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int p = sc.nextInt();
            int count = 0;
            for (int j = 11; j >= 0; j--) {
                int x = (int) Math.pow(2, j);
                while (x <= p) {
                    count++;
                    p -= x;
                }
            }
            System.out.println(count);
        }
    }
}
