import java.util.Scanner;

public class Find_the_Direction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            System.out.println((x % 4 == 1) ? "East" : (x % 4 == 2) ? "South" : (x % 4 == 3) ? "West" : "North");
        }
    }
}
