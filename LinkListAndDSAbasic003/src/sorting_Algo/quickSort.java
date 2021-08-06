package sorting_Algo;

public class quickSort {
    public  static int[] quicksort(int a[],int start,int end){
        if(start<end){
            int pivotposition =partitation(a,start,end);
            quicksort(a,start,pivotposition-1);
            quicksort(a,pivotposition+1,end);
        }
        return a;
    }
    public static int partitation(int a[],int start,int end){
        int pivot=a[end];
        int pivotposition=start-1;
        for(int i=0;i<end;i++){
            if(a[i]<pivot){
                pivotposition++;
                swap(a,i,pivotposition);
            }
            swap(a,pivotposition+1,end);
        }
        return pivotposition+1;
    }
    private static void swap(int a[],int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;

    }
   // public static void print(int a[]){
       // int l=a.length;
       // for(int i=0;i<l;i++){
         //   System.out.print(a[i]+" ");
        //}
    }

