package onlinePractice;

import java.util.Scanner;

public class twoDArrys {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int Sr=0;
        int Sc=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
                Sr=Sr+a[i][j];
                Sc=Sc+a[j][i];
            }
        }
        System.out.println(Sr+" "+Sc);


    }
}