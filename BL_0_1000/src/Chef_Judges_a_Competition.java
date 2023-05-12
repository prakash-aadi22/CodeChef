import java.util.Arrays;
import java.util.Scanner;

public class Chef_Judges_a_Competition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] timeSlotAlice = new int[n];
            for (int i = 0; i < timeSlotAlice.length; i++) {
                timeSlotAlice[i] = sc.nextInt();
            }
            Arrays.sort(timeSlotAlice);
            int sumA = 0;
            for (int i = 0; i < timeSlotAlice.length - 1; i++) {
                sumA += timeSlotAlice[i];
            }
            int[] timeSlotBob = new int[n];
            for (int i = 0; i < timeSlotBob.length; i++) {
                timeSlotBob[i] = sc.nextInt();
            }
            Arrays.sort(timeSlotBob);
            int sumB = 0;
            for (int i = 0; i < timeSlotBob.length - 1; i++) {
                sumB += timeSlotBob[i];
            }
            System.out.println((sumA > sumB) ? "Bob" : (sumA < sumB) ? "Alice" : "Draw");
        }
    }
}
