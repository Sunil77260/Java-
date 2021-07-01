import java.util.Scanner;
public class Native {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        boolean b=false;
        for (int element:a){
            if(element<0){
                b=true;
                break;
            }
        }
        if(b){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
