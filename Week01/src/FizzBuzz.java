

    import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

    // don't change the name of this class
// you can add inner classes if needed
    class Main {
        public static void main (String[] args) {
            Scanner in= new Scanner(System.in);
            int N=in.nextInt();
            if(N%15==0){
                System.out.println("FizzBuzz");

            }
            if(N%5==0){
                System.out.println("Buzz");

            }
            if(N%3==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(N);
            }
        }

