import java.util.Scanner;

public class Alice_and_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println((x >= (y * 2)) ? "YES" : "NO");
    }
}
