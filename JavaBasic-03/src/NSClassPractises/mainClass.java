package NSClassPractises;
import OnlineExtraSourcePractice.FactorialUsingBigInteger;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.*;
public class mainClass {
    public static void main(String[] args) {
       /* int arr[]={ 2,3,4,5,4,3,2};
        int res=0;
        for(int i=0;i<arr.length;i++){
            res=res^arr[i];
        }
        System.out.println(res);
 */
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int a[]={1,3,5};
        //int m= sc.nextInt();
      //  System.out.println(SetBit.unsetBit(n,m));
        //System.out.println(SetBit.toggle(n,m));
       // System.out.println(SetBit.RightsetBit(n));


      //  System.out.println(SetBit.TwoPower(n));

       // System.out.println(SetBit.CountBit(n));
      //  PrintTwoSetBitNo.PrintNo(n);

        SumOfDifrenceBit.SumBit(a);

    }
}
