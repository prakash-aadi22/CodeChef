
public class Main {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 2, 1, 4, 0};
        for (int i = 0; i < ar.length; i++) {
            for (int j = i; j < ar.length; j++) {
                if (ar[i] + ar[j] == 4) {
                    System.out.println(ar[i] + " + " + ar[j]);
                }
            }
        }
    }
}