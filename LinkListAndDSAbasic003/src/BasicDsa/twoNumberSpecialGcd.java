package BasicDsa;

public class twoNumberSpecialGcd {
    static void printM_SpecialGCD(int N, int M)
    {
        int p=0;
        for(int i=2;i*i<=N;i++){
            if(N%i==0){
                p=i;
                break;
            }
        }
        int temp=N;
        for(int j=1;j<=M;j++){
            int m=N+p;
            if (gcd(m,temp) == p) {
                N = N + p;
                System.out.print(N+" ");
            }else{
                m=m+p;
                System.out.print(m+" ");
                N=m;
            }

        }
    }
    public static int gcd(int m,int temp) {
        int rem = 1;
        while (m!= 0 && temp != 0) {
            rem = m % temp;
            m=temp;
            temp= rem;
        }
        return m;
    }
}
