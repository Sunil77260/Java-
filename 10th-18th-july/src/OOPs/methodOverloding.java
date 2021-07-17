package OOPs;

public class methodOverloding {
    // method overloding means we can use same method name with different parrameters--->we can overload using diffrent parameters bus cant with help of changing return type
    // argument is actual valune
    static  void sun(){
        System.out.println("Hi! sunil bro");
    }
    static void sun(int a){
        System.out.println("Hi! "+a+" sunil bro");
    }
    static  void sun(int a,int b){
        System.out.println("Hi! "+a+b+" sunil bro");
    }
}
