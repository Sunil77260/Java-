package OOPs;

 class employs{
    int id;
    String name;
    int sallary;
    public  void printdeatials(){
        System.out.println("ide is "+id);
        System.out.println("name is  "+name);
    }
}
public class classCreation {

    public static void main(String[] args) {
        System.out.println("this is over 1st custom class");
        employs em=new employs();
        employs sun=new employs();    //instantiating a new employ object
        // setting of attribute of em;
          em.id=21;
          em.name="sunil";
          em.sallary=34;

          // setting of attribute of sun;
          sun.id=12;
          sun.name="bishnoi";
        //System.out.println(em.id+" "+em.name);
        em.printdeatials();

        sun.printdeatials();
    }
}
