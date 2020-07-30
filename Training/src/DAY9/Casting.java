package DAY9;

class A{
    void show(){
        System.out.println("A");
    }
}
class B extends A{
    void display(){
        System.out.println("B");
    }
}
class C extends B{
    void disp() {
        System.out.println("C");
    }
}

public class Casting {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        c.disp();
        c.display();
        c.show();
        A a1 = new B(); // up casting

        a1.show();

        ((C)a).show();//down casting

    }
}
