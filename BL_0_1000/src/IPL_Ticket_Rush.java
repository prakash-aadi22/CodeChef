import java.util.Scanner;

public class IPL_Ticket_Rush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x > y) {
                System.out.println(x - y);
            } else {
                System.out.println(0);
            }
        }
    }
}
