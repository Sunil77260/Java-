package OOPsConcepts;
class employs{
    int id;
    String name;
    int sallery;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("and my name is "+ name);
    }
    public   int  getsallery(){
        return sallery;

    }


}
public class classCreation {
    public static void main(String[] args) {
        System.out.println("This is my coustom class ");
        employs sunil=new employs();    // instatitions of employs object or allocaton if memeory for this object
        employs jr=new employs();


        // setting of attribute in sunil object
        sunil.id=12;
        sunil.name="engineer";
        sunil.sallery=34;


        // setting of attribute inside of jr object

        jr.id=14;
        jr.name="SI";
       jr.sallery=40;

        // printing deatils of objects which we set

        sunil.printDetails();
        jr.printDetails();
        System.out.println("sunils salary "+sunil.sallery);
    }

}
