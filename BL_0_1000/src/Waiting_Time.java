import java.util.Scanner;

public class Waiting_Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int k = sc.nextInt();
            int x = sc.nextInt();
            System.out.println((k * 7) - x);
        }
    }
}
