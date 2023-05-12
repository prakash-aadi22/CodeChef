import java.util.Scanner;

public class Game_between_friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int nitinCoin = sc.nextInt();
            int sobhagyaCoin = sc.nextInt();
            int ritikCoin = sc.nextInt();
            int satyarthCoin = sc.nextInt();
            if (nitinCoin >= sobhagyaCoin) {
                sobhagyaCoin += ritikCoin;
            } else {
                nitinCoin += ritikCoin;
            }
            if (nitinCoin >= sobhagyaCoin) {
                sobhagyaCoin += satyarthCoin;
            } else {
                nitinCoin += satyarthCoin;
            }
            System.out.println((nitinCoin >= sobhagyaCoin) ? "N" : "S");
        }
    }
}
