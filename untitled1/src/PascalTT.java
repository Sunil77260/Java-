import java.util.Scanner;
public class PascalTT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if (k == 0) {
            System.out.print(1);
        } else {
            System.out.print(1 + " " + k + " ");
            float term = k;
            float j = k - 1;
            for (float i = 2; i <= k; i++) {
                term = (j / i) * (term);
                j = j - 1;
                System.out.printf("%.0f", term);
                System.out.print(" ");
            }
        }
    }
}
