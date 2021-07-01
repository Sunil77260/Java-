
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Enter the Subject marks");
         Scanner sc=new Scanner(System.in);
         int s1= sc.nextInt();
         int s2= sc.nextInt();
         int s3= sc.nextInt();
         int s4= sc.nextInt();
         float p=(s1+s2+s3+s4)/4f;
         float pass=33f;
         if(p>=40f && pass<=s1&& pass<=s2&&pass<=s3&&pass<=s4 ) {
             System.out.println("Pass");
         }
         else {
             System.out.println("Fail");
         }

    }
}
