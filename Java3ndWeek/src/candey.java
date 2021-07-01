import java.util.Scanner;
public class candey {
    public static int fun(int n, int g) {
        if (n == 0) {
            return 0;
        } else {
            g = (n - 1) / 3 + 1;
            return g * g +fun(n,g=n-g);;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=fun(n);
        System.out.println();
    }
}
