package DAY3;

public class Operate {
    public static void main(String[] args) {
        //Operators
        //unary
        int a=35;
        //++
//        System.out.println(a);
//        System.out.println(a++);//a=36
//        System.out.println(++a);
        //--
//        System.out.println(a);
//        System.out.println(a--);//a=34
//        System.out.println(--a);//33
        //(~)
//        int x=(~a);
//        System.out.println(x);
//        //binary
//        //a
//        int b = 34;
//        // add
//        System.out.println(a+b);
//        // sub
//        System.out.println(a-b);
//        // multi
//        System.out.println(a*b);
//        //div
//        System.out.println(a/b);
//        //mod
//        System.out.println(a%b);
        //relational
        //>,<,<=,>=,==,!=
//        boolean bool = a>b;
//        System.out.println(bool);
        //logical
        //&&,||
        int num1=12,num2=3,num3=4;
//        if(num1>num2&&num3<num2)
//            System.out.println("yes");
//        else if(num1>num2||num2>num3)
//            System.out.println("no");
        //ternary
//        int x=(num1>num2)?12:4;
//        System.out.println(x);
//
//        //assignment
//        int c =2;
//        c+=2;//c=c+2
//        c-=2;

        //===

        //bitwise 
        //bitwise AND & 12=  1100  0011
        int x= num1 & num2;
        System.out.println(x) ;
        //bitwise OR ^
        x = num1 ^ num2;
        System.out.println(x);
        //bitwise |
        x = num1 | num2;
        System.out.println(x);
        //signed shift right
        x= a>>2;
        System.out.println(x);
        //unsigned shift right
        x= a>>>2;
        System.out.println(x);

        // signed shift left <<

    }

}
