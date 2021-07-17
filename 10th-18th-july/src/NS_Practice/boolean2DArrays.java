package NS_Practice;
import  java.util.Scanner;
public class boolean2DArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        boolean  a[][]=new boolean[m][n];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextBoolean();
            }
        }
            }
}
