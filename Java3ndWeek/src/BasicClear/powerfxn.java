package BasicClear;
import java.util.Scanner;

public class powerfxn {
    public static int power(int x, int n) {
        int flag = 0;
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            n = -n;
            flag = 1;
            return x * power(x, n - 1);
        } else {
            return x * power(x, n - 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int r = power(x, n);

        System.out.println(r);

    }
}
