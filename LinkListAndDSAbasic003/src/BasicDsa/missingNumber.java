package BasicDsa;

public class missingNumber {
    public static void main(String[] args) {
        int a[]={1,2,4,7,8,10};
        //find missing number upto 10--->
        //ans is 3,5,6,9
        int j=1;
        while (j<=10) {
            int flag=0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == j) {
                    j++;
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(j+"  is missing  ");
                j++;
            }
        }
    }
}
