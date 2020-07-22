package DAY3;

import java.util.Scanner;

public class DataType {

    public static void main(String[] args) {
        //Data-type
        //pre
        //boolean
        boolean bool = true;
        //numeric
        //byte -128 to 127 2^8  1
        byte by = 127;
        //short 2^16 2
        short sh=45;
        //int   2^32  4
        int is=34;
        //long  64  8
        long l=36L;

        //floatiing point
        // float
        float fl= 34.5F;
        //double
        double doub=234.3d;


        // char
        char ch= 'a';

        Scanner in = new Scanner(System.in);
//
//        System.out.println("byte");
//        byte b2= in.nextByte();
//        System.out.println(b2);
//        System.out.println("short");
//        short s2= in.nextShort();
//        System.out.println(s2);
//        System.out.println("int");
//        int is2= in.nextInt();
//        System.out.println("long");
//        long l2 = in.nextLong();
//        System.out.println(is2+""+l2);

        //float
        float fl2 =in.nextFloat();

        //double
        double doub2=in.nextDouble();

        //string
        String s= in.nextLine();
        while(in.hasNext()){
            in.nextLine();
        }
        //char
        char c= in.nextLine().charAt(0);

        System.out.println(fl2+" "+doub2+" "+s+ " " + c);


    }
}
