package DAY7;

class A{
    int a=10;
}
class B extends A{
    protected int b=20;
}
class C extends B{
    int c=30;
    int sum= a+b+c;
    public void add(){

        System.out.println(sum);
    }
}
public class TypesOfInherit {

    public static void main(String[] args) {
        C c = new C();
        c.add();

    }

}
