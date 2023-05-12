import java.util.Scanner;

public class The_Two_Dishes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            System.out.println(n - Math.abs(s - n));
        }
    }
}
