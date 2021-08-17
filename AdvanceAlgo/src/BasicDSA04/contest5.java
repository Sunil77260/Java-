package BasicDSA04;
import  java.util.Scanner;
public class contest5 {
    static int minSwap(int a[], int n)
    {
        int count=0,count1=0,flag=0;
        for(int i=0;i<n-1;i++){
            if(a[i]==1){
                count1++;
                flag=1;
            }
            if(a[i]==1||a[i]==0){
                if(a[i+1]==0&&flag==1&&count1>0){
                    count++;
                    count1--;
                }else{
                    continue;
                }
            }
        }
        return count;
    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(minSwap(a, a.length));
    }
}
