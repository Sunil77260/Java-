package company;

import java.util.Arrays;

public class isPrime {
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

        for (int i = 0; i <= n; i++) {
            int max = 2;
            if (isPrime[i]) {
                if (i > max) {
                    max = i;
                    System.out.print(i + " ");
                } else {
                    System.out.println(max);
                }
            }
        }
    }
}
