import java.util.Scanner;

public class Chef_and_Spells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(Math.max((a + b), Math.max((a + c), (b + c))));
        }
    }
}
