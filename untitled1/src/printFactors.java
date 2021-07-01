public class printFactors {
    public static void factor(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i!=n/i){
                    System.out.print(i+" "+n/i);
                }else{
                    System.out.print(" "+i);
                }
            }
        }
    }

}
