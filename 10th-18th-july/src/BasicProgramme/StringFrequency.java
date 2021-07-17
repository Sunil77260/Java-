package BasicProgramme;
public class StringFrequency {

    // also print in shorted order with there frequency
    public  static void count(String s){
        int a[] =new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }for(int i=0;i<a.length;i++){
            if(a[i]>0){
                System.out.println((char)(i+'a')+" "+a[i]);
            }
        }
    }




    // without sorted order >>>
    public  static void unsorted(String s){
        int count=1;

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){

                if(s.charAt(i)==s.charAt(j)){
                    count++;

                   // System.out.println(s.charAt(i)+" "+count);
                }

                }
            System.out.println(s.charAt(i)+" "+count);
            }
        }
    }


