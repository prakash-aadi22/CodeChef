import java.util.Scanner;

public class Chef_and_Happy_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            boolean ans = false;
            for (int j = 0; j < s.length() - 2; j++) {
                if ((s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u')
                        && (s.charAt(j + 1) == 'a' || s.charAt(j + 1) == 'e' || s.charAt(j + 1) == 'i' || s.charAt(j + 1) == 'o' || s.charAt(j + 1) == 'u')
                        && (s.charAt(j + 2) == 'a' || s.charAt(j + 2) == 'e' || s.charAt(j + 2) == 'i' || s.charAt(j + 2) == 'o' || s.charAt(j + 2) == 'u')
                ) {
                    ans = true;
                }
            }
            if (ans){
                System.out.println("Happy");
            } else {
                System.out.println("Sad");
            }
        }
    }
}
