package DAY5;

public class Methods {
    public static void main(String[] args) {
        Methods methods =new Methods();
        methods.area(8);
        methods.area(7,8);

    }
    int area(int a){
        System.out.println("square");
        return a*a;
    }
    int area(int l , int b){
        System.out.println("hi this is a rectangle");
        return l*b;
    }
    //methods
    //without return and without parameters
//    void meth1(){
//
//    }
////        without return and parameters
//    void meth2(int a){
//
//    }//        with return and without parameters
//    int meth3(){
//        return 6;
//    }
////        with return and with parameters
//    int meth4(int a){
//        return a;


}
