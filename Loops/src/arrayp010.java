import java.util.Scanner;
public class arrayp010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int j;

        for ( j = 1; j < n - 1; j++) {
            a[j] = a[j - 1] * a[j + 1];
        }

        if (j == 0) {
            a[j] = a[j] * a[j + 1];
        }
        if (j == n - 1) {
            a[j] = a[j] * a[j - 1];
        }




        for (int k = 0; k < n; k++) {
            System.out.print(a[k]+" ");


        }


    }
}