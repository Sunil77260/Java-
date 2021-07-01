package Basics;
import java.util.Scanner;
public class FindTwiMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max1 = a[0];
        int max2 = a[1];
        if (max1 >= max2) {
            for (int i = 1; i < n; i++) {
                if (a[i] >= max1) {
                    int temp = max1;
                    max1 = a[i];
                    max2 = temp;
                } else if (a[i] >= max2) {
                    max2 = a[i];

                                    }

            }
            System.out.println(max1 + " " + max2);

        }
        else {
            for(int i=1;i<n;i++){

            }
        }
    }
}