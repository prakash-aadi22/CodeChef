import java.util.Scanner;

public class Non_Negative_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int count = 0, count0 = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] < 0) {
                    count++;
                }
                if (arr[i] == 0) {
                    count0++;
                }
            }
            if ((count % 2 == 0) || (count0 >= 1)) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }
}
