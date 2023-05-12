import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            System.out.println((b % a == 0) ? (b / a - 1) : (b / a));
            System.out.println(b / a);
        } else {
            System.out.println(0);
        }
    }
}
