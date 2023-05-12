import java.util.Scanner;

public class Problem_Category {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            System.out.println((1 <= x && x < 100) ? "Easy" : (100 <= x && x < 200) ? "Medium" : "Hard");
        }
    }
}
