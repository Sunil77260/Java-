import java.util.Scanner;
public class SumMean {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new  int[N];

        float sum=0;
        for (int i:arr){
            sum=sum+i;
        }
        float mean=sum/N;
        System.out.print(sum+" "+mean);



    }
}
