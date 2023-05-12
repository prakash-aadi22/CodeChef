import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WA_Test_Cases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] s = new int[n];
            for (int i = 0; i < s.length; i++) {
                s[i] = sc.nextInt();
            }
            String v = sc.next();
            // Method 1
//            ArrayList<Integer> al = new ArrayList<>();
//            for (int i = 0; i < n; i++) {
//                if (v.charAt(i) == '0') {
//                    al.add(s[i]);
//                }
//            }
//            Collections.sort(al);
//            System.out.println(al.get(0));
            // Method 2
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (v.charAt(i) == '0') {
                    min = Math.min(min, s[i]);
                }
            }
            System.out.println(min);
        }
    }
}
