import java.util.Scanner;

public class Snapchat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] snaps1 = new int[n];
            for (int i = 0; i < snaps1.length; i++) {
                snaps1[i] = sc.nextInt();
            }
            int[] snaps2 = new int[n];
            for (int i = 0; i < snaps2.length; i++) {
                snaps2[i] = sc.nextInt();
            }
            int streak = 0, maxStreak = 0;
            for (int i = 0; i < n; i++) {
                if (snaps1[i] != 0 & snaps2[i] != 0) {
                    streak++;
                    maxStreak = Math.max(streak, maxStreak);
                } else {
                    streak = 0;
                }
            }
            System.out.println(maxStreak);
        }
    }
}
