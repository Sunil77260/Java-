package BasicDsa;
import  java.util.Scanner;
public class printDigit {
    static void Print_Digits(int N){
        if(N==0){
            return;
        }
        int r=N%10;
        Print_Digits(N/10);
        String a[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0;i<10;i++){
            if(i==r){
                System.out.print(a[i]+" ");
                break;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Print_Digits(N);
    }
}
