import java.util.Scanner;
public class FirstAndLastDigit {
    public static void printlastfirst(int n){
    int FistDigit=0;
    FistDigit=n%10;
    int lastdigit=0;
            while (n!=0){
        lastdigit=n;
        n=n/10;
    }
            System.out.println(FistDigit+lastdigit);
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            printlastfirst(n);
    }
}
}