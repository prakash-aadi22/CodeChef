import java.util.Arrays;
import java.util.Scanner;

public class Turbo_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
