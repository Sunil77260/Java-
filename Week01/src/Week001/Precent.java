package Week001;
import java.util.Scanner;
public class Precent {
    public static void main(String[] args) {
        Scanner cbse= new Scanner(System.in);
        System.out.println("Enter the Subject marks");
        System.out.println("Physcis");
         float physic=cbse.nextFloat();
        System.out.println("Maths");
        float maths=cbse.nextFloat();
        System.out.println("Chem");
        float chem=cbse.nextFloat();
        System.out.println("Hindi");
        float hindi= cbse.nextFloat();
        System.out.println("Social");
        float social=cbse.nextFloat();
        float precent=(physic+maths+chem+hindi+social)/5;
        System.out.println("The precent of virendra: "+precent);
    }
}
