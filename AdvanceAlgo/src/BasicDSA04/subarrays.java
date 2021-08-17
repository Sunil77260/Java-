package BasicDSA04;
import  java.util.Scanner;
import  java.util.ArrayList;
public class subarrays {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b[]=new int[m];
        for(int j=0;j<m;j++){
            b[j]=sc.nextInt();
        }
        int count =0;
        int max=0;
        int r=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(b[j]==a[i]){
                    count++;
                    break;
                }
                if(count>max){
                    max=count;
                }
            }
        }

        System.out.print(r);
    }
}
