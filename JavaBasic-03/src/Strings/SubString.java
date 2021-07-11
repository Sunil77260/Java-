package Strings;
import  java.util.Scanner;
public class SubString {
    public static void isSubArray(String s1,String s2){
        int l1=s1.length();
        int l2=s2.length();
        for(int i=0;i<=(l2-l1-1);i++){
            int j;
            for(j=0;j<l1;j++) {
                if (s1.charAt(j) != s2.charAt(i + j)) {
                    break;
                }


            }
            if (j == l1) {
                System.out.print("Yes");
                break;
            }
            if(i==(l2-l1-1))
            System.out.print("No");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        isSubArray(s1,s2);
    }
    }
