import java.util.Scanner;

public class Sums_in_a_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int rows = sc.nextInt();
            int[][] triangle = new int[rows][rows];
            for (int j = 0; j < rows; j++)
                for (int k = 0; k <= j; k++)
                    triangle[j][k] = sc.nextInt();
            for (int j = rows - 2; j >= 0; j--) {
                for (int k = 0; k <= j; k++) {
                    triangle[j][k] += Math.max(triangle[j + 1][k], triangle[j + 1][k + 1]);
                }
            }
            System.out.println(triangle[0][0]);
        }
    }
}
