import java.util.Scanner;

public class DNA_Storage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            sc.nextLine();
            for (int i = 0; i < s.length(); i = i + 2) {
                if ((s.charAt(i) == '0') && (s.charAt(i + 1) == '0'))
                    System.out.print("A");
                if ((s.charAt(i) == '0') && (s.charAt(i + 1) == '1'))
                    System.out.print("T");
                if ((s.charAt(i) == '1') && (s.charAt(i + 1) == '0'))
                    System.out.print("C");
                if ((s.charAt(i) == '1') && (s.charAt(i + 1) == '1'))
                    System.out.print("G");
            }
            System.out.println();
        }
    }
}
