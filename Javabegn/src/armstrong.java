import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int num = 0;
            int temp = i;
            while (i > 0) {
                int a = i % 10;
                i = i / 10;
                ;
                num = num + (a * a * a);
               // System.out.println(num);
            }
            if (num == temp) {
                System.out.print(num + " ");

            }
            i=temp;
        }
    }
}
