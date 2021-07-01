import java.util.Arrays;
import java.util.Scanner;
public class prime {
    public static void sieve(int n) {
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                for (int j = 2; j * i <= n; j++) {
                    isPrime[j * i] = false;
                }
            }
        }

        int max=2;
        for (int i = 0; i <= n; i++) {
            if (isPrime[i]) {
                if (i > max) {
                    max = i;
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sieve(n);
    }

}
