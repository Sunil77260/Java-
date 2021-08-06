package BasicDsa;
import  java.util.Scanner;
public class binarySearch {
    public static void main(String[] args) {
        int[] a = {-2, -1, 0, 4, 6, 8, 10};
        int l = 0, h = a.length - 1;
        int key = 7;
        boolean b = (bs(a, l, h, key));
        if (b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    static boolean bs(int[] a, int l, int h, int key) {
        int m = (l + h) / 2;
        while (l < h) {
            if (key == a[m]) {
                return true;
            }
            if (key > a[m]) {
                l = m + 1;
                return bs(a, l, h, key);
            } else {
                h = m - 1;
                return bs(a, l, h, key);
            }
        }
        return false;

    }
}

