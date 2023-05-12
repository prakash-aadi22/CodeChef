import java.util.Scanner;

public class Maximum_Length_Even_Suarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int sum = (n * (n + 1)) / 2;
            if (sum % 2 == 0) {
                System.out.println(n);
            } else {
                System.out.println(n - 1);
            }
        }
    }
}
