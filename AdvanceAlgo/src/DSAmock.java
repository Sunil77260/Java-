public class DSAmock {
    public static void main(String[] args) {
        int[] arr={ 12,35,46,75,11,33};
        int max=arr[0];
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println();
    }
}
