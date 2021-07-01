package company;

public class basicPrime {
    public static int  prime(int n){
        if(n<2){
            System.out.println("No");
            return 0;
        }
        if(n==2){
            System.out.println("Yes");
            return 2;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.println("No");
                return 0;
            }

        }
        return n;

    }
}
