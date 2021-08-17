package BasicDSA04;
import  java.util.Scanner;
public class countDifferentBit{
    public  static long countDiff(int[] a){
        long res=0;
        for(int i=0;i<32;i++){
            long count=0;
            for(int val:a){
                if((val&1<<i)!=0){
                    count++;
                }
            }
            res+=count*(a.length-count)*2;
        }
        return res;
    }
}
