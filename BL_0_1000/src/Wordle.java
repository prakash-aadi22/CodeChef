import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            String s = sc.next();
            String t = sc.next();
            StringBuilder m = new StringBuilder();
            for (int j = 0; j < 5; j++) {
                if (s.charAt(j) == t.charAt(j)) {
                    m.append('g');
                } else {
                    m.append('b');
                }
            }
            System.out.println(m);
        }
    }
}
