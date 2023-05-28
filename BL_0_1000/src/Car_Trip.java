import java.util.Scanner;

public class Car_Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            System.out.println((x > 300) ? (x * 10) : 3000);
        }
    }
}
