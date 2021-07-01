import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
       /* float [] A={ 23.5f,22.5f,46.2f,55.2f,22.4f};
        float sum=0;
        for(float sunil:A) {
            sum = sum + sunil;
        }
            System.out.println("the sum of array "+sum);

        */
       // Scanner sc=new Scanner(System.in);
       // int n=sc.nextInt();
            int [] S={25,35,351,51,55,52};
            int a=45;
            boolean p=false;
            for(int sunil:S){
                if(a==sunil){
                    p=true;
                    System.out.println("Element is present");
                    break;
                }
                else {
                    System.out.println("Element is not present ");
                }
            }


    }

}

