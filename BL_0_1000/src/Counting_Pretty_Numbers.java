import java.util.Scanner;

public class Counting_Pretty_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int count = 0;
            for (int j = start; j <= end; j++) {
                if ((j % 10 == 2) || (j % 10 == 3) || (j % 10 == 9)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
