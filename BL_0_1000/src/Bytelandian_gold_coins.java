import java.util.Scanner;

public class Bytelandian_gold_coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            long n = sc.nextLong();
            System.out.println(trade(n));
        }

    }

    public static long trade(long n) {
        if (n <= 11) {
            return n;
        } else {
            long c1 = trade(n / 2);
            long c2 = trade(n / 3);
            long c3 = trade(n / 4);
            long sum = c1 + c2 + c3;
            return (Math.max(n, sum));
        }
    }
}
