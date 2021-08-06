package sorting_Algo;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }


        // sorting algo 1 = apply the bubble sort--
       // bubbleSort.bubble(a);


        //sorting algo 2= Selection sort
       // selectionSort.Selection(a);

        //sorting algo 3= Insertion sort
        //inseration.InsertionSort(a);


        //sorting algo 4---> meregesort
     //   mergeSort.mergesort(a,0,n-1);


        //sorting algo 5-->Quicksort
      //  quickSort.quicksort(a,0,a.length-1);
      //  for(int i=0;i<a.length;i++){
        //    System.out.print(a[i]+" ");
        //}

    }

}
