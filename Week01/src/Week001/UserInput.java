package Week001;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
      //  System.out.println("Enter The User Name");
           Scanner su = new Scanner(System.in);

        System.out.println("Enter the 1st Name");

       String a = su.nextLine();
        System.out.println(a);

        System.out.println("Enter The 2nd Name");

        String b = su.nextLine();
        System.out.println(b);

     //   int sum= a+b;
       // System.out.println("The sum is");
     //   System.out.println(sum);
    }
}
