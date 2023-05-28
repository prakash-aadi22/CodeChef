import java.util.Scanner;

public class Ticket_Fine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            System.out.println((p - q) * x);
        }
    }
}
