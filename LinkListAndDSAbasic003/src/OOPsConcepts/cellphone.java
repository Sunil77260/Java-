package OOPsConcepts;
class phone{
    public  void ringing(){
        System.out.println("ringing of phone");
    }
    public void vibrating(){
        System.out.println("vibrating of phone");
    }

    public void calling(){
        System.out.println("call to friends");
    }
}
public class cellphone {
    public static void main(String[] args) {
        phone k20=new phone();
        k20.ringing();
        k20.calling();
        k20.vibrating();
    }
}
