import java.util.Scanner;
public class contest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int b[] = new int[m];
        for (int j = 0; j < m; j++) {
            b[j] = sc.nextInt();
        }
        int count = 0;
        int temp=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (b[j] == a[i]) {
                    count++;
                  temp=count-b.length;
                }
            }

        }

        System.out.println(temp);
    }
}