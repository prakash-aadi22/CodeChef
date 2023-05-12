import java.util.Scanner;

public class Richie_Rich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            System.out.println((b - a) / x);
        }
    }
}
