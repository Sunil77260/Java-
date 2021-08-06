package sorting_Algo;

public class inseration {
    public static  void InsertionSort(int a[]){
        int l=a.length;

        for(int i=1;i<l;i++){
            int temp=a[i],j=i;
            while (j>0&&a[j-1]>temp){
                a[j]=a[j-1];
                j--;
            }
            a[j]=temp;
        }
        for(int i=0;i<l;i++){
            System.out.print(a[i]+" ");
        }
    }

}
