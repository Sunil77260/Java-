package sortingAlgo;

import java.util.Scanner;
import java.util.Arrays;
public class main0 {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();

    }
   bubbleSort.sort(a);
    bubbleSort.print(a);

    }
}
