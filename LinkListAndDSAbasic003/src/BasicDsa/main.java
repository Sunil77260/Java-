package BasicDsa;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        twoNumberSpecialGcd.gcd(n,m);
    }
}
