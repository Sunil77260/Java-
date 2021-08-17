package mock;

public class OddEvenString {
    public static void main(String[] args) {
        String s="s";
        int l=s.length();
        String s1="";
        String s2="";
        for(int i=0;i<l;i=i+2){
            s1+=s.charAt(i);
        }
        for(int i=1;i<l;i=i+2){
            s2+=s.charAt(i);
        }
        String s3=s1+s2;
        System.out.println(s3);
    }
}
