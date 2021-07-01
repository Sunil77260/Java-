package Basics;
import java.util.Scanner;
public class AramstrongNumber {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int N = sc.nextInt();
            int num = 0;
            int temp = N;
            while (N > 0) {
                int a = N % 10;
                N = N / 10;

                num = num + (a * a * a);
                System.out.println(num);
            }
            if (num == temp) {
                System.out.print(num + " ");
            }
        }
    }
}