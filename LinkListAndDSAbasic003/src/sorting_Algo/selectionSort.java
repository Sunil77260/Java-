package sorting_Algo;

public class selectionSort {

    public static void Selection(int a[]){
        int l=a.length;
        int min,temp=0;
        for(int i=0; i<l;i++){
            min=i;
            for(int j=i+1;j<l;j++){

                if(a[min]>a[j]){
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;

        }
        for(int i=0;i<l;i++){
            System.out.print(a[i]+" ");
        }
    }
}
