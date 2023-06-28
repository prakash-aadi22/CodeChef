import java.util.Scanner;

public class Chef_and_Wire_Frames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int x = sc.nextInt();
            System.out.println((2 * (m + n)) * x);
        }
    }
}
