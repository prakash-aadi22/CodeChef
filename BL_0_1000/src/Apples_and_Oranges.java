import java.util.Scanner;

public class Apples_and_Oranges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a + b) <= x ? "YES" : "NO");
    }
}
