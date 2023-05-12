import java.util.Scanner;

public class The_Lead_Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int p1 = 0, p2 = 0, max = 0;
        for (int i = 0; i < t; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            p1 += p;
            p2 += q;
            int lead = p1 - p2;
            if (Math.abs(lead) > Math.abs(max)) {
                max = lead;
            }
        }
        if (max > 0) {
            System.out.println(1 + " " + max);
        } else {
            System.out.println(2 + " " + Math.abs(max));
        }

//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        int p = 0, max = 0;
//        for (int i = 0; i < t; i++) {
//            int p1 = sc.nextInt();
//            int p2 = sc.nextInt();
//            int lead = Math.abs(p1 - p2);
//            if (lead > max) {
//                max = lead;
//                if (p1 > p2) {
//                    p = 1;
//                } else {
//                    p = 2;
//                }
//            }
//        }
//        System.out.println(p + " " + max);
    }
}
