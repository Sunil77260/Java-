package OnlineExtraSourcePractice;

public class reverseTheNumber {
    public static int reverse(int n){
        int resv=0;
        while (n!=0){
            int digit =n%10;
            resv=resv*10+digit;
            n=n/10;
        }
        return resv;
    }
}
