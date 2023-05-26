import java.util.Scanner;

public class Overspeeding_Fine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            System.out.println((x <= 70) ? 0 : (x <= 100) ? 500 : 2000);
        }
    }
}
