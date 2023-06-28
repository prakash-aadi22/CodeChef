import java.util.Scanner;

public class The_Cheaper_Cab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println((x < y) ? "FIRST" : (x > y) ? "SECOND" : "ANY");
        }
    }
}
