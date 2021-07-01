package company;
import java.util.Scanner;

public class powerProble {
    public static double pow(double x, int N) {
        if (N == 0)
            return 1;
        else {
            return x * pow(x, N - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            double x = sc.nextDouble(), K = 0;
            int N = sc.nextInt();
            if (N < 0) {
                K = pow(x, -N);
                System.out.println(String.format("%.2f", 1 / K));
            } else {
                K = pow(x, N);
                System.out.println(String.format("%.2f", K));
            }

        }
    }
}
