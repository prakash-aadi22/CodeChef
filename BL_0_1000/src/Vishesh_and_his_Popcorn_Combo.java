import java.util.Scanner;

public class Vishesh_and_his_Popcorn_Combo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
//            int a1 = sc.nextInt();
//            int a2 = sc.nextInt();
//            int b1 = sc.nextInt();
//            int b2 = sc.nextInt();
//            int c1 = sc.nextInt();
//            int c2 = sc.nextInt();
//            System.out.println(Math.max(a1 + a2, Math.max(b1 + b2, c1 + c2)));
            int x = sc.nextInt() + sc.nextInt();
            int y = sc.nextInt() + sc.nextInt();
            int z = sc.nextInt() + sc.nextInt();
            System.out.println(Math.max(Math.max(x, y), z));
        }
    }
}
