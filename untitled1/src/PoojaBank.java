import java.util.Scanner;
public class PoojaBank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amount =sc.nextInt();
        System.out.println("Enter the balance:");
        float balance=sc.nextFloat();

        if(amount%5==0){
            if(amount<balance){
                balance=balance-amount-.50f;
                System.out.println(balance);
            }else {
                System.out.println(String.format("%.2f",balance)+"Insufficient Funds");
            }

        }else{
            System.out.println(String.format("%.2f",balance)+" Incorrect Withdrawal Amount (not multiple of 5)");
        }

    }
}
