package DAY11;
//functional interface
interface A{
    public void hello(int x);

}
class B implements A{

    @Override
    public void hello(int x) {
        x=x*x;
        System.out.println(x);
    }
}
public class Lambda {
    public static void main(String[] args) {
        A a=(int x)-> {System.out.println("Hey this is lambda");
        x=x*x;
            System.out.println(x);};

        a.hello(6);
    }
}
