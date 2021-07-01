public class printF {
    public static boolean isprime(int n){
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void print(int n){
        for(int i=1;i<=n;i++){
            if(isprime(i)){
                System.out.println(i+" ");
            }
        }
    }
}
