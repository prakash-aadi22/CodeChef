import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int D = sc.nextInt();
            int d = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int totalDis = D * d;
            System.out.println((totalDis >= 42) ? C : (totalDis >= 21) ? B : (totalDis >= 10) ? A : 0);
        }
    }
}
