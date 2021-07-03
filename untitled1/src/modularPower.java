import java.util.Scanner;
public class modularPower {
    public static double pow(int x,int N){
        int m=1000000007;
            if(N==0)
                return 1;
            else
            {
                return (x*pow(x,N-1))%m;
            }
        }



    public static void main(String[] args) {

    }
}
