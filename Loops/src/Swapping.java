import  java.util.Scanner;
public class Swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a= sc.nextByte();
        b= sc.nextByte();
        int temp;
        temp=a;
         a=b;
        b=temp;
        System.out.println(a+" "+b);

    }
}
