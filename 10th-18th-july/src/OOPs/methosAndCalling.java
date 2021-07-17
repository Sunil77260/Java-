package OOPs;

public class methosAndCalling {
    //calling a method without creating an object with help of static method
    static  int sumandmultiple(int x,int y){
        int z;
        if(x>y){
            z=x+y;                          //if we chang valune of x, y variable then its does not effect valuve if of a,b means method variable does not implimented
        }else{
            z=x*y;
        }
        return z;
    }
//calling a method with help of object creation
    int sumAndProduct(int m,int n){
        int p;
        if(m>n){
            p=m+n;
        }else{
            p=m*n;
        }
        return p;
    }

    public static void main(String[] args) {
    int a=8;
    int b=3;
    int c;
       // System.out.println(sumandmultiple(a,b));
      //methosAndCalling obj=new methosAndCalling();
  //    System.out.println(obj.sumAndProduct(a,b));
    }
}