import java.util.Scanner;
public class MNgame {
    public static int gcd(int x, int temp) {
        int rem = 1;
        while (x!= 0 && temp !=0) {
            rem = x % temp;
            x= temp;
            temp=rem;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                p = i;
                break;
            }
        }
            int temp=n;
        for(int i=1;i<=m;i++) {
            int x=n+p;
            if(gcd(x,temp)==p){
                n=n+p;
                System.out.print( n+ " ");
            }else{
                x=x+p;
                System.out.print(x+" ");
               n=x;
            }


        }
    }
}