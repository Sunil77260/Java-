import java.util.Scanner;
public class GcdOfTwoNumber {
    public static int gcd(int n,int m){
        int rem=1;
        while ((m!=0)){
            rem=n%m;
            n=m;
            rem=m;

        }
        return n;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        gcd(n,m);
        int gc=gcd(n,m);
        System.out.println(gc);

    }

}
