package DAY8;

interface A{
     void show();
    interface D{
        void method();
    }
}
interface B  {
    static void show(){
        System.out.println("hello");
    };
}
class C implements A,A.D,B{
    @Override
    public void show(){
        System.out.println("Hi");
    }
    @Override
    public void method(){
        System.out.println("this is a nested interface");
    }
}

public class Types {
    public static void main(String[] args) {
        C c= new C();
        c.show();
        c.method();
    }
}
