import java.util.Scanner;
public class BinaryNumberPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        while(n!=0){
            int rem=n%2;
            n=n/2;
            System.out.print(rem);
        }
    }
}
