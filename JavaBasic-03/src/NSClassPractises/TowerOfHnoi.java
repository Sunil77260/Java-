package NSClassPractises;
import java.util.Scanner;
public class TowerOfHnoi {
    public static void OtoD(int n,char A,char C,char B){
        if(n==1){
            System.out.println("1:"+A+"->"+C);
            return;
        }
        OtoD(n-1,'A','B','C');
        System.out.println(n+":"+A+"->"+B);
        OtoD(n-1,'B','C','A');
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        OtoD(n,'A','B','C');

    }
}
