import java.util.Scanner;

public class Puzzle_Hunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n >= 6 && n <= 8) ? "Yes" : "No");
    }
}
