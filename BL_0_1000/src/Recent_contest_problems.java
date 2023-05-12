import java.util.Scanner;

public class Recent_contest_problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int countS = 0, countL = 0;
            int n = sc.nextInt();
//            String[] s = new String[n];
//            for (int j = 0; j < s.length; j++) {
//                s[j] = sc.next();
//                if (s[j].equals("START38")) {
//                    countS++;
//                } else if (s[j].equals("LTIME108")) {
//                    countL++;
//                }
//            }
            for (int j = 0; j < n; j++) {
                String s = sc.next();
                if (s.equals("START38")) {
                    countS++;
                } else if (s.equals("LTIME108")) {
                    countL++;
                }
            }
            System.out.println(countS + " " + countL);
        }
    }
}
