package OnlinePracticeQuestion;
import java.util.Scanner;
import java.util.Arrays;
public class aligomous {
    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);
        int answer;
        int n=obj.nextInt();
        while(n!=0)
        {

            int[] arr=new int[n];
            int[] inarr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]= obj.nextInt();
                inarr[arr[i]-1]=i+1;

            }
            n=obj.nextInt();
            if(Arrays.equals(arr,inarr))
                System.out.println("ambiguous");
            else
                System.out.println("not ambiguous");
        }
    }
}
