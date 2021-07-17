package NS_Practice;
import java.util.Scanner;
public class twoDArrays {
    /* public static int maxOnesRow(boolean a[][],int n, int m){
         int temp=0;
         int res=0;
         int count=0;
         for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                 if(a[i][j]){
                     count++;
                 }
                 if(res<count){
                     res=count;
                     temp=i;
                 }
             }
         }
         return temp;
     }

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean a[][] = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
              //  a[i][j] = sc.nextBoolean();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
            // System.out.print(maxOnesRow(a,n,m));
        }
    }
}