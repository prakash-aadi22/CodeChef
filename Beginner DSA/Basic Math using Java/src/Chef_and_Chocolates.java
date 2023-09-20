import java.util.Scanner;

public class Chef_and_Chocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            System.out.println(((5 * x) + (10 * y)) / z);
        }
    }
}
