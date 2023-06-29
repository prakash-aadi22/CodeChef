import java.util.Scanner;

public class Chef_and_Interactive_Contests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        while (n-- > 0) {
            int x = sc.nextInt();
            System.out.println((x >= r) ? "Good boi" : "Bad boi");
        }
    }
}
