import java.util.Scanner;

public class Lucky_Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int count = 0;
//            String s = Integer.toString(x);
//            for (int i = 0; i < s.length(); i++) {
//                if (s.charAt(i) == '4') {
//                    count++;
//                }
//            }
//            System.out.println(count);
            while (x > 0) {
                int rem = x % 10;
                if (rem == 4) {
                    count++;
                }
                x /= 10;
            }
            System.out.println(count);
        }
    }
}
