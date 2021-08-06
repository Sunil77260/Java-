package sorting_Algo;

public class bubbleSort {
    // bubble sort algo

    public static void bubble(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int temp=0,flag=0;
            for(int j=0;j<n-1-i;j++){
              if(a[j]>a[j+1]){
                  temp=a[j+1];
                  a[j+1]=a[j];
                  a[j]=temp;
                  flag=1;
              }
            }
            if(flag==0){
                break;
            }
        }

        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    }
