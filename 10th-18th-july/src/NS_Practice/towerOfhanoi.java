package NS_Practice;

import java.util.Scanner;

public class towerOfhanoi {
    static void towerOfHanoi(int n, char A,char C, char B)
    {
        if (n == 1)
        {
            System.out.println(A+"->"+C);
            return;
        }
        towerOfHanoi(n - 1,A, B, C);
        System.out.println(A +"->" +C );
        towerOfHanoi(n - 1, B,C, A);
    }

    // Driver code
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}
