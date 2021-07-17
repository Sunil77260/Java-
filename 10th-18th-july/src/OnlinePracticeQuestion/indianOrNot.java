package OnlinePracticeQuestion;
import  java.util.Arrays;
import java.util.Scanner;
public class indianOrNot {
    public static void cheaking(char a[],int n){
        int flag=0;
        for( int i=0;i<n;i++){
            if(a[i]=='I'){
                System.out.println("INDIAN");
                flag=1;
                break;
            }else if(a[i]=='Y'){
                System.out.println("NOT INDIAN");
                flag=1;
                break;

            }
        }
        if(flag==0){
            System.out.println("NOT SURE");
        }

    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            char a[]=new char[n];
            for(int i=0;i<n;i++){

                a[i]=s.charAt(i);
            }
            cheaking(a,n);
        }
    }
}
