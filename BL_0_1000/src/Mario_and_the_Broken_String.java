import java.util.Scanner;

public class Mario_and_the_Broken_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i = 0; i < testCase; i++) {
            int len = sc.nextInt();
            if (len > 0) {
                String s = sc.next();
                String l = s.substring(0, (s.length() / 2));
                String r = s.substring(((s.length() / 2)));
                String ans = r + l;
                if (ans.equals(s)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}
