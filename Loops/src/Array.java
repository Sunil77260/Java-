import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int [] n=new int[a];
        n[0]=25;
        for (int element:n)
        {
            System.out.println(element);
        }
    }
}
