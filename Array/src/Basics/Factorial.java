package Basics;
import java.util.Scanner;
public class Factorial {
    static int f(int n){
        if(n==0){
            return 1;
        }
        else {
            return n*f(n-1);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(f(n));
    }
}
