package DAY8;

abstract class Person{
    String name;
    int age;
     void sleep(){
        System.out.println("I am sleeping");
    }
    void eat(){
        System.out.println("i am eating");
    }
    abstract void work();
//    {
//        System.out.println("hey i am working");
//    }
}
class Student extends Person{

    @Override
    void work() {
        System.out.println("I study");
    }
}
class Programmer extends Person{

    @Override
    void work() {
        System.out.println("I code");
    }
}


public class AbstClas {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Student student = new Student();
        programmer.work();
        programmer.eat();
        student.eat();
        student.work();

    }
}
