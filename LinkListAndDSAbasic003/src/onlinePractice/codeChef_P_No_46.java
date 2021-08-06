package onlinePractice;
import  java.util.Scanner;
public class codeChef_P_No_46 {
    public static int primenumber(int sum){
        int n=sum+1,ans;
        for(int i=2;i<n;i++){
            if(n%i==0){
                n++;
                i=2;
            }

        }
        ans =n-sum;
        return ans;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int sum=0;
            int x=sc.nextInt();
            int y=sc.nextInt();
            sum=x+y;             //4+3=7
            System.out.println(primenumber(sum)); //7


        }
    }
}
