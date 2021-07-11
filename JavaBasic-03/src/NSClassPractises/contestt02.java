package NSClassPractises;
import java.util.Scanner;
public class contestt02 {
    public static String removeConsecutiveDuplicates(String input) {
        if(input.length()<=1)
            return input;
        if(input.charAt(0)==input.charAt(1)){
            return removeConsecutiveDuplicates(input.substring(1))+removeConsecutiveDuplicates(input.substring(0));
        }else{
            return input.charAt(0) + removeConsecutiveDuplicates(input.substring(1));
        }
    }


    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(removeConsecutiveDuplicates(s));

    }
}
