package DAY5;

import java.util.Scanner;

public class Constructor {
    public static void main(String[] args) {
        //default constructer
        //parametrized
        Scanner in = new Scanner(System.in);
        Call call = new Call();
        System.out.println(call.a);
        System.out.println(call.b);
        Call add= new Call(in.nextInt(),8);
        Call sub= new Call(7f,8f);

    }
}

class Call{
    int a=15;
    int b=10;
    Call(){
        a =10;
        b= 15;
//        System.out.println("hello");
//        System.out.println(a);
//        System.out.println(b);
    }
    Call(int a, int b){
        System.out.println(a+b);
    }
    Call(float a,float b){
        System.out.println(a-b);
    }
}
