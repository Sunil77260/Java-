package linklistTheory;
import java.util.*;
public class linkedlistUsingJavaFrameWork {

    public static void main(String[] args) {

        List<Integer> ll = new LinkedList<>();
        List<Integer> al = new ArrayList<>();        // addting an element using java framework fuction

     /*   ll.add(21);
        ll.add(23);
        ll.add(24);
        ll.add(26);
       */

        //printing an element using funtion by java collections framwork

        getTimeDiff(ll);
        getTimeDiff(al);

    }
     //time taking by arraylist and linkedlist making a static function for calculating time

        static void getTimeDiff(List<Integer>list){
     long start =System.currentTimeMillis();
      for(int i=0;i<100000;i++){
          list.add(0,i);
      }
      long end =System.currentTimeMillis();
            System.out.println(list.getClass().getName()+"-->"+(end-start));
    }
}
