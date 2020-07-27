package DAY6;
import java.util.*;
public class Strings {
    public static void main(String[] args) {
//        String string = new String();
//        String s1 = "Morning";
//        String s2 = new String("Morning");
//        String s3 = "Morning java";
//        String s4 = new String("Morning");
//        boolean bool = (s1==s2);
//        boolean bool1 = (s1==s3);
//        boolean bool2 = (s2==s4);
////        boolean bool = (s1==s2);
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(bool);
//        System.out.println(bool1);
//        System.out.println(bool2);
//        s1.concat("java");
//        s2.concat("java");
//        System.out.println(s1.concat("java"));
//        System.out.println(s2.concat("java"));
//        System.out.println(s1);
//        System.out.println(s2);
//        s1+=s1.concat("java");
//        System.out.println(s1);
//
//        System.out.println(s2.length());
//        System.out.println(s2.toLowerCase());
//        System.out.println(s2.toUpperCase());
        String st= "Hi I am learning Java";
        String[] starr=st.split(" ");
        char[] ch={'c','o','n','s','u','l','t'};
        String sch= ch.toString();
        for(String s: starr){
            System.out.println(s);
        }
        System.out.println(st.contains("o"));

        //Stringbuilder and Stringbuffer
        StringBuilder stringBuilder = new StringBuilder("Morning");
        stringBuilder.reverse();
        stringBuilder.append(" Java");
        System.out.println(stringBuilder);
        stringBuilder.replace(1,2,"jio");
        System.out.println(stringBuilder);

//        StringBuffer stringBuffer = new StringBuffer("Morning");
//        stringBuffer.

             
    }
}
