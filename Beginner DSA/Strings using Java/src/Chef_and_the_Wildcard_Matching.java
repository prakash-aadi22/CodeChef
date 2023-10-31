import java.util.Scanner;

public class Chef_and_the_Wildcard_Matching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String x = sc.next();
            String y = sc.next();

            int count = 0;
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) == y.charAt(i)) {
                    count++;
                } else if (x.charAt(i) == '?' || y.charAt(i) == '?') {
                    count++;
                }
            }
            System.out.println((count == x.length()) ? "Yes" : "No");
        }
    }
}
