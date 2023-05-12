import java.util.Scanner;

public class The_Block_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            StringBuilder sb = new StringBuilder(s);
            if (s.contentEquals(sb.reverse())){
                System.out.println("wins");
            } else {
                System.out.println("loses");
            }
        }
    }
}
