package Strings;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.util.Scanner;
public class Duplicate1 {
    public static void RemoveDuplicate(String s){
        LinkedHashSet<Character> lhs=new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            lhs.add(s.charAt(i));
        }
        for(Character ch:lhs){
            System.out.print(ch);

        }
        System.out.println();
    }


    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        do{
            String s=sc.nextLine();
            RemoveDuplicate(s);

        }while(t-->0);

    }

    }

