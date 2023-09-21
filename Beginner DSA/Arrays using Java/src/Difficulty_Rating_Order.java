import java.util.Scanner;

public class Difficulty_Rating_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            boolean flag = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] <= arr[j + 1]) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
