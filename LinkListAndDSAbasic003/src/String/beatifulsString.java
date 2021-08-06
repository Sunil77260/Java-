package String;
import java.util.Scanner;
public class beatifulsString {
    public static long compare(String str){
        long start;
        int length=str.length();
        for(int i=1;i<=length/2;i++){
            String newStr=str.substring(0,i);
            long num=Long.parseLong(newStr);
            start=num;
            while(newStr.length()<length){
                num++;
                newStr=newStr+String.valueOf(num);
            }
            if(newStr.equals(str)) //if(newStr==str),why we cant use it?
                return start;
        }
        return -1;
    }
    public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        long result=compare(str);
        if(result==-1)
            System.out.println("NO");
        else
            System.out.println("YES "+result);
    }
}
