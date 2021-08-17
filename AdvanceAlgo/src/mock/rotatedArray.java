package mock;

public class rotatedArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int l=arr.length;
        int k=2;
        int[] a=new int[l-k];
        int[] b=new int[k];
        int[] c=new int[l];
        for(int i=0;i<(l-k);i++){
            a[i]=arr[k++];
        }
        for(int i=0;i<k;i++){
            b[i]=arr[i];
        }
        for(int i=0;i<l;i++){
            if(i<k){
                c[i]=a[i];
            }else{
                c[i]=b[i];
            }
        }
        for(int element:c){
            System.out.print(element+" ");
        }
    }
}
