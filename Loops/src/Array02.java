import java.util.Scanner;
public class Array02  {
    public static void main(String[] args) {

        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] marks=new int[n];
        System.out.println("Enter the marks of student");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("marks are ");
        for (int i=0;i<n;i++)
            System.out.print(marks[i]+" ");
    }
}
