package mock;

public class palindromString {
    public static void main(String[] args) {
        String s="sunil";
        int l=s.length();
        String s1="";
        for(int i=l-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        if(s1.equals(s)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
