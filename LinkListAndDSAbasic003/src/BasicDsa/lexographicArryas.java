package BasicDsa;
import java.util.Scanner;
public class lexographicArryas {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int min=a[0];
        int flag=0;
        int count=0;
        for(int i=1;i<n;i++) {
            if (min < a[i]) {
                min = a[i];
                flag = 1;
                count++;
            } else {
                break;
            }
        }
            if(flag==0) {
                for (int k = 0; k < n; k++) {
                    System.out.print(a[k] + " ");
                }
            }
                if(flag==1){
                    int[] b=new int[n];
                    int p;
                    for( p=0;p<n;p++) {
                        while ((count + 1) != n) {
                            b[p] = a[count + 1];
                            count++;
                            p++;
                        }
                        break;
                    }
                    int c=0;
                        for(int j=p;j<n;j++){
                            b[j]=a[c];
                            c++;
                        }
                  for(int s:b){
                      System.out.print(s+" ");
                  }

                }

    }
}
