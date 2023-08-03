import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t/2; i++) {
//            if (t % 2 != 0){
//                System.out.println(t + " is a prime number.");
//            } else {
//                System.out.println();
//            }
//        }
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
