import java.util.Scanner;

public class Fit_Squares_in_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int b = sc.nextInt();
            // method 1
            System.out.println((((b / 2) * (b / 2)) - (b / 2)) / 2);
            // method 2
            if (b < 4) {
                System.out.println(0);
            } else {
                int x = ((b / 2) - 1);
                System.out.println((x * (x + 1)) / 2);
            }
        }
    }
}
