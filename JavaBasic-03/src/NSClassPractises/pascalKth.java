package NSClassPractises;
import java.util.Scanner;
import java.util.ArrayList;
public class pascalKth {
    public static ArrayList<Integer> nthRowOfPascalT(int n){
        ArrayList<Integer> currentRow=new ArrayList<>();
        currentRow.add(1);
        if(n==0) {
            return currentRow;
        }
        ArrayList<Integer> prevsRow=nthRowOfPascalT(n-1);
        for(int i=1;i<prevsRow.size();i++){
            currentRow.add(prevsRow.get(i)+prevsRow.get(i-1));
        }
        currentRow.add(1);
        return currentRow;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(nthRowOfPascalT(n));
    }
}
