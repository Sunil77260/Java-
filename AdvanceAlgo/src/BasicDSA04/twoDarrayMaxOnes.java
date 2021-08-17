package BasicDSA04;
import java.util.Scanner;
public class twoDarrayMaxOnes {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int i,j=m-1,count=0,max=0,flag=0;
        for(i=0;i<n;i++){
            if(count>max){
                max=count;
                flag++;
                j=m;
            }
            //int count=0;
            for(j=m-1;j>0;j--){
                if(arr[i][j]==1){
                    count++;
                    m--;
                }
            }
        }
        System.out.print(flag);
    }
}
