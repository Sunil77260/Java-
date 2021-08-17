package BasicDSA04;

public class BubbleSort {
//    public static  int[] bubbleSort(int[] arr){
//        int n= arr.length;
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-1-i;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        return  arr;
//    }

    // what is logic write fisrt ---> take two loop
    // outer loop with i index starting form 0 and goes upto n-1 okk
    // inter loop with j =0 index goes upto n-1-i index and check if arr1[j]>arr[j+1] then sweep the element and finally print y
    // the array
    public  static int[] bubbleSort(int[] arr){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
