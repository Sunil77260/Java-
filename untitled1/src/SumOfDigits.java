import java.util.Scanner;
public class SumOfDigits {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int sum=0;
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            while(n!=0){
                sum=sum+n%10;
                n=n/10;
            }
            System.out.println(sum);
        }
    }
}
