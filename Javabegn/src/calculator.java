import java.util.Scanner;

public class int calculator {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int r=0;
        char ch=sc.next().charAt(0);
        switch (ch){
        case '+':
        r=a+b;
        return r;


        case '-':
        r=a-b;
        return r;

        case '*':
        r=a*b;
        return r;
        case '/':
        r=a/b;



        }

        return r;
        }

}
    public static int main(String[] args) {


}
