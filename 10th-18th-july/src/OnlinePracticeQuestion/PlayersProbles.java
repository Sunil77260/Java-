package OnlinePracticeQuestion;
import  java.util.Scanner;
public class PlayersProbles {
    public static void player(int s1,int s2,int res){
        if(s1-s2==res){
            System.out.print(1+" ");
        }if(s2-s1==res){
            System.out.print(2+" ");
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int res=0;
        int max=0;
        while(t-->0){

            int s1=sc.nextInt();
            int s2=sc.nextInt();
            if(s1>s2){
                max=(s1-s2);

            }else{
                max=(s2-s1);

            }

            if(res<max){
                res=max;
            }

            player(s1,s2,res);
        }

        System.out.println(res);
    }
}
