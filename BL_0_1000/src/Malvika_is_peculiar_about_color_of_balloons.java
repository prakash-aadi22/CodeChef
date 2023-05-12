import java.util.Scanner;

public class Malvika_is_peculiar_about_color_of_balloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String ballon = sc.next();
            int countA = 0, countB = 0;
            for (int i = 0; i < ballon.length(); i++) {
                if (ballon.charAt(i) == 'a') {
                    countA++;
                } else if (ballon.charAt(i) == 'b') {
                    countB++;
                }
            }
            System.out.println(Math.min(countA, countB));
        }
    }
}
