import java.util.Scanner;

public class Squats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            System.out.println(x * 15);
        }
    }
}
