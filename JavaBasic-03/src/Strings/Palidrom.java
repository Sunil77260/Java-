package Strings;

public class Palidrom {
    public static void pali(String s){
        int i,j=0;
        int temp=0;
        j=s.length()-1;
        for( i=0;i<=j;i++){
                if(s.charAt(j)==s.charAt(i)){
                    j--;
                    temp=i-1;
                }
            }
        if(j==0||temp==j){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
