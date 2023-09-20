import java.util.Scanner;

public class My_very_1st_contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println((x - y) + " " + (x - (y + z)));
    }
}
