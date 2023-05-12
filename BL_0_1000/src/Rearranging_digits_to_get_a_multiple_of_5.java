import java.util.Scanner;

public class Rearranging_digits_to_get_a_multiple_of_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean ans = false;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '0' || s.charAt(j) == '5') {
                    ans = true;
                    break;
                }
            }
            if (ans){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
