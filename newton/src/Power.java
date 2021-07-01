import java.util.Scanner;
public class Power {
    public static float power(int x,int n){
        if(n==0){
            return 1;
        }
        else if(n>0){
            return x*power(x,n-1);
        }
        else {
            return 1/power(x,-n);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        float p=power(x,n);
        System.out.println(p);
    }
}
