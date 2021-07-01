package Basics;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        int n=sc.nextInt();
        int result=power(x,n);
        System.out.println(result);
    }
    public static int power(int x,int n){
        int flag=0;
        if(n==0){
            return 1;
         flag=1;
        }else
        {
            return x*power(x,n-1);
        }
        if(flag==0){
            return }
    }
}
