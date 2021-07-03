import java.util.Scanner;

public class triconSeries {
    public static int  ficco(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        return ficco(n-1)+ficco(n-2)+ficco(n-3);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(ficco(n)+" ");
    }


}
