package NSClassPractises;

public class SumOfDifrenceBit {
    public static void SumBit(int [] a){
        int res=0;
        for(int i=0;i<32;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
                if((a[j]&(1<<i))==0){
                 count++;
                }


            }
            res=res+((count)*(a.length-count))*(2);
        }
        System.out.println(res);
    }
}
