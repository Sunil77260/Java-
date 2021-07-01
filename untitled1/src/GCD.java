import java.util.Scanner;
public class GCD {
    public static int gcd(int n, int m) {
        int rem = 1;
        while (m != 0) {
            rem = n % m;
            n = m;
            m = rem;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(gcd(m,n));
    }
}
