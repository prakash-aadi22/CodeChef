import java.util.Scanner;

public class AB_Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.abs((a * b) - (a + b)));
    }
}
