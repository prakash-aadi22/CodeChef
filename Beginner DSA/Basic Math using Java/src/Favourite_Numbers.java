import java.util.Scanner;

public class Favourite_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            System.out.println(((a % 2 == 0) && (a % 7 == 0)) ? "Alice" : ((a % 2 != 0) && (a % 9 == 0)) ? "Bob" : "Charlie");
        }
    }
}
