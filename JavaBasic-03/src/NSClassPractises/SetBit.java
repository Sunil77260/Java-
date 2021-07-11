package NSClassPractises;

import java.awt.*;
import java.util.Scanner;

public class SetBit {

    // set the bit at mth position
    public static int setnthBit(int n,int m){
        n=n|1<<m;
        return n;
    }


    // unset the bit at mth position
    public static int unsetBit(int n,int m){
        n=n&~(1<<m);
        return n;
    }


    //toggle the nth bit
    public static int toggle(int n,int m){
        n=n^(1<<m);
        return n;
    }


    // Stripit the last set bit means if no is 10101100 >>> 10101000 >> 1 from right side set to be 0
    public static int RightsetBit(int n){
        n=n&(n-1);
        return n;
    }


    // check the number is 2 power or not
    public static boolean TwoPower(int n){
        if((n&n-1)==0){
            return true;
        }else{
            return false;
        }
    }



    // count the number of set bit in a given number
    public static int CountBit(int n){
        int count=0;
        while (n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
