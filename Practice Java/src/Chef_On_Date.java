import java.util.Scanner;

//public class Chef_On_Date {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            System.out.println((x >= y) ? "YES" : "NO");
//        }
//    }
//}

class code {
    int t, x, y;

    void printAge() {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x >= y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}

class Chef_On_Date {
    public static void main(String args[]) {
        code c = new code();
        c.printAge();
    }
}
