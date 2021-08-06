package BasicDsa;
import java.util.Scanner;
public class rotededArray {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            System.out.println(bs(a,0,n-1));
        }
    }

    public static int bs(int[] a,int l,int h){
        int min=a[0];
        int m=(l+h)/2;
        while (l<h) {
            if (min < a[m]) {
                l = m + 1;
              return   bs(a, l, h);
            } else if (min > a[m]) {
                min = a[m];
                h = m - 1;


              return   bs(a, l, h);
            }
        }
        return a[m];
    }
}
