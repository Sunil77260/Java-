package mock;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={13,34, 5,2,1,6};
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}
