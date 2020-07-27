package DAY5;

public class Example {

    public static void main(String[] args) {
        Hello2 hello = new Hello2();
        hello.setA(8);
        hello.setB(7);
        hello.setName("Riyaz");

        System.out.println("My name is "+hello.getName()+" and i have an exp. of "+hello.getA());


    }
}
class Hello2{
    int a;
    int b;
    String name;
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String getName() {
        return name;
    }


}
