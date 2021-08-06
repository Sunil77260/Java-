package OOPsConcepts;
class squre{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}


public class squreProblem {
    public static void main(String[] args) {
        squre sq=new squre();
        sq.side=4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());


    }
}
