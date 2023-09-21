import java.util.Scanner;

public class Cost_of_Groceries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int total_cost = 0;
            int[] a = new int[n];
            int[] b = new int[n];
            for (int j = 0; j < a.length; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < b.length; j++) {
                b[j] = sc.nextInt();
            }
            for (int j = 0; j < a.length; j++) {
                if (a[j] >= x){
                    total_cost += b[j];
                }
            }
            System.out.println(total_cost);
        }
    }
}
