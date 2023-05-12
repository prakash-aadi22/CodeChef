import java.util.Scanner;

public class Playing_with_Matches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            int digit, noOfMatches = 0;
            while (sum > 0) {
                digit = sum % 10;
                if (digit == 0) {
                    noOfMatches += 6;
                } else if (digit == 1) {
                    noOfMatches += 2;
                } else if (digit == 2) {
                    noOfMatches += 5;
                } else if (digit == 3) {
                    noOfMatches += 5;
                } else if (digit == 4) {
                    noOfMatches += 4;
                } else if (digit == 5) {
                    noOfMatches += 5;
                } else if (digit == 6) {
                    noOfMatches += 6;
                } else if (digit == 7) {
                    noOfMatches += 3;
                } else if (digit == 8) {
                    noOfMatches += 7;
                } else if (digit == 9) {
                    noOfMatches += 6;
                }
                sum /= 10;
            }
            System.out.println(noOfMatches);
        }
    }
}
