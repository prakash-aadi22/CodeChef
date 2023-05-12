public class a_deskera {
    public static void main(String[] args) {
        double[] num = {5.5, 10.1, 11, 12.8, 56.9, 2.5};
        double result;
        result = 0;
        for (int i = 0; i < 6; ++i) {

            result = result + num[i];
        }
        System.out.print(result / 6);

        int i;
        for (i = 1; i <= 12; i += 2) {
            if (i == 8) {
                System.out.println(i);
                break;
            }
        }

        double a, b, c;
        a = 3.0 / 0;
        b = 0 / 4.0;
        c = 0 / 0.0;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        String chair = null, table = "metal";
//        chair = chair + table;
        chair = chair + table;
        System.out.println(chair);


        double var1 = 1 + 5;
        double var2 = var1 / 4;
        int var3 = 1 + 5;
        int var4 = var3 / 4;
        System.out.print(var2 + " " + var4);

        double[] num1 = {5.5, 10.1, 11, 12.8, 56.9, 2.5};
        double result1;
        result1 = 0;
        for (int j = 0; j < 6; ++j) {
            result1 = result1 + num1[j];
        }
        System.out.println(result1);
        System.out.println(result1 / 6);
        double sum1 = 5.5 + 10.1 + 11 + 12.8 + 56.9 + 2.5;
        System.out.println(sum1);
        System.out.println(5.5 + 10.1 + 11 + 12.8 + 56.9 + 2.5);


        a_deskera rt2 = new a_deskera();
        int sum = rt2.summer(4);
        System.out.println(sum);


        show();
    }

    int summer(int in) {
        int sum = 0;
        if (in == 0)
            return 0;
        sum = in + summer(--in);
        return sum;
    }

    public static void show() {
        float f = 12.23f;
        int i = 20;
        f = i * f;
        System.out.println("Result:" + f);
    }

}
