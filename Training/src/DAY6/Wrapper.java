package DAY6;



public class Wrapper {
    //int, byte short
//    Integer


    public static void main(String[] args) {
        int a = 10;//pre
        Integer integer = 11;//obj
        System.out.println(a);
        System.out.println(integer);
        System.out.println(a==integer);

        //equals()
        System.out.println(integer.equals(a));
        String s= "Hello";
        String s1 = "Hello";
        int x= s.hashCode();
        int x1= s1.hashCode();
        System.out.println(x+" "+x1);
        //hashcode()

    }



}
