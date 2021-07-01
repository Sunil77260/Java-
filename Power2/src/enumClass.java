import java.util.Scanner;
import java.util.Arrays;
public class enumClass {
    enum Bikes{
        SPA ,HERO,SPENDER
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Bikes bike=Bikes.valueOf(s);
        switch (bike){
            case HERO -> System.out.println("Indian bike ");
            default -> System.out.println("not an indian bike");
        }

    }
}
