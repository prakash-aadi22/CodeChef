import java.util.Scanner;

public class Chef_and_Stock_Prices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int s = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            float newStockPrice = s + (s * ((float) c / 100));
            System.out.println((a <= newStockPrice && newStockPrice <= b) ? "Yes" : "No");
        }
    }
}
