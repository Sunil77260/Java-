package sorting_Algo;

public class mergeSort {
    static   void mergesort(int a[],int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergesort(a,l,mid);
            mergesort(a,mid+1,r);
            merge(a,l,mid,r);
        }

    }

      static  void merge(int a[],int l,int mid,int r){
        int i=l;
        int j=mid+1;
        int k=l;
        int b[]=new int[r];
        while (i<=mid&&j<=l){
            if(a[i]<a[j]){
                b[k]=a[i];
                i++;
            }else {
                b[k]=a[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while (j<=r) {
                b[k] = a[j];
                j++;
                k++;
            }
        }else {
            while (i <= mid) {
                b[k] = a[i];
                k++;
                i++;
            }
        }
        for(int x=l;x<=r;x++){
            b[x]=a[x];
        }
        for(int p:b){
            System.out.print(p+" ");
        }
    }
}
