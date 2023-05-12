import java.util.Scanner;

public class Keplers_Law {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();
            System.out.println(((Math.pow(t1, 2) / Math.pow(r1, 3)) == (Math.pow(t2, 2) / Math.pow(r2, 3))) ? "Yes" : "No");
        }
    }
}
