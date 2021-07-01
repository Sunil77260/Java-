import java.util.Scanner;
public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int i, j;
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (i == 0) {
                a[0] = a[0] / a[0];
            } else {
                int q = a[i - 1] + 1;
                for (j = q; j <= a[i]; j++) {
                    if (a[i] % j == 0) {
                        a[i] = j;
                        break;
                    }
                }
            }
        }
        int flag = 0;
        for (i = 0; i < n-1; i++) {
            if (a[i + 1] <= a[i]) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

