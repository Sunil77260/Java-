package mock;

public class inserctionSort {
    public static void main(String[] args) {
        int[] arr={34,2,33,45,5,54,23};
        int l=arr.length;
        for(int i=1;i<l;i++){
            int temp=arr[i],j=i;
            while(j>0&&arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}
