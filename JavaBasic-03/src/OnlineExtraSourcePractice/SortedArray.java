package OnlineExtraSourcePractice;

import java.util.Scanner;

public class SortedArray {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int a[]={100,50,10,5,2,1};
        int t=sc.nextInt();

        for(int j=0;j<t;j++){
            int count=0;
            int n=sc.nextInt();
            for(int i=0;i<5;i++){
                    count=count+n/a[i];
                    n=n%a[i];
                    if(n==0){
                        break;
                    }

            }
            System.out.println(count);
        }
    }
}
