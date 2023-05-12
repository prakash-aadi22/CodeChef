import java.util.Scanner;

public class Problems_in_your_to_do_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] value = new int[n];
            int count = 0;
            for (int j = 0; j < value.length; j++) {
                value[j] = sc.nextInt();
                if (value[j] >= 1000){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
