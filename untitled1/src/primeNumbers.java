import java.util.Scanner;
public class primeNumbers {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

         print(n);
            }




    public static boolean isPrime(int n){
        if(n<2){
            return false;

        }
        if(n==2){
            return true;
        }

            for(int i=2;i*i<n;i++){
                if(n%i==0){
                    return false;
                }

                }
            return true;

        }
        public static void print(int n){
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        }



        }




