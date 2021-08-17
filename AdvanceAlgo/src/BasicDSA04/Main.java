package BasicDSA04;
import java.sql.SQLOutput;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        /// sorting algo 1

       // BubbleSort.bubbleSort(a);



        // sorting algo 2

       // selectionSort.selection(a);



        // sorting algo 3
        // inserction sort
        insersetionSort.insersection(a);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
