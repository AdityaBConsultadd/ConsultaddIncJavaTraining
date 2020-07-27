package DAY6;

public class StaticDemo {
    static {
        System.out.println("hello this is static");
    }
    static int a=10;
    static class Demo{
        int b=15;
        void display(){
            System.out.println(b);
        }
    }
    public static void main(String[] args) {
        StaticDemo.Demo demo = new StaticDemo.Demo();
        demo.display();
        display();
        System.out.println(a);

    }
    static void display(){
        System.out.println(a);
    }
}
