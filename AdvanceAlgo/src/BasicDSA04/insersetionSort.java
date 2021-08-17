package BasicDSA04;

public class insersetionSort {
    public  static  int [] insersection(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
           int temp=arr[i],j=i;
           while(j>0&&temp<arr[j-1]){
               arr[j]=arr[j-1];
               j--;
           }
           arr[j]=temp;

        }
        return arr;
    }
}
