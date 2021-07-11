package OnlineExtraSourcePractice;

import java.math.BigInteger;

public class FactorialUsingBigInteger {
    public static BigInteger fac(int n){
        BigInteger f=new BigInteger("1");
        for(int i=1;i<=n;i++){
            f=f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}
