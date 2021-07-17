package OOPs;
//vaeArgus use for when we don't know how many input we have its works as array like internally
public class variableArgument {
    public static int varArgs(int ...a) {
        int sum = 0;                       //in this method we can pass null valune
        for (int e : a) {
            sum += e;
        }
        return sum;
    }


    // when we have one condition that altest one value must be add or we have minimum one imput from user
    public static int varArgs(int x, int ...a) {
        int sum = 0;
        for (int e : a) {
            sum += e;
        }
        return sum;
    }


}