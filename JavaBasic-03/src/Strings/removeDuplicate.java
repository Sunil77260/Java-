package Strings;

import java.util.LinkedHashSet;

public class removeDuplicate {
    public static void  removeD(String s){
        LinkedHashSet<Character> lhs=new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            lhs.add(s.charAt(i));
        }
        for(Character ch:lhs){
            System.out.print(ch);
        }
    }
}
