import java.util.Scanner;

public class Practice_makes_us_perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] week = new int[4];
        int count = 0;
        for (int i = 0; i < week.length; i++) {
            week[i] = sc.nextInt();
            if (week[i] >= 10) {
                count++;
            }
        }
        System.out.println(count);
    }
}
