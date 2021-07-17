package OnlinePracticeQuestion;
import java.util.Arrays;
import java.util.Scanner;
public class SumsInTringle {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int sum=0;
            int n=sc.nextInt();
            for(int i=0;i<=n;i++){
                for(int j=0;j<=i;j++){
                    int a[]=new int[j+1];
                    for(int k=0;k<=j;j++){
                        a[k]=sc.nextInt();
                    }
                    Arrays.sort(a);
                    sum+=a[i];
                }
            }
            System.out.println(sum);
        }
    }
}


//2
//3
//1
//2 1
//1 2 3
//4
//1
//1 2
//4 1 2
//2 3 1 1