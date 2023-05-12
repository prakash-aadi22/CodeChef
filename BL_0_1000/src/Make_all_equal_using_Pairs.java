import java.util.HashMap;
import java.util.Scanner;

public class Make_all_equal_using_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
                if (hm.get(arr[j]) == null) {
                    hm.put(arr[j], 1);
                } else {
                    hm.put(arr[j], hm.get(arr[j]) + 1);
                }
            }
            if (hm.size() == 1){
                System.out.println(0);
            } else {
                int max = 0;
                for (int j = 0; j < size; j++) {
                    if (hm.get(arr[j]) > max){
                        max = hm.get(arr[j]);
                    }
                }
                System.out.println(size - max);
            }
        }
    }
}
