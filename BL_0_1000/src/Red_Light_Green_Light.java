import java.util.Scanner;

public class Red_Light_Green_Light {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int noOfPeople = sc.nextInt();
            int height = sc.nextInt();
            int count = 0;
            int[] arrOfPeople = new int[noOfPeople];
            for (int j = 0; j < arrOfPeople.length; j++) {
                arrOfPeople[j] = sc.nextInt();
                if (arrOfPeople[j] > height){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
