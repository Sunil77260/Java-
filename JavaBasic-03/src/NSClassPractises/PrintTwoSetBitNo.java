package NSClassPractises;

public class PrintTwoSetBitNo {
    public  static void PrintNo(int n){
        int x=0;
        while ((n>0)){
            int y=0;
            while (x>y){
                System.out.print((1<<x)+(1<<y)+" ");
                n--;
                if(n==0){
                    return;
                }
                y++;
            }
            x++;
        }
    }
}
