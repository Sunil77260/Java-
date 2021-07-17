package NS_Practice;

import java.util.Scanner;

public class numberOfStringWithA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=1;
        if(n==1){
            System.out.println(ans);
        }else{
            for(int i=1;i<n;i++){
                ans=ans*26*2;
            }
            System.out.println(ans-1);
        }
    }
}
