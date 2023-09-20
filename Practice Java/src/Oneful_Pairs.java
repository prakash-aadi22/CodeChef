import java.util.Scanner;

public class Oneful_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = a + b + (a * b);
        System.out.println((ans == 111) ? "YES" : "NO");
    }
}
