package mock;
import java.util.Scanner;
public class countTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int count = 0;
            int n = sc.nextInt();
            while (n > 0) {
                int sum = 0, r;
                    r = n% 10;
                    sum += r;
                    n -= sum;
                     count++;
                    n = n / 10;

                }
            System.out.print(count);
        }
    }
}
