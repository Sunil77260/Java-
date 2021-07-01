import java.util.Scanner;
public class ThreeMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int j = 0; j < a.length; j++) {
                int max1 = a[j];
                int max2 = a[j + 1];
                int max3 = a[j = 2];


                if (max1 > max2 && max1 > max3) {
                    if (max2 > max3) {
                        System.out.println(max1 + " " + max2 + " " + max3);
                    } else {
                        System.out.println(max1 + " " + max3 + " " + max2);
                    }
                } else if (max2 > max1 && max2 > max3) {
                    if (max1 > max3) {
                        System.out.println(max2 + " " + max1 + " " + max3);
                    } else {
                        System.out.println(max2 + " " + max3 + " " + max1);
                    }
                } else {
                    if (max1 > max2) {
                        System.out.println(max3 + " " + max1 + " " + max2);
                    } else {
                        System.out.println(max3 + " " + max2 + " " + max1);
                    }
                }
            }


        }


    }

}