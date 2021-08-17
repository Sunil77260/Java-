package BasicDSA04;
import java.util.Scanner;
public class goodTeamLeader {
    public static boolean[] findprimes(int n){
        boolean prime[] = new boolean[n+1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++)
        {
            if (prime[p] == true)
            {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        return prime;
    }


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        int max = s[0];

        for(int i=0; i<n; i++){
            s[i]=sc.nextInt();
            if(s[i]>max){
                max = s[i];
            }
        }

        boolean primes[] = findprimes((int)Math.sqrt(max));

        int count = 0;

        for(int i=2; i<primes.length; i++){

            if(primes[i]==false){
                continue;
            }
            else{
                int tempcount = 0;
                for(int j=0;j<n; j++){
                    if(s[j]%i==0){
                        tempcount++;
                    }
                }
                if(tempcount>count){
                    count = tempcount;
                    continue;
                }
            }
        }

        System.out.println(count);
    }

}
