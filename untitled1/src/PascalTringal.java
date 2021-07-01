import java.util.Scanner;
public class PascalTringal {
    public static long fact(long n){
        long res=1;
        for(long i=2;i<=n;i++){
            res=res*i;
        }
        return res;
    }
    public static long ncr(long n,long r){
        return  (fact(n)/(fact(r)*fact(n-r)));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        for(int i=1;i<=n;i++){
            for(long j=n;j>i;j--){

                System.out.print(" ");
            }
            for(long k=1;k<=n;k++){
                System.out.print(ncr(i,k));
            }
            System.out.println();
        }
    }
}
