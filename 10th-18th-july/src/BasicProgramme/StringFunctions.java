package BasicProgramme;

import java.sql.SQLOutput;

public class StringFunctions {


    // Basic function
    public static void funs() {
        String s = "Bishnoi";
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.substring(2));
        System.out.println(s.substring(2, 5));


    }

    // memeory allocation is same if we create same string with help of string class ,if create new String than its allocated diffrent memerory
    public static void samememeory() {
        String s1 = "Sunil";
        String s2 = "Sunil";
        if (s1 == s2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        String s3 = new String("Sunil");
        if (s1 == s3) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }
    }

    //Contains function
    public static void Contains(){
        String s1="sunilBishnoi";
        String s2="Bis";
        System.out.println(s1.contains(s2));
    }

  // equal function
    public  static void equal(){
        String s1= "sunil";
        String s2= "sunilb";
        System.out.println(s1.equals(s2));
    }


    //compaireTo function
    public  static void compare(){
        String s1="sunil";
        String s2="Bishnoi";
                int res=s1.compareTo(s2);
        if(res==0){
            System.out.println("Same");
        }
        if(res>0){
            System.out.println("Grater lexogahically");
        }
        if(res<0){
            System.out.println("Lesaer in lexioghriphcally");
        }
    }



    // indexoffunction in String
    public  static void indexOf(){
        String s1="sunilbishnoilb";
        String s2="ilb";
        //System.out.println(s1.indexOf(s2));
        //System.out.println(s1.indexOf(s2,4));
        System.out.println(s1.lastIndexOf(s2));
    }

    public static void outputquestion(){
        String s1="geeks";
        String s2=s1;
        s1=s1+"forgeeks";
        System.out.println(s1);
        System.out.println(s1==s2);
    }

}
