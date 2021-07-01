import java.util.Scanner;
public class countPrimeNumber {
    public static int  main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean b=false;
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                b=true;
                break;
            }
            else {
                count++;
            }
        }
        return count;

    }
}
