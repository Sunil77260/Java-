package Basics;
import java.util.Scanner;
public class Recurion{

    static  int f(int n1,int n2){
        if(n1==0||n2==0) {
            return 0;
        }
            else {
                return n1%10*n2%10 +f(n1/10,n2/10);


            }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        System.out.println(f(n1,n2));

    }

}
