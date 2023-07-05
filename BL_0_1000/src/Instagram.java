import java.util.Scanner;

public class Instagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int xFollowing = sc.nextInt();
            int yFollower = sc.nextInt();
            System.out.println((xFollowing > (yFollower * 10)) ? "Yes" : "No");
        }
    }
}
