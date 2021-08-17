package BasicDSA04;

public class selectionSort {
    public  static int[] selection(int [] arr){
        int n= arr.length,min;
        for(int i=0;i<n;i++){
            min=i;
            for(int j=i;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
