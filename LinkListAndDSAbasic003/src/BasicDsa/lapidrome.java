package BasicDsa;
import java.util.Scanner;
import java.util.*;
public class lapidrome {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int l=s.length();
            int m=l/2;
            char c1[]=new char[m];
            int i=0;
            for(int k=0;k<m;k++){
                c1[k]=s.charAt(i);
                i++;
            }
            Arrays.sort(c1);
            String s1=c1.toString();

            char c2[]=new char[m];
            for(int j=0;j<m;j++){
                c2[j]=s.charAt(i);
                i++;
            }
            Arrays.sort(c2);
            String s2=c2.toString();


            if(s1.equals(s2)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }


        }
    }
}
