package NSClassPractises;

public class absXYMin {
    public static int xy(int n){
        int x=1;
        int y=0;

        while (x>y){
            int m=(1<<x)+(1<<y);
            if(n==m){
                return 0;
            }
            if(n>m)
                x++;
        }
       return 0;
    }
}
