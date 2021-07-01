import java.util.Scanner;
public class pow {
    public static float power(float x, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return x * power(x, n - 1);
        } else {
            return 1 / power(x, -n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); float x = sc.nextFloat();
        int n = sc.nextInt();
        for (int i = 0; i < t; i++) {

            float p = power(x, n);
            System.out.println(String.format("%.2f",p));
        }
    }
}





