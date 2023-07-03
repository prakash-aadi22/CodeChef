import java.util.Arrays;
import java.util.Scanner;

public class Janmansh_at_Fruit_Market {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int[] fruit = {a, b, c};
            Arrays.sort(fruit);
            System.out.println((fruit[0] * (x - 1)) + fruit[1]);
        }
    }
}
