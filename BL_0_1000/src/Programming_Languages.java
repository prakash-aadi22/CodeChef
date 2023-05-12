import java.util.Scanner;

public class Programming_Languages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int a1 = sc.nextInt();
            int b1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b2 = sc.nextInt();
            System.out.println(((a == a1 && b == b1) || (b == a1 && a == b1)) ? 1 : ((a == a2 && b == b2) || (b == a2 && a == b2)) ? 2 : 0);
        }
    }
}
