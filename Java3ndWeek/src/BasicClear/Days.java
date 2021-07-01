package BasicClear;
import  java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Monday");
        } else if (n == 2) {

            System.out.println("Tuesday");
        } else if (n == 3){
            System.out.println("Wenesday");
    } else if(n==4) {
            System.out.println("Thrusday");
        }else if(n==5) {
            System.out.println("Monday");
        }else if(n==6&&n==7){
            System.out.println("Weekend");
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
