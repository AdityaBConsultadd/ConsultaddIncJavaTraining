package DAY8;

interface X{
    public void show();
}
interface Y extends X{
    void display(int a);
}
interface Z extends Y{
    void display();
}
class Single implements Y,Z{

    @Override
    public void show() {
        System.out.println("hey");
    }

    @Override
    public void display() {
        System.out.println("hello");
    }

    @Override
    public void display(int a) {
        System.out.println(a);
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Single single = new Single();
        single.display();
        single.show();
    }
}
