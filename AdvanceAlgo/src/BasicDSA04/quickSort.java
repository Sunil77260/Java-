package BasicDSA04;
public class quickSort {
    public static void main(String[] args) {
        int[] arr={8,13,12,2,1};
        int len=arr.length;
        quick(arr,0,len-1);
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
    public  static void quick(int[] arr,int l,int h){
        if(l<h){
            int pivot=partition(arr,l,h);
            quick(arr,l,pivot-1);

        }
    }
    public static int partition(int[] arr,int l,int h){
        int pivot =arr[l];
        int i=l;
        int j=h;
        while (i<j){
            while (arr[i]<=pivot)
                i++;
            while (arr[j]>pivot)
                j--;
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,j,l);
        return j;

    }
public static int[] swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
}

}
