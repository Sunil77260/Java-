public class Array01 {
    public static void main(String[] args) {
        float[] s = {2.3f, 8.4f, 9.4f, 4.4f, 8.9f};
        float sum = 2.8f;
        boolean b1 = false;
        for (float sunil : s) {
            if (sum == sunil) {
                b1 = true;
                break;
            }
        }
            if (b1) {

                System.out.println(" it is present");
            }
            else {
                System.out.println("no it is not present");
            }
            //   System.out.println(sum);

    }
}
