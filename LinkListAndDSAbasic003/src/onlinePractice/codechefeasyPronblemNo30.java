package onlinePractice;

import java.util.Scanner;

public class codechefeasyPronblemNo30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a[] = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};
            int n=sc.nextInt();
            int count=0,i=11;
            while (n>0) {
                if (n >= a[i]) {
                    n =n-a[i];
                    count++;
                }else{
                    i--;
                }
            }
            System.out.println(count);
        }
    }
}
