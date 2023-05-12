import java.util.Scanner;

public class Play_Piano {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for (int i = 0; i < t; i++) {
            String s = read.next();
            String ans = "yes";
            for (int j = 0; j < s.length(); j += 2) {
                if (s.charAt(j) == s.charAt(j + 1)) {
                    ans = "no";
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
