import java.util.Scanner;

public class La_Liga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            for (int j = 0; j < 4; j++) {
                String team = sc.next();
                int score = sc.nextInt();
                switch (team) {
                    case "Barcelona" -> a = score;
                    case "Malaga" -> c = score;
                    case "RealMadrid" -> d = score;
                    case "Eibar" -> b = score;
                }
            }
            if (c > d && a > b) {
                System.out.println("Barcelona");
            } else {
                System.out.println("RealMadrid");
            }
        }
    }
}
