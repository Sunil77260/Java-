import java.util.Scanner;
public class PrimeNless {
    public static boolean isprime(int n) {
        if (n == 0 || n == 1 || n == 2 || n == 3) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    return false;
                }
            }
        }
            return true;
        }
        public static int coun ( int n){
            int count = 0;
            if (isprime(n)) {
                for (int i = 2; i * i <= n; i++) {
                    if (i * i < n) {
                        count++;
                    }
                }

            }
            return count;
        }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(coun(n));
        }

    }
