import java.util.Scanner;

public class Naive_Chef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] faces = new int[n];
            for (int i = 0; i < faces.length; i++) {
                faces[i] = sc.nextInt();
            }
            double sum = 0, count = 0;
            for (int i : faces) {
                if (i == a) {
                    sum++;
                }
                if (i == b) {
                    count++;
                }
            }
            System.out.println((sum / n) * (count / n));
        }
    }
}
