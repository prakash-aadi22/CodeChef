import java.util.Scanner;

public class Tom_and_Jerry_Chase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int jx = sc.nextInt();
            int ty = sc.nextInt();
            System.out.println(ty > jx ? "YES" : "NO");
        }
    }
}
