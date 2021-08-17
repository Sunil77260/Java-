package mock;

public class missingNumber {
    public static void main(String[] args) {
        // find the missing element in this array which have value upto N in this n=10;
        int[] a={2,3,5,7,8,9};
        int j=0;
        for(int i=1;i<=10;i++) {
            int flag=0;
            if (j<(a.length)&&a[j] == i) {
                flag = 1;
                j++;
            }
            if (flag == 0) {
                System.out.println(i + " is missing ");
            }
        }

    }
}
